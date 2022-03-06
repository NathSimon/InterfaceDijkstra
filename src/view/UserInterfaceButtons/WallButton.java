package view.UserInterfaceButtons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.* ;

import model.appModel.AppModel;
import view.SaveFrame.*;
import view.UserInterfaceButtons.*;
import view.UserInterfaceMenus.*;
import view.UserInterface.*;


/**
 * @author Nathanael
 *
 */
public class WallButton extends JButton {

	private static final long serialVersionUID = 1L;
	
	private final MazeApp mazeApp ;
	private final AppModel appModel;
	
	public WallButton(MazeApp mazeApp, WindowPanel windowPanel)
	{
		super("Wall / Empty") ; // Button's text
		this.mazeApp = mazeApp ;
		this.appModel = this.mazeApp.getAppModel();
				
		addActionListener(new ActionListener(){  
				public void actionPerformed(ActionEvent e){  
					appModel.setValueOfMouse(1);
					windowPanel.getButtonPanelMaze().updateBlockType(); //mise a jour de linfo user sur le block selectionne

				}}); 
		
	}
	
	public void update() {
		//rien a mettre a jour
	}
}

