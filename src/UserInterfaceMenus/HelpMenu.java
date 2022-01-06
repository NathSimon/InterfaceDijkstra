package UserInterfaceMenus;

import javax.swing.* ;

import UserInterface.DrawingApp;

public class HelpMenu extends JMenu
{

	private static final long serialVersionUID = 1L;
	private final HelpMenuItem helpMenuItem;

	public HelpMenu(DrawingApp drawingApp)
	{
		super("Help") ; // Text of the menu

      // Create and add menu items
		add(helpMenuItem = new HelpMenuItem(drawingApp));
	}
}