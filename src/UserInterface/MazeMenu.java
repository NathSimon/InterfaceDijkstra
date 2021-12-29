package UserInterface;
import javax.swing.* ;

public class MazeMenu extends JMenu
{

	private static final long serialVersionUID = 1L;
	private final SolveMenuItem solveMenuItem ;
	private final ResetMenuItem resetMenuItem ;

	public MazeMenu(DrawingApp drawingApp)
	{
		super("Maze") ; // Text of the menu

      // Create and add menu items
		add(solveMenuItem = new SolveMenuItem(drawingApp));
		add(resetMenuItem = new ResetMenuItem(drawingApp));

	}

}
