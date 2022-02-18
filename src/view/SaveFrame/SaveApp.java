package view.SaveFrame;
import java.awt.Dimension;

import javax.swing.* ;

import view.SaveFrame.*;
import view.UserInterfaceButtons.*;
import view.UserInterfaceMenus.*;
import view.UserInterface.*;

public class SaveApp extends JFrame
{

	private static final long serialVersionUID = 1L;
	private SavePanel savePanel;

	public SaveApp(MazeApp drawinApp)
	   {
	      super("Maze solver") ; // Window title
	      
			
	      setContentPane(savePanel = new SavePanel(this, drawinApp)) ;
	      
	      setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE) ; // Explicit !
	      
	      setPreferredSize(new Dimension(300, 120));
	
	      pack();
	      setLocationRelativeTo(null);
	      setVisible(true);
	   }
	
	public void closeFrame() {
		setVisible(false);
		dispose(); 
	}
}