package UserInterfaceMenus;

import javax.swing.* ;

import UserInterface.DrawingApp;

public class QuitMenuItem extends JMenuItem
{

	private static final long serialVersionUID = 1L;

	private final DrawingApp drawingApp ;

	public QuitMenuItem(DrawingApp drawingApp)
	{
		super("Quit") ; // Text of menu item

		this.drawingApp = drawingApp ;
	}

}