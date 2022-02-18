package view.UserInterfaceMenus;

import javax.swing.* ;

import view.SaveFrame.*;
import view.UserInterfaceButtons.*;
import view.UserInterfaceMenus.*;
import view.UserInterface.*;

public class HelpMenu extends JMenu
{

	private static final long serialVersionUID = 1L;
	private final HelpMenuItem helpMenuItem;

	public HelpMenu(MazeApp mazeApp)
	{
		super("Help") ; // Text of the menu

      // Create and add menu items
		add(helpMenuItem = new HelpMenuItem(mazeApp));
	}
}