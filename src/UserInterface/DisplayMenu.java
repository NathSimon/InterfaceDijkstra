package UserInterface;

import javax.swing.* ;

public class DisplayMenu extends JMenu
{

	private static final long serialVersionUID = 1L;
	private final FullscreenMenuItem fullscreenMenuItem ;
	private final MinimizeMenuItem minimizeMenuItem ;
	private final BorderMenuItem borderMenuItem;

	public DisplayMenu(DrawingApp drawingApp)
	{
		super("Display") ; // Text of the menu

      // Create and add menu items
		add(borderMenuItem = new BorderMenuItem(drawingApp));
		add(fullscreenMenuItem = new FullscreenMenuItem(drawingApp));
		add(minimizeMenuItem = new MinimizeMenuItem(drawingApp));

	}

	public FullscreenMenuItem getFullscreenMenuItem() {
		return fullscreenMenuItem;
	}

	public MinimizeMenuItem getMinimizeMenuItem() {
		return minimizeMenuItem;
	}

	public BorderMenuItem getBorderMenuItem() {
		return borderMenuItem;
	}

}
