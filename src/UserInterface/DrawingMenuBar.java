package UserInterface;

import javax.swing.* ;

import UserInterfaceMenus.DisplayMenu;
import UserInterfaceMenus.FileMenu;
import UserInterfaceMenus.HelpMenu;
import UserInterfaceMenus.MazeMenu;

public class DrawingMenuBar extends JMenuBar
{

	private static final long serialVersionUID = 1L;
	
	private final FileMenu fileMenu;
	private final MazeMenu	mazeMenu;
	private final DisplayMenu displayMenu;
	private final HelpMenu	helpMenu;
	
	
	public DrawingMenuBar(DrawingApp drawingApp, WindowPanel windowPanel, GridMazePanel gridMazePanel)
	{
		super() ;
		
		// Create and add menus
		add(fileMenu = new FileMenu(drawingApp)) ;
		add(mazeMenu = new MazeMenu(drawingApp, windowPanel, gridMazePanel)) ;
		add(displayMenu = new DisplayMenu(drawingApp)) ;
		add(helpMenu = new HelpMenu(drawingApp)) ;
	}

	public FileMenu getFileMenu() {
		return fileMenu;
	}


	public MazeMenu getMazeMenu() {
		return mazeMenu;
	}


	public DisplayMenu getDisplayMenu() {
		return displayMenu;
	}


	public HelpMenu getHelpMenu() {
		return helpMenu;
	}
}