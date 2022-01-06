package UserInterfaceMenus;

import javax.swing.* ;

import UserInterface.DrawingApp;

public class FileMenu extends JMenu
{

	private static final long serialVersionUID = 1L;
	private final QuitMenuItem quitMenuItem ;
	private final SaveMenuItem saveMenuItem ;
	private final ImportMenuItem importMenuItem ;

	public FileMenu(DrawingApp drawingApp)
	{
		super("File") ; // Text of the menu

      // Create and add menu items
		add(importMenuItem = new ImportMenuItem(drawingApp));
		add(saveMenuItem = new SaveMenuItem(drawingApp));
		add(quitMenuItem = new QuitMenuItem(drawingApp));
		
	}

}
