package UserInterface;

import java.awt.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;

import javax.swing.* ;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import Maze.ABox;
import Maze.DBox;
import Maze.EBox;
import Maze.MazeReadingException;
import Maze.WBox;
import UserInterfaceButtons.GridMazeButton;

public class GridMazePanel extends JPanel
{
	private int rowLen;
	private int colLen;
	private DrawingApp drawingApp;
	private WindowPanel windowPanel;
	private Color baseButtonColor;
	private Border baseLineBorder;
	
	ArrayList<GridMazeButton> buttonList = new ArrayList<GridMazeButton>();

	public GridMazePanel(DrawingApp drawingApp,WindowPanel windowPanel, int rowLen, int colLen)
	{
		this.drawingApp = drawingApp;
		this.windowPanel = windowPanel;
		
		int i = 0;
		this.rowLen = rowLen;
		this.colLen = colLen;
		GridLayout grid = new GridLayout(this.rowLen, this.colLen); 
		setLayout(grid) ; // 1 row, 3 columns
		
		while(i < rowLen * colLen) {
			GridMazeButton gridTmp = new GridMazeButton(drawingApp, windowPanel, i);
			gridTmp.setBorder(new LineBorder(Color.GRAY));
			add(gridTmp);
			buttonList.add(gridTmp);
			i++;
		}		
	}

	public int getRowLen() {
		return rowLen;
	}

	public void setRowLen(int rowLen) {
		this.rowLen = rowLen;
	}

	public int getColLen() {
		return colLen;
	}

	public void setColLen(int colLen) {
		this.colLen = colLen;
	}

	public GridMazeButton getMazeButton(int index) { 
			return buttonList.get(index);
	}
	
	public int setButtonsBorder(int color) {
		for(int i = 0; i < buttonList.size(); i++) {
			if(color == 1 ) {
				buttonList.get(i).setBorder(new LineBorder(Color.BLACK));
			}
			else if(color == 0 ) {
				buttonList.get(i).setBorder(new LineBorder(Color.GRAY));
			}
		}
		if (color == 1) {
			return 0;
		}
		return 1;
	}
	
	public final void initFromTextFile(String fileName) throws IOException, MazeReadingException {
		int i = 0;
		int j = 0;
		int totalCount = 0;
		int arrivalCount = 0;
		int departureCount = 0;
		 
		Reader reader = new FileReader(fileName);
	    // Create a BufferedReader with buffer array size of 16384 (32786 bytes = 32 KB).
	    try(BufferedReader br = new BufferedReader(reader, 16384)) {

		    String line = null;
			
			
		    while((line = br.readLine())!= null) {
		        j = 0;
				while (j < line.length()) {
					char c = line.charAt(j);
					switch (c) {
					case('W') : this.buttonList.get(totalCount).setLabel("W");
						break;
					case('E') : this.buttonList.get(totalCount).setLabel("E");
						break;
					case('D') : this.buttonList.get(totalCount).setLabel("D");
								this.buttonList.get(totalCount).setText("Departure");
								departureCount++;
						break;
					case('A') : this.buttonList.get(totalCount).setLabel("A");
								this.buttonList.get(totalCount).setText("Arrival");
								arrivalCount++;
						break;
					case('P') : this.buttonList.get(totalCount).setLabel("P");
						break;
					default : throw new MazeReadingException(fileName, i, "Invalid charactere in file at line : " + i);
					}
					if(j > getColLen()) {
						new MazeReadingException(fileName, i, "Invalid size of column at column : " + j);
					}
					totalCount++;
					j++;
				}
				if(i > getRowLen()) {
					new MazeReadingException(fileName, i, "Invalid size of column at row : " + i);
				}
				i++;
		    }
		    br.close();
	    } catch(FileNotFoundException error) {
	    	error.getStackTrace();
	    }
	    if(arrivalCount != 1) {
	    	throw new MazeReadingException(fileName, i, "Invalid number of arrival in maze : " + arrivalCount + ". There should be only one");
	    }
	    if(departureCount != 1) {
	    	throw new MazeReadingException(fileName, i, "Invalid number of arrival in maze : " + departureCount + ". There should be only one");
	    }
	}
	
}