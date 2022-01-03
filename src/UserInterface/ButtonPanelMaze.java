package UserInterface;

import java.awt.*;
import javax.swing.* ;

public class ButtonPanelMaze extends JPanel
{
	private final MazeButtons mazeButtons;
	private final ResetButton resetButton;
	private final SolveButton solveButton;
	private final SizeButtons sizeButtons;
	private final ModeButton modeButton;
		
	public ButtonPanelMaze(DrawingApp drawingApp, WindowPanel windowPanel, GridMazePanel gridMazePanel)
	{
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS)) ; // 1 row, 3 columns
		
		add(mazeButtons = new MazeButtons(drawingApp, windowPanel));
		add(Box.createRigidArea(new Dimension(0, 30)));
		add(sizeButtons = new SizeButtons(drawingApp, windowPanel, gridMazePanel));
		add(Box.createRigidArea(new Dimension(0,0)));
		add(Box.createVerticalGlue());
		add(modeButton   = new ModeButton(drawingApp));
		add(solveButton   = new SolveButton(drawingApp, windowPanel.getGridMazePanel())) ;
		add(resetButton = new ResetButton(drawingApp, windowPanel, gridMazePanel));
		
	}
	
	public SolveButton getSolveButton() {
		return solveButton;
	}
	
	public ModeButton getModeButton() {
		return modeButton;
	}
	
	public MazeButtons getMazeButtons() {
		return mazeButtons;
	}
}

