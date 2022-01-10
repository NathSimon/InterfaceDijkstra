package UserInterface;
import java.awt.Dimension;

import javax.swing.* ;

public class DrawingApp extends JFrame
{

	private static final long serialVersionUID = 1L;
	private DrawingMenuBar drawingMenuBar;
	private WindowPanel windowPanel;
	
	public DrawingApp()
	   {
	      super("Maze solver") ; // Window title
	      
			
	      setContentPane(windowPanel = new WindowPanel(this)) ;
	      setJMenuBar(drawingMenuBar = new DrawingMenuBar(this, windowPanel, windowPanel.getGridMazePanel())) ;
	      
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ; // Explicit !
	      
	      setPreferredSize(new Dimension(1000, 600));
	  	  pack();
	      //setExtendedState(JFrame.MAXIMIZED_BOTH);     
	      setVisible(true) ;  // The great show
	   }
	
	public WindowPanel getWindowPanel() {
		return windowPanel;
	}
	
	public DrawingMenuBar getDrawingMenuBar() {
		return drawingMenuBar;
	}
	
	public void closeFrame() {
		setVisible(false);
		dispose(); 
	}
}