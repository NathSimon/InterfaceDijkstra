package view.UserInterfaceMenus;

import javax.swing.* ;

import view.SaveFrame.*;
import view.UserInterfaceButtons.*;
import view.UserInterfaceMenus.*;
import view.UserInterface.*;

public class DisplayMenu extends JMenu
{

	private static final long serialVersionUID = 1L;
	private final FullscreenMenuItem fullscreenMenuItem ;
	private final MinimizeMenuItem minimizeMenuItem ;
	private final BorderMenuItem borderMenuItem;
	

	public DisplayMenu(MazeApp mazeApp)
	{
		super("Display") ; // Text of the menu

      // Create and add menu items
		add(borderMenuItem = new BorderMenuItem(mazeApp));
		add(fullscreenMenuItem = new FullscreenMenuItem(mazeApp));
		add(minimizeMenuItem = new MinimizeMenuItem(mazeApp));

	}

	public FullscreenMenuItem getFullscreenMenuItem() {
		return fullscreenMenuItem;
	}

	public BorderMenuItem getBorderMenuItem() {
		return borderMenuItem;
	}

}
