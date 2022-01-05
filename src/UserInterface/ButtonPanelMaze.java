package UserInterface;

import java.awt.*;
import javax.swing.* ;

public class ButtonPanelMaze extends JPanel
{
	private final MazeButtons mazeButtons;
	private final SizeButtons sizeButtons;
	private final ButtonPanelSolve buttonPanelSolve;
	private JLabel labelSelect;
	private JLabel labelBlocktype;
	private JLabel labelSize;
		
	public ButtonPanelMaze(DrawingApp drawingApp, WindowPanel windowPanel, GridMazePanel gridMazePanel)
	{
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS)) ;
		
		setAlignmentX(JComponent.CENTER_ALIGNMENT);
		
		add(Box.createRigidArea(new Dimension(0,10)));
		add(labelSelect = new JLabel("SELECT A BOX TYPE"));
		labelSelect.setAlignmentX(JComponent.CENTER_ALIGNMENT);
		add(Box.createRigidArea(new Dimension(0,10)));
		
		add(mazeButtons = new MazeButtons(drawingApp, windowPanel));
		add(labelBlocktype = new JLabel("Selected : " + mazeButtons.getBlockType()));
		labelBlocktype.setAlignmentX(JComponent.CENTER_ALIGNMENT);
		add(Box.createRigidArea(new Dimension(0, 100)));
		
		add(labelSize = new JLabel("ENTER THE MAZE SIZE"));
		labelSize.setAlignmentX(JComponent.CENTER_ALIGNMENT);
		add(Box.createRigidArea(new Dimension(0,10)));
		add(sizeButtons = new SizeButtons(drawingApp, windowPanel, gridMazePanel));
		add(Box.createRigidArea(new Dimension(0,0)));
		
		add(Box.createVerticalGlue());
		add(buttonPanelSolve = new ButtonPanelSolve(drawingApp, gridMazePanel, windowPanel));
		
	}
	
	public SolveButton getSolveButton() {
		return buttonPanelSolve.getSolveButton();
	}
	
	public ModeButton getModeButton() {
		return buttonPanelSolve.getModeButton();
	}
	
	public MazeButtons getMazeButtons() {
		return mazeButtons;
	}
	
	public void updateBlockType() {
		labelBlocktype.setText("Selected : " + mazeButtons.getBlockType());
	}
}

