package UserInterface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.* ;

import Dijkstra.MainMaze;
import Maze.MazeReadingException;


public class SolveMenuItem extends JMenuItem {

	private static final long serialVersionUID = 1L;
	
	private final DrawingApp drawingApp ;
	private GridMazePanel gridMazePanel;
	
	public SolveMenuItem(DrawingApp drawingApp, GridMazePanel gridMazePanel)
	{
		super("Solve") ; // Button's text
		
		this.gridMazePanel = gridMazePanel;
		
		this.drawingApp = drawingApp ;
		
		addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
				resetPath();
				try {
					saveToTextFile("data/labyrinthe.txt");
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				}
				try {
					MainMaze.mainMaze(gridMazePanel.getRowLen(), gridMazePanel.getColLen(), gridMazePanel);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (MazeReadingException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				showPath();
			}}); 
	}
	
	public void saveToTextFile(String fileName) throws FileNotFoundException {
        PrintWriter printWriter = new PrintWriter(fileName);
        int i = 0;
        int j = 0;
        String str;
        
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
        	case "P" : printWriter.printf("E");
        	default :
        		break;
        	}
        	if((i+1) % gridMazePanel.getColLen() == 0 && !(i == 0)) { //sans le +1 il est decale de 1
        		System.out.println(i);
        		printWriter.println();
        	}
        	i++;
        }
        printWriter.close();
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
		for(int i = 0; i < gridMazePanel.getRowLen() * gridMazePanel.getColLen(); i++) {
			if(gridMazePanel.getMazeButton(i).getLabel().equals("P")) {
				gridMazePanel.getMazeButton(i).setIcon(new ImageIcon("data/path.jpg"));
			}
		}
	}
}