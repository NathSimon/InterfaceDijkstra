package UserInterface;

import java.awt.*;
import javax.swing.* ;

public class ButtonPanelSolve extends JPanel
{
	private final ResetButton resetButton;
	private final SolveButton solveButton;
	private final ModeButton modeButton;
	private final ColorBorderButton colorBorderButton;
	private Container gridLayout;
	
	public ButtonPanelSolve(DrawingApp drawingApp, GridMazePanel gridMazePanel, WindowPanel windowPanel)
	{	
		gridLayout = new Container();
		setLayout(new GridLayout(3,1)) ; // 1 row, 3 columns
		gridLayout.setLayout(new GridLayout(1,2)) ;
		gridLayout.add(modeButton   = new ModeButton(drawingApp));
		gridLayout.add(colorBorderButton = new ColorBorderButton(drawingApp));
		add(gridLayout);
		add(solveButton   = new SolveButton(drawingApp, gridMazePanel));
		add(resetButton = new ResetButton(drawingApp, windowPanel, gridMazePanel));
	}
	
	public SolveButton getSolveButton() {
		return solveButton;
	}
	
	public ColorBorderButton getColorBorderButton() {
		return colorBorderButton;
	}
	
	public ResetButton getResetButton() {
		return resetButton;
	}
	
	public ModeButton getModeButton() {
		return modeButton;
	}
	
}

