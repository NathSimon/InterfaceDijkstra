package UserInterface;
import javax.swing.* ;

public class MinimizeMenuItem extends JMenuItem
{
	private static final long serialVersionUID = 1L;

	private final DrawingApp drawingApp ;

	public MinimizeMenuItem(DrawingApp drawingApp)
	{
		super("Minimize") ; // Text of menu item

		this.drawingApp = drawingApp ;
	}
}
