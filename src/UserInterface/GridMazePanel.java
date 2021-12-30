package UserInterface;

import java.awt.*;
import javax.swing.* ;

public class GridMazePanel extends JPanel
{

	public GridMazePanel(DrawingApp drawingApp, int rowLen, int colLen)
	{
		int i = 0;
		setLayout(new GridLayout(rowLen, colLen)) ; // 1 row, 3 columns
		
		while(i < rowLen * colLen) {
			add(new GridMazeButton(drawingApp));
			i++;
		}
	}
}