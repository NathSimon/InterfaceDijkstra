package UserInterface;

import java.awt.*;
import javax.swing.* ;

public class ButtonPanelSolve extends JPanel
{
	private final ResetButton resetButton;
	private final SolveButton solveButton;
	
	public ButtonPanelSolve(DrawingApp drawingApp, GridMazePanel gridMazePanel, WindowPanel windowPanel)
	{
		setLayout(new GridLayout(1,2)) ; // 1 row, 3 columns
	
		add(resetButton = new ResetButton(drawingApp, windowPanel, gridMazePanel)) ;
		add(solveButton   = new SolveButton(drawingApp, gridMazePanel)) ;
	}
}

