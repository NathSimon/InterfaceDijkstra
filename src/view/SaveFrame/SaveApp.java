package view.SaveFrame;
import java.awt.Dimension;

import javax.swing.* ;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import model.appModel.AppModel;
import view.SaveFrame.*;
import view.UserInterfaceButtons.*;
import view.UserInterfaceMenus.*;
import view.UserInterface.*;

/**
 * @author Nathanael
 *
 */
public class SaveApp extends JFrame implements ChangeListener
{

	private static final long serialVersionUID = 1L;
	private final SavePanel savePanel;
	private final AppModel appModel;

	public SaveApp(MazeApp mazeApp)
	   {
	      super("Maze solver") ; // Window title
	      appModel = mazeApp.getAppModel();
	      
	      appModel.addObserver(this);
	      
	      setContentPane(savePanel = new SavePanel(this, mazeApp)) ;
	      
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

	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		
	}
}