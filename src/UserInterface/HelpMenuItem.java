package UserInterface;
import javax.swing.* ;

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