package view.SaveFrame;
import java.awt.Dimension;

import view.UserInterface.*;
import view.UserInterfaceMenus.*;
import view.UserInterfaceButtons.*;

import view.SaveFrame.*;

import javax.swing.* ;



public class ImportApp extends JFrame
{

	private static final long serialVersionUID = 1L;
	private ImportPanel importPanel;
	private MazeApp mazeApp;

	public ImportApp(MazeApp mazeApp)
	   {
	      super("Maze solver") ; // Window title
	      
	      this.mazeApp = mazeApp;
	      
	      setContentPane(importPanel = new ImportPanel(this, mazeApp)) ;
	      
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