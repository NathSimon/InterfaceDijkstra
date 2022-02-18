package view.UserInterfaceMenus;

import javax.swing.* ;

import view.SaveFrame.*;
import view.UserInterfaceButtons.*;
import view.UserInterfaceMenus.*;
import view.UserInterface.*;

public class FileMenu extends JMenu
{

	private static final long serialVersionUID = 1L;
	private final QuitMenuItem quitMenuItem ;
	private final SaveMenuItem saveMenuItem ;
	private final ImportMenuItem importMenuItem ;

	public FileMenu(MazeApp mazeApp)
	{
		super("File") ; // Text of the menu

      // Create and add menu items
		add(importMenuItem = new ImportMenuItem(mazeApp));
		add(saveMenuItem = new SaveMenuItem(mazeApp));
		add(quitMenuItem = new QuitMenuItem(mazeApp));
		
	}

}
