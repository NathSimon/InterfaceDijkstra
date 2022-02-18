package view.UserInterface;

import java.awt.*;
import javax.swing.* ;

import view.SaveFrame.*;
import view.UserInterfaceButtons.*;
import view.UserInterfaceMenus.*;
import view.UserInterface.*;

public class ButtonPanelMaze extends JPanel
{
	private final MazeButtons mazeButtons;
	private final SizeButtons sizeButtons;
	private final ButtonPanelSolve buttonPanelSolve;
	private JLabel labelSelect;
	private JLabel labelBlocktype;
	private JLabel labelSize;
		
	public ButtonPanelMaze(MazeApp mazeApp, WindowPanel windowPanel, GridMazePanel gridMazePanel)
	{
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS)) ;
		
		setAlignmentX(JComponent.CENTER_ALIGNMENT);
		
		add(Box.createRigidArea(new Dimension(0,10)));
		add(labelSelect = new JLabel("SELECT A BOX TYPE"));
		labelSelect.setAlignmentX(JComponent.CENTER_ALIGNMENT);
		add(Box.createRigidArea(new Dimension(0,10)));
		
		add(mazeButtons = new MazeButtons(mazeApp, windowPanel));
		add(labelBlocktype = new JLabel("Selected : " + mazeButtons.getBlockType()));
		labelBlocktype.setAlignmentX(JComponent.CENTER_ALIGNMENT);
		add(Box.createRigidArea(new Dimension(0, 50)));
		
		add(labelSize = new JLabel("ENTER THE MAZE SIZE"));
		labelSize.setAlignmentX(JComponent.CENTER_ALIGNMENT);
		add(labelSize = new JLabel("must be between 4 and 100"));
		labelSize.setAlignmentX(JComponent.CENTER_ALIGNMENT);
		add(Box.createRigidArea(new Dimension(0,10)));
		add(sizeButtons = new SizeButtons(mazeApp, windowPanel, gridMazePanel));
		add(Box.createRigidArea(new Dimension(0,0)));
		
		add(Box.createVerticalGlue());
		
		add(labelSize = new JLabel("AUTOMATIC"));
		labelSize.setAlignmentX(JComponent.CENTER_ALIGNMENT);
		
		add(labelSize = new JLabel("Solves automaticly"));
		labelSize.setAlignmentX(JComponent.CENTER_ALIGNMENT);
		
		add(Box.createRigidArea(new Dimension(0,10)));
		
		add(labelSize = new JLabel("MANUAL"));
		labelSize.setAlignmentX(JComponent.CENTER_ALIGNMENT);
		
		add(labelSize = new JLabel("Solves with button"));
		labelSize.setAlignmentX(JComponent.CENTER_ALIGNMENT);
		
		add(Box.createRigidArea(new Dimension(0,40)));
		
		add(labelSize = new JLabel("CLICK TO SWITCH"));
		labelSize.setAlignmentX(JComponent.CENTER_ALIGNMENT);
		
		add(buttonPanelSolve = new ButtonPanelSolve(mazeApp, gridMazePanel, windowPanel));
		
	}
	
	public SolveButton getSolveButton() {
		return buttonPanelSolve.getSolveButton();
	}
	
	public ModeButton getModeButton() {
		return buttonPanelSolve.getModeButton();
	}
	
	public ButtonPanelSolve getButtonPanelSolve() {
		return buttonPanelSolve;
	}
	
	public MazeButtons getMazeButtons() {
		return mazeButtons;
	}
	
	public void updateBlockType() {
		labelBlocktype.setText("Selected : " + mazeButtons.getBlockType());
	}
}

