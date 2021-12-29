package UserInterface;

import javax.swing.* ;

public class SaveMenuItem extends JMenuItem
{

	private static final long serialVersionUID = 1L;

	private final DrawingApp drawingApp ;

	public SaveMenuItem(DrawingApp drawingApp)
	{
		super("Save to file") ; // Text of menu item

		this.drawingApp = drawingApp ;
	}

}