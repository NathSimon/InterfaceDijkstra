package UserInterface;

import java.awt.*;
import javax.swing.* ;

public class GridMazePanel extends JPanel
{

	public GridMazePanel(DrawingApp drawingApp,WindowPanel windowPanel, int rowLen, int colLen)
	{
		int i = 0;
		GridLayout grid = new GridLayout(rowLen, colLen); 
		setLayout(grid) ; // 1 row, 3 columns
		
		while(i < rowLen * colLen) {
			add(new GridMazeButton(drawingApp, windowPanel, i));
			i++;
		}
	}
}