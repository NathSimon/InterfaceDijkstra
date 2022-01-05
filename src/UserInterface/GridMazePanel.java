package UserInterface;

import java.awt.*;
import java.util.ArrayList;

import javax.swing.* ;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

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
	
}