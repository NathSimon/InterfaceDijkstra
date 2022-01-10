package SaveFrame;
import java.awt.Dimension;

import javax.swing.* ;

public class SaveApp extends JFrame
{

	private static final long serialVersionUID = 1L;
	private SavePanel savePanel;

	public SaveApp()
	   {
	      super("Maze solver") ; // Window title
	      
			
	      setContentPane(savePanel = new SavePanel(this)) ;
	      
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ; // Explicit !
	      
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