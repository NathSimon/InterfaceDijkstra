package UserInterface;

import javax.swing.* ;

public class ResetMenuItem extends JMenuItem
{

	private static final long serialVersionUID = 1L;

	private final DrawingApp drawingApp ;

	public ResetMenuItem(DrawingApp drawingApp)
	{
		super("Reset") ; // Text of menu item

		this.drawingApp = drawingApp ;
	}

}
