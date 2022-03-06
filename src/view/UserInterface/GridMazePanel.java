package view.UserInterface;

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

import model.Dijkstra.VertexInterface;
import model.Maze.ABox;
import model.Maze.DBox;
import model.Maze.EBox;
import model.Maze.MazeReadingException;
import model.Maze.WBox;
import model.appModel.AppModel;
import view.SaveFrame.*;
import view.UserInterfaceButtons.*;
import view.UserInterfaceMenus.*;
import view.UserInterface.*;

/**
 * @author Nathanael
 *
 */
public class GridMazePanel extends JPanel
{
	private int rowLen;
	private int colLen;
	private final MazeApp mazeApp;
	private final WindowPanel windowPanel;
	private Color baseButtonColor;
	private Border baseLineBorder;
	private final AppModel appModel;
	
	ArrayList<GridMazeButton> buttonList = new ArrayList<GridMazeButton>();

	public GridMazePanel(MazeApp mazeApp,WindowPanel windowPanel)
	{
		this.mazeApp = mazeApp;
		this.appModel = mazeApp.getAppModel();
		this.windowPanel = windowPanel;
		
		int i = 0;
		this.rowLen = appModel.getSizeRowInt();
		this.colLen = appModel.getSizeColInt();
		GridLayout grid = new GridLayout(this.rowLen, this.colLen); 
		setLayout(grid) ; // 1 row, 3 columns
		
		while(i < rowLen * colLen) {
			GridMazeButton gridTmp = new GridMazeButton(mazeApp, windowPanel);
			gridTmp.setBorder(new LineBorder(Color.GRAY));
			add(gridTmp);
			buttonList.add(gridTmp);
			i++;
		}		
	}

	public void setAllEmpty() {
		for(GridMazeButton button : buttonList) {
			button.setLabel("E");
			button.setText(null);
		}
	}
	
	public void setAllWall() {
		for(GridMazeButton button : buttonList) {
			button.setLabel("W");
			button.setText(null);
		}
	}

	public GridMazeButton getMazeButton(int index) { 
			return buttonList.get(index);
	}
	
	public String setButtonsBorder(String color) {
		for(int i = 0; i < buttonList.size(); i++) {
			if(color.equals("BLACK") ) {
				buttonList.get(i).setBorder(new LineBorder(Color.BLACK));
			}
			else if(color.equals("GREY") ) {
				buttonList.get(i).setBorder(new LineBorder(Color.GRAY));
			}
		}
		if (color.equals("GREY")) {
			return "BLACK";
		}
		return "GREY";
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
					if(j > appModel.getSizeColInt()) {
						new MazeReadingException(fileName, i, "Invalid size of column at column : " + j);
					}
					totalCount++;
					j++;
				}
				if(i > appModel.getSizeRowInt()) {
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
	
	public void notifyForUpdate() {
		//rien a update
	}

}