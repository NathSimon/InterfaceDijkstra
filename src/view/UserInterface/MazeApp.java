package view.UserInterface;
import java.awt.Dimension;

import javax.swing.* ;

import view.SaveFrame.*;
import view.UserInterfaceButtons.*;
import view.UserInterfaceMenus.*;
import view.UserInterface.*;

public class MazeApp extends JFrame
{

	private static final long serialVersionUID = 1L;
	private MazeMenuBar mazeMenuBar;
	private WindowPanel windowPanel;
	
	public MazeApp()
	   {
	      super("Maze solver") ; // Window title
	      
			
	      setContentPane(windowPanel = new WindowPanel(this)) ;
	      setJMenuBar(mazeMenuBar = new MazeMenuBar(this, windowPanel, windowPanel.getGridMazePanel())) ;
	      
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ; // Explicit !
	      
	      setPreferredSize(new Dimension(1000, 600));
	  	  pack();
	      //setExtendedState(JFrame.MAXIMIZED_BOTH);     
	      setVisible(true) ;  // The great show
	   }
	
	public WindowPanel getWindowPanel() {
		return windowPanel;
	}
	
	public MazeMenuBar getMazeMenuBar() {
		return mazeMenuBar;
	}
	
	public void closeFrame() {
		setVisible(false);
		dispose(); 
	}
}