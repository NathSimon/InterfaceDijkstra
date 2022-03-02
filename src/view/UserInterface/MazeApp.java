package view.UserInterface;
import java.awt.Dimension;

import javax.swing.* ;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import model.appModel.AppModel;
import view.SaveFrame.*;
import view.UserInterfaceButtons.*;
import view.UserInterfaceMenus.*;
import view.UserInterface.*;

public class MazeApp extends JFrame implements ChangeListener
{

	private static final long serialVersionUID = 1L;
	private MazeMenuBar mazeMenuBar;
	private WindowPanel windowPanel;
	private AppModel appModel;
	
	
	public MazeApp()
	   {
	      super("Maze solver");
	      
	      appModel = new AppModel();
	      appModel.addObserver(this);
	      
	      setContentPane(windowPanel = new WindowPanel(this));
	      setJMenuBar(mazeMenuBar = new MazeMenuBar(this, windowPanel, windowPanel.getGridMazePanel()));
	      
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	      
	      setPreferredSize(new Dimension(1000, 600));
	  	  pack();
    
	      setVisible(true) ;  
	   }

	public AppModel getAppModel() {
		return appModel;
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

	public void stateChanged(ChangeEvent e) {
		if(windowPanel != null) 
		windowPanel.notifyForUpdate();
		if(mazeMenuBar != null) 
		mazeMenuBar.notifyForUpdate();
	}
}