package UserInterface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.* ;

import Maze.MazeReadingException;


public class ModeButton extends JButton {

	private final DrawingApp drawingApp ;
	private String mode;
	
	public ModeButton(DrawingApp drawingApp)
	{
		super("AUTO") ; // Button's text
		
		this.drawingApp = drawingApp ;
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