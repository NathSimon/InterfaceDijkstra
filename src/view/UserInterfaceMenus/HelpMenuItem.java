package view.UserInterfaceMenus;
import javax.swing.* ;

import view.SaveFrame.*;
import view.UserInterfaceButtons.*;
import view.UserInterfaceMenus.*;
import view.UserInterface.*;

/**
 * @author Nathanael
 *
 */
public class HelpMenuItem extends JMenuItem
{
	private static final long serialVersionUID = 1L;

	private final MazeApp mazeApp ;

	public HelpMenuItem(MazeApp mazeApp)
	{
		super("Help") ; // Text of menu item

		this.mazeApp = mazeApp ;
	}
}