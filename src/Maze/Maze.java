package Maze;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.ArrayList;

import Dijkstra.GraphInterface;
import Dijkstra.VertexInterface;

public class Maze implements GraphInterface {

	private MBox[][] maze;
	private int rowLen;
	private int colLen;

	public Maze(int rowLen, int colLen) {
		this.colLen = colLen;
		this.rowLen = rowLen;
		this.maze = new MBox[rowLen][colLen]; 
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
				if(this.maze[i][j].getLabel().equals("Departure")) {
					return this.maze[i][j];
				}
			}
		}
		return null;
	}
	
	public MBox findArrival() {
		for(int i = 0; i < rowLen; i++) {
			for(int j = 0; j < colLen; j++) {
				if(this.maze[i][j].getLabel().equals("Arrival")) {
					return this.maze[i][j];
				}
			}
		}
		return null;
	}
	
	// RAJOUTER LES MESSAGES DERREURS
	public final void initFromTextFile(String fileName) throws IOException { //cest quoi ca 
		int i = 0;
		int j = 0;
		 
		Reader reader = new FileReader(fileName);
	    // Create a BufferedReader with buffer array size of 16384 (32786 bytes = 32 KB).
	    BufferedReader br = new BufferedReader(reader, 16384);

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
					break;
				case('A') : this.maze[i][j] = new ABox(i,j, this.maze);
					break;
				default : break;
				}
				j++;
			}
			i++;
	    }
	    br.close();
	}
	
	public final void saveToTextFile(String fileName) throws FileNotFoundException {
        PrintWriter printWriter = new PrintWriter(fileName);
        int i = 0;
        int j = 0;
        String str;
        
        while(i < this.colLen) {
        	j = 0;
        	while(j < this.rowLen) {
        		str = maze[i][j].getLabel();
        		switch(str) {
        		case "Arrival" : printWriter.printf("A");
        			break;
        		case "Departure" :  printWriter.printf("D");
        			break;
        		case "Wall" :  printWriter.printf("W");
        			break;
        		case "Path" :  printWriter.printf("E");
        			break;
        		case "Point" :  printWriter.printf(".");
        			break;
        		default : 
        			break;
        		}
        		j++;
        	}
        	printWriter.println();
        	i++;
        }
        printWriter.println();
        printWriter.close();
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
			if(voisinBas.getLabel().equals("Path") || voisinBas.getLabel().equals("Arrival")){
				successors.add(voisinBas);
			}}catch( Exception expection) {};
		try {
			MBox voisinHaut = maze[i-1][j];
			if(voisinHaut.getLabel().equals("Path") || voisinHaut.getLabel().equals("Arrival")){
				successors.add(voisinHaut);
			}}catch( Exception exception) {};
		try {
			MBox voisinGauche = maze[i][j-1];
			if(voisinGauche.getLabel().equals("Path") || voisinGauche.getLabel().equals("Arrival")){
				successors.add(voisinGauche);
			}}catch( Exception exception) {};
		try {
			MBox voisinDroite = maze[i][j+1];
			if(voisinDroite.getLabel().equals("Path") || voisinDroite.getLabel().equals("Arrival")){
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
