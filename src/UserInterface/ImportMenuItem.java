package UserInterface;

import javax.swing.* ;

public class ImportMenuItem extends JMenuItem
{

	private static final long serialVersionUID = 1L;

	private final DrawingApp drawingApp ;

	public ImportMenuItem(DrawingApp drawingApp)
	{
		super("Import Maze") ; // Text of menu item

		this.drawingApp = drawingApp ;
	}

}
