package UserInterface;

import java.awt.*;
import java.util.ArrayList;

import javax.swing.* ;

public class GridMazePanel extends JPanel
{
	private int rowLen;
	private int colLen;
	private DrawingApp drawingApp;
	private WindowPanel windowPanel;
	
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
	
}