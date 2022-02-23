package view.UserInterfaceButtons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.* ;

import model.Maze.MazeReadingException;
import model.appModel.AppModel;
import view.SaveFrame.*;
import view.UserInterfaceButtons.*;
import view.UserInterfaceMenus.*;
import view.UserInterface.*;


public class ModeButton extends JButton {

	private final MazeApp mazeApp ;
	private final AppModel appModel;
	
	public ModeButton(MazeApp mazeApp)
	{
		super("AUTO") ; // Button's text
		
		this.mazeApp = mazeApp ;
		appModel = mazeApp.getAppModel();
		
		addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
				if(appModel.getMode().equals("AUTO")) {
					
					setText("MANUAL");
				}
				else {
					setText("AUTO");
				}
				appModel.setMode(getText());
			}}); 
	}

}