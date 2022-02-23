package view.UserInterfaceButtons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.* ;

import model.appModel.AppModel;
import view.SaveFrame.*;
import view.UserInterfaceButtons.*;
import view.UserInterfaceMenus.*;
import view.UserInterface.*;


public class EmptyButton extends JButton {

	private final MazeApp mazeApp ;
	private final AppModel appModel;
	
	public EmptyButton(MazeApp mazeApp, WindowPanel windowPanel)
	{
		super("Empty") ; // Button's text
		this.mazeApp = mazeApp ;
		appModel = mazeApp.getAppModel();
		addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
		              appModel.setValueOfMouse(1);
				      windowPanel.getButtonPanelMaze().updateBlockType(); //mise a jour de linfo user sur le block selectionne
			}});		
	}
}
