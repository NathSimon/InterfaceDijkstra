package UserInterface;
import javax.swing.* ;

public class SolveMenuItem extends JMenuItem
{

	private static final long serialVersionUID = 1L;

	private final DrawingApp drawingApp ;

	public SolveMenuItem(DrawingApp drawingApp)
	{
		super("Solve") ; // Text of menu item

		this.drawingApp = drawingApp ;
	}

}