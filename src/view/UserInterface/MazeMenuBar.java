package view.UserInterface;

import javax.swing.* ;

import view.SaveFrame.*;
import view.UserInterfaceButtons.*;
import view.UserInterfaceMenus.*;
import view.UserInterface.*;

/**
 * @author Nathanael
 *
 */
public class MazeMenuBar extends JMenuBar
{

	private static final long serialVersionUID = 1L;
	
	private final FileMenu fileMenu;
	private final MazeMenu	mazeMenu;
	private final DisplayMenu displayMenu;
	private final HelpMenu	helpMenu;
	
	
	public MazeMenuBar(MazeApp mazeApp, WindowPanel windowPanel, GridMazePanel gridMazePanel)
	{
		super() ;
		
		// Create and add menus
		add(fileMenu = new FileMenu(mazeApp)) ;
		add(mazeMenu = new MazeMenu(mazeApp, windowPanel, gridMazePanel)) ;
		add(displayMenu = new DisplayMenu(mazeApp)) ;
		helpMenu = new HelpMenu(mazeApp);
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
	
	public void notifyForUpdate() {
		fileMenu.notifyForUpdate();
		mazeMenu.notifyForUpdate();
		//helpMenu.notifyForUpdate(); pas implenter dans la version finale
		displayMenu.notifyForUpdate();
	}
}