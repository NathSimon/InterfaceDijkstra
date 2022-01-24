package view.UserInterfaceMenus;
import javax.swing.* ;

import view.SaveFrame.*;
import view.UserInterfaceButtons.*;
import view.UserInterfaceMenus.*;
import view.UserInterface.*;

public class HelpMenuItem extends JMenuItem
{
	private static final long serialVersionUID = 1L;

	private final DrawingApp drawingApp ;

	public HelpMenuItem(DrawingApp drawingApp)
	{
		super("Help") ; // Text of menu item

		this.drawingApp = drawingApp ;
	}
}