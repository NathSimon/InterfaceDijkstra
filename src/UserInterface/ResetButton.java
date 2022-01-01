package UserInterface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.* ;

import Dijkstra.MainMaze;
import Maze.MazeReadingException;


public class ResetButton extends JButton {

	private final DrawingApp drawingApp ;
	
	public ResetButton(DrawingApp drawingApp, WindowPanel windowPanel, GridMazePanel gridMazePanel)
	{
		super("RESET") ; // Button's text
		
		this.drawingApp = drawingApp ;
		
		addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
				windowPanel.initMazePanel(Integer.toString(gridMazePanel.getColLen()), Integer.toString(gridMazePanel.getRowLen()));
			}}); 
	}
}
