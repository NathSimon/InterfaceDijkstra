package UserInterface;

import java.awt.*;
import javax.swing.* ;

public class ButtonPanelSolve extends JPanel
{
	private final ResetButton resetButton;
	private final SolveButton solveButton;
	private final ModeButton modeButton;
	
	public ButtonPanelSolve(DrawingApp drawingApp, GridMazePanel gridMazePanel, WindowPanel windowPanel)
	{
		setLayout(new GridLayout(3,1)) ; // 1 row, 3 columns
	
		add(modeButton   = new ModeButton(drawingApp)) ;
		add(resetButton = new ResetButton(drawingApp, windowPanel, gridMazePanel)) ;
		add(solveButton   = new SolveButton(drawingApp, gridMazePanel)) ;
	}
	
	public SolveButton getSolveButton() {
		return solveButton;
	}
	
	public ResetButton getResetButton() {
		return resetButton;
	}
	
	public ModeButton getModeButton() {
		return modeButton;
	}
	
}

