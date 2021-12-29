package UserInterface;

import javax.swing.* ;

public class DrawingMenuBar extends JMenuBar
{

	private static final long serialVersionUID = 1L;
	
	private final FileMenu fileMenu;
	private final MazeMenu	mazeMenu;
	private final DisplayMenu displayMenu;
	private final HelpMenu	helpMenu;
	
	
	public DrawingMenuBar(DrawingApp drawingApp)
	{
		super() ;
		
		// Create and add menus
		add(fileMenu = new FileMenu(drawingApp)) ;
		add(mazeMenu = new MazeMenu(drawingApp)) ;
		add(displayMenu = new DisplayMenu(drawingApp)) ;
		add(helpMenu = new HelpMenu(drawingApp)) ;
		
		
	}
}