package view.UserInterfaceButtons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;

import javax.swing.* ;

import model.Maze.ABox;
import model.Maze.DBox;
import model.Maze.EBox;
import model.Maze.MazeReadingException;
import model.Maze.WBox;
import controller.Controller;
import view.UserInterface.*;
import view.SaveFrame.*;
import view.UserInterfaceButtons.*;
import view.UserInterfaceMenus.*;



public class SolveButton extends JButton {

	private final MazeApp mazeApp ;
	private GridMazePanel gridMazePanel;
	private Controller controller;
	
	public SolveButton(MazeApp mazeApp, GridMazePanel gridMazePanel)
	{
		super("SOLVE") ; // Button's text
		
		this.gridMazePanel = gridMazePanel;
		
		this.mazeApp = mazeApp ;
		
		this.controller = new Controller();
		
		addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
				solveAction();
			}}); 
	}
	
	public void solveAction() {
		resetPath();
		try {
			saveToTextFile("data/labyrinthe.txt", 0);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		try {
			controller.startDijkstra(gridMazePanel.getRowLen(), gridMazePanel.getColLen(), gridMazePanel);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (MazeReadingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		showPath();
	}
	
	public void saveToTextFile(String fileName, int saveOrSolve) throws FileNotFoundException { //saveOrSolve permet denregistrer un E si on veut resoudre, un P si on veut save
		
		int i = 0;
	    int j = 0;
	    String str;
		
	    try( FileOutputStream fos = new FileOutputStream(fileName);
			 PrintWriter printWriter = new PrintWriter(fos); ) {
	      
        
	        while(i < gridMazePanel.getRowLen() * gridMazePanel.getColLen()) {
	        	str = gridMazePanel.getMazeButton(i).getLabel();
	        	switch(str) {
	        	case "A" : printWriter.printf("A");
	        		break;
	        	case "D" :  printWriter.printf("D");
	        		break;
	        	case "W" :  printWriter.printf("W");
	        		break;
	        	case "E" :  printWriter.printf("E");
	        		break;
	        	case "P" :	if(saveOrSolve == 0) {
	        					printWriter.printf("E");
	        				}
	        				else {
	        					printWriter.printf("P");
	        				}
	        	default :
	        		break;
	        	}
	        	if((i+1) % gridMazePanel.getColLen() == 0 && !(i == 0)) { //sans le +1 il est decale de 1
	        		printWriter.println();
	        	}
	        	i++;
	        }	
	        
	    } catch (Exception e) {
	    	e.printStackTrace();
	    }
    }	
	
	public void resetPath() {
		for(int i = 0; i < gridMazePanel.getRowLen() * gridMazePanel.getColLen(); i++) {
			if(gridMazePanel.getMazeButton(i).getLabel().equals("P")) {
				gridMazePanel.getMazeButton(i).setLabel("E");
				gridMazePanel.getMazeButton(i).setIcon(new ImageIcon("data/Empty.png"));
			}
		}
	}
	
	public void showPath() {
		int numberOfPaths = 0;
		for(int i = 0; i < gridMazePanel.getRowLen() * gridMazePanel.getColLen(); i++) {
			if(gridMazePanel.getMazeButton(i).getLabel().equals("P")) {
				gridMazePanel.getMazeButton(i).setIcon(new ImageIcon("data/path.jpg"));
				numberOfPaths++;
			}
		
		}		
		if(numberOfPaths == 0) {
			JOptionPane.showMessageDialog(mazeApp,
				    "No path found for this maze",
				    "Path error",
				    JOptionPane.WARNING_MESSAGE);
		}
	}
}
