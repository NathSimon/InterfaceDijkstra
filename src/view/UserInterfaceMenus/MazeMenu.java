package view.UserInterfaceMenus;
import javax.swing.* ;

import view.SaveFrame.*;
import view.UserInterfaceButtons.*;
import view.UserInterfaceMenus.*;
import view.UserInterface.*;

public class MazeMenu extends JMenu
{

	private static final long serialVersionUID = 1L;
	private final SolveMenuItem solveMenuItem ;
	private final ResetMenuItem resetMenuItem ;
	private final AllWallMenuItem allWallMenuItem;
	private final AllEmptyMenuItem allEmptyMenuItem;

	public MazeMenu(MazeApp mazeApp, WindowPanel windowPanel, GridMazePanel gridMazePanel)
	{
		super("Maze") ; // Text of the menu

      // Create and add menu items
		add(allWallMenuItem = new AllWallMenuItem(mazeApp));
		add(allEmptyMenuItem = new AllEmptyMenuItem(mazeApp));
		add(solveMenuItem = new SolveMenuItem(mazeApp, gridMazePanel));
		add(resetMenuItem = new ResetMenuItem(mazeApp, windowPanel, gridMazePanel));
		

	}

	public SolveMenuItem getSolveMenuItem() {
		return solveMenuItem;
	}

	public ResetMenuItem getResetMenuItem() {
		return resetMenuItem;
	}

	public void notifyForUpdate() {
		solveMenuItem.update();
		resetMenuItem.update();
		allWallMenuItem.update();
		allEmptyMenuItem.update();
	}
}
