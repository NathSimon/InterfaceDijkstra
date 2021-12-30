package UserInterface;

import java.awt.*;
import javax.swing.* ;

public class ButtonPanelMaze extends JPanel
{
	private final MazeButtons mazeButtons;
	private final ResetButton resetButton;
	private final SolveButton solveButton;
	private final SizeButtons sizeButtons;
	
	public ButtonPanelMaze(DrawingApp drawingApp, WindowPanel windowPanel)
	{
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS)) ; // 1 row, 3 columns
		
		add(mazeButtons = new MazeButtons(drawingApp, windowPanel));
		add(Box.createRigidArea(new Dimension(0, 80)));
		add(sizeButtons = new SizeButtons(drawingApp));
		add(Box.createRigidArea(new Dimension(0, 80)));
		add(Box.createVerticalGlue());
		add(solveButton   = new SolveButton(drawingApp)) ;
		add(resetButton = new ResetButton(drawingApp));
		
	}
}

