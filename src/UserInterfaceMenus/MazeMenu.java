package UserInterfaceMenus;
import javax.swing.* ;

import UserInterface.DrawingApp;
import UserInterface.GridMazePanel;
import UserInterface.WindowPanel;

public class MazeMenu extends JMenu
{

	private static final long serialVersionUID = 1L;
	private final SolveMenuItem solveMenuItem ;
	private final ResetMenuItem resetMenuItem ;

	public MazeMenu(DrawingApp drawingApp, WindowPanel windowPanel, GridMazePanel gridMazePanel)
	{
		super("Maze") ; // Text of the menu

      // Create and add menu items
		add(solveMenuItem = new SolveMenuItem(drawingApp, gridMazePanel));
		add(resetMenuItem = new ResetMenuItem(drawingApp, windowPanel, gridMazePanel));

	}

}
