package view.UserInterfaceButtons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.* ;

import Maze.MazeReadingException;
import view.SaveFrame.*;
import view.UserInterfaceButtons.*;
import view.UserInterfaceMenus.*;
import view.UserInterface.*;


public class ModeButton extends JButton {

	private final MazeApp mazeApp ;
	private String mode;
	
	public ModeButton(MazeApp mazeApp)
	{
		super("AUTO") ; // Button's text
		
		this.mazeApp = mazeApp ;
		mode = "AUTO";
		
		addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
				if(getText().equals("AUTO")) {
					setText("MANUAL");
				}
				else {
					setText("AUTO");
				}
				mode = getText();
			}}); 
	}
	public String getMode() {
		return mode;
	}
}