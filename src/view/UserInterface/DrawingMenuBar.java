package view.UserInterface;

import javax.swing.* ;

import view.SaveFrame.*;
import view.UserInterfaceButtons.*;
import view.UserInterfaceMenus.*;
import view.UserInterface.*;

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
		helpMenu = new HelpMenu(drawingApp);
		//add(helpMenu); Pour l'instant cette fonctionnalité n'est pas implémentée.
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