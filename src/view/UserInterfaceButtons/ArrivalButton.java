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
public class ArrivalButton extends JButton {

	private final MazeApp mazeApp ;
	private final AppModel appModel;
	
	public ArrivalButton(MazeApp mazeApp, WindowPanel windowPanel)
	{
		super("Arrival") ; // Button's text
		appModel = mazeApp.getAppModel();
		addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
		              appModel.setValueOfMouse(4);
				      windowPanel.getButtonPanelMaze().updateBlockType(); //mise a jour de linfo user sur le block selectionne

			}}); 
		
		this.mazeApp = mazeApp ;
	}
	
	public void update() {
		//rien a mettre a jour
	}
}
