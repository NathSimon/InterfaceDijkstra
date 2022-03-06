package view.UserInterface;

import java.awt.*;
import javax.swing.* ;

import view.SaveFrame.*;
import view.UserInterfaceButtons.*;
import view.UserInterfaceMenus.*;
import view.UserInterface.*;

/**
 * @author Nathanael
 *
 */
public class ButtonPanelSolve extends JPanel
{
	private final ResetButton resetButton;
	private final SolveButton solveButton;
	private final ModeButton modeButton;
	private final ColorBorderButton colorBorderButton;
	private Container gridLayout;
	
	public ButtonPanelSolve(MazeApp mazeApp, GridMazePanel gridMazePanel, WindowPanel windowPanel)
	{	
		gridLayout = new Container();
		setLayout(new GridLayout(4,1)) ; // 1 row, 3 columns
		gridLayout.setLayout(new GridLayout(1,2)) ;
		gridLayout.add(modeButton   = new ModeButton(mazeApp));
		colorBorderButton = new ColorBorderButton(mazeApp);
		colorBorderButton.setPreferredSize(getMinimumSize());
		gridLayout.add(colorBorderButton);
		add(gridLayout);
		add(Box.createRigidArea(new Dimension(0,0)));
		add(solveButton   = new SolveButton(mazeApp, gridMazePanel));
		add(resetButton = new ResetButton(mazeApp));
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
	
	public void notifyForUpdate() {
		resetButton.update();
		solveButton.update();
		modeButton.update();
		colorBorderButton.update();
	}
	
}

