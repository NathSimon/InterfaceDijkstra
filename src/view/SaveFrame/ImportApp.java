package view.SaveFrame;
import java.awt.Dimension;

import view.UserInterface.*;
import view.UserInterfaceMenus.*;
import view.UserInterfaceButtons.*;

import view.SaveFrame.*;

import javax.swing.* ;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import model.appModel.AppModel;



public class ImportApp extends JFrame implements ChangeListener
{

	private static final long serialVersionUID = 1L;
	private final ImportPanel importPanel;
	private final MazeApp mazeApp;
	private final AppModel appModel;

	public ImportApp(MazeApp mazeApp)
	   {
	      super("Maze solver") ; // Window title
	      
	      this.mazeApp = mazeApp;
	      appModel = mazeApp.getAppModel();
	      
	      appModel.addObserver(this);
	      
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

	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		
	}
}