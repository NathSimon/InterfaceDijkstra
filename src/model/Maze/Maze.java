/**
 * Classe de la création du Maze. Implémente GraphInterface. Permet l'initialisation et la sauvegarde du graphe dans un fichier text. Permet enfin de récupérer les prédécesseurs d'un vertex particulier.  
 * 
 * @author Nathanael SIMON
 * 
 * @see MBox.java
 * @see MazeReadingException.java
 * 
 * @exception MazeReadingException Déclenchée si le labyrinthe possède un format incorrect.
 * @exception IOException Déclenchée si le programme ne peut lire le fichier d'initialisation du maze.
 *  
 * @since TP07
 */

package model.Maze;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.ArrayList;

import model.Dijkstra.GraphInterface;
import model.Dijkstra.VertexInterface;
import view.UserInterface.GridMazePanel;

public class Maze implements GraphInterface {

	private final MBox[][] maze;
	private final int rowLen;
	private final int colLen;
	private final GridMazePanel gridMazePanel;

	public Maze(int rowLen, int colLen, GridMazePanel gridMazePanel) {
		this.colLen = colLen;
		this.rowLen = rowLen;
		this.maze = new MBox[rowLen][colLen]; 
		this.gridMazePanel = gridMazePanel;
	}
	
	public final void readFile(String fileName) throws IOException {
		Reader reader = new FileReader(fileName);
	    // Create a BufferedReader with buffer array size of 16384 (32786 bytes = 32 KB).
	    BufferedReader br = new BufferedReader(reader, 16384);

	    String line = null;
	    
	    System.out.println("=== LABYRINTHE RESOLU ===");
	    
		while((line = br.readLine())!= null) {
			System.out.println(line);
	    }
		System.out.println();
		
	    br.close();
	}
	
	public MBox findDeparture() {
		for(int i = 0; i < rowLen; i++) {
			for(int j = 0; j < colLen; j++) {
				if(this.maze[i][j].getLabel().equals("D")) {
					return this.maze[i][j];
				}
			}
		}
		return null;
	}
	
	public MBox findArrival() {
		for(int i = 0; i < rowLen; i++) {
			for(int j = 0; j < colLen; j++) {
				if(this.maze[i][j].getLabel().equals("A")) {
					return this.maze[i][j];
				}
			}
		}
		return null;
	}
	
	// RAJOUTER LES MESSAGES DERREURS
	public final void initFromTextFile(String fileName) throws IOException, MazeReadingException {
		int i = 0;
		int j = 0;
		int arrivalCount = 0;
		int departureCount = 0;
		 
		Reader reader = new FileReader(fileName);
	    // Create a BufferedReader with buffer array size of 16384 (32786 bytes = 32 KB).
	    try(BufferedReader br = new BufferedReader(reader, 16384)) {

		    String line = null;
			
			
		    while((line = br.readLine())!= null) {
		        j = 0;
				while (j < line.length()) {
					char c = line.charAt(j);
					switch (c) {
					case('W') : this.maze[i][j] = new WBox(i,j, this.maze);
						break;
					case('E') : this.maze[i][j] = new EBox(i,j, this.maze);
						break;
					case('D') : this.maze[i][j] = new DBox(i,j, this.maze);
								departureCount++;
						break;
					case('A') : this.maze[i][j] = new ABox(i,j, this.maze);
								arrivalCount++;
						break;
					default : throw new MazeReadingException(fileName, i, "Invalid charactere in file at line : " + i);
					}
					if(j > colLen) {
						new MazeReadingException(fileName, i, "Invalid size of column at column : " + j);
					}
					j++;
				}
				if(i > rowLen) {
					new MazeReadingException(fileName, i, "Invalid size of column at row : " + i);
				}
				i++;
		    }
		    br.close();
	    } catch(FileNotFoundException error) {
	    	error.getStackTrace();
	    }
	    if(arrivalCount != 1) {
	    	throw new MazeReadingException(fileName, i, "Invalid number of arrival in maze : " + arrivalCount + ". There should be only one");
	    }
	    if(departureCount != 1) {
	    	throw new MazeReadingException(fileName, i, "Invalid number of arrival in maze : " + departureCount + ". There should be only one");
	    }
	}
	
	public final void saveToTextFile(String fileName) throws FileNotFoundException {
		
        int i = 0;
        int j = 0;
        int total = 0;
        String str;
        
        try (FileOutputStream fos = new FileOutputStream(fileName);
		PrintWriter printWriter = new PrintWriter(fos); ) {
	        while(i < this.rowLen) {
	        	j = 0;
	        	while(j < this.colLen) {
	        		str = maze[i][j].getLabel();
	        		switch(str) {
	        		case "A" : printWriter.printf("A");
	        			break;
	        		case "D" :  printWriter.printf("D");
	        			break;
	        		case "W" :  printWriter.printf("W");
	        			break;
	        		case "E" :  printWriter.printf("E");
	        			break;
	        		case "P" :  printWriter.printf(".");
	        						gridMazePanel.getMazeButton(total).setLabel("P");
	        			break;
	        		default : 
	        			break;
	        		}
	        		j++;
	        		total++;
	        	}
	        	printWriter.println();
	        	i++;
	        }
	        printWriter.println();
        } catch (Exception e) {
        	e.printStackTrace();
        }
    }

	public ArrayList<VertexInterface> getAllVertices() {
		ArrayList<VertexInterface> allVertices = new ArrayList<VertexInterface>();
		for(int i = 0; i < rowLen; i++) {
			for(int j = 0; j < colLen; j++) {
				allVertices.add(maze[i][j]);
			}
		}
		return allVertices;
	}

	public ArrayList<VertexInterface> getSuccessors(VertexInterface vertex) {
		ArrayList<VertexInterface> successors = new ArrayList<VertexInterface>();
		MBox box = (MBox)vertex;
		int i = box.getX();
		int j = box.getY();

		try {
			MBox voisinBas = maze[i+1][j];
			if(voisinBas.isTraversable()){
				successors.add(voisinBas);
			}}catch( Exception expection) {};
		try {
			MBox voisinHaut = maze[i-1][j];
			if(voisinHaut.isTraversable()){
				successors.add(voisinHaut);
			}}catch( Exception exception) {};
		try {
			MBox voisinGauche = maze[i][j-1];
			if(voisinGauche.isTraversable()){
				successors.add(voisinGauche);
			}}catch( Exception exception) {};
		try {
			MBox voisinDroite = maze[i][j+1];
			if(voisinDroite.isTraversable()){
				successors.add(voisinDroite);
			}}catch( Exception exception) {};
			
	return successors;

	}

	public int getWeight(VertexInterface src, VertexInterface dst) {
		ArrayList<VertexInterface> successors = getSuccessors(src);
		if(successors.contains(dst)) return 1;
		return 0;
	}
}
