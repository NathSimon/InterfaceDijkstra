package UserInterface;

import javax.swing.* ;

public class DisplayMenu extends JMenu
{

	private static final long serialVersionUID = 1L;
	private final FullscreenMenuItem fullscreenMenuItem ;
	private final MinimizeMenuItem minimizeMenuItem ;

	public DisplayMenu(DrawingApp drawingApp)
	{
		super("Display") ; // Text of the menu

      // Create and add menu items
		add(fullscreenMenuItem = new FullscreenMenuItem(drawingApp));
		add(minimizeMenuItem = new MinimizeMenuItem(drawingApp));

	}

}
