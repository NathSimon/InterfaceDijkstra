package SaveFrame;
import java.awt.Dimension;

import javax.swing.* ;

import UserInterface.DrawingApp;

public class ImportApp extends JFrame
{

	private static final long serialVersionUID = 1L;
	private ImportPanel importPanel;

	public ImportApp(DrawingApp drawinApp)
	   {
	      super("Maze solver") ; // Window title
	      
			
	      setContentPane(importPanel = new ImportPanel(this, drawinApp)) ;
	      
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