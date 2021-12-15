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
	
	private char[][] boxes;
	private MBox[][] maze;
	private int rowLen;
	private int colLen;

	public Maze(int rowLen, int colLen) {
		this.colLen = colLen;
		this.rowLen = rowLen;
		MBox[][] maze = new MBox[rowLen][colLen]; 
		this.boxes = new char[rowLen][colLen];
	}
	
//	public ArrayList<VertexInterface> getAllVertices() {
//		
//	}
//	
//	public ArrayList<VertexInterface> getSuccessors(VertexInterface vertex) {
//		
//	}
//	
//	public int getWeight(VertexInterface src,VertexInterface dst) {
//		
//	}
	
	
	public final void readFile(String fileName) throws IOException {
		Reader reader = new FileReader(fileName);
		int i = 0;
	    // Create a BufferedReader with buffer array size of 16384 (32786 bytes = 32 KB).
	    BufferedReader br = new BufferedReader(reader, 16384);

	    String line = null;
		
		while((line = br.readLine())!= null) {
			System.out.println(line);
			i++;
	    }
		System.out.println();
		
	    br.close();
	}
	
	public MBox findDeparture() {
		for(int i = 0; i < rowLen; i++) {
			for(int j = 0; j < colLen; j++) {
				if(this.boxes[i][j] == 'D') {
					return this.maze[i][j];
				}
			}
		}
		return null;
	}
	
	public MBox findArrival() {
		for(int i = 0; i < rowLen; i++) {
			for(int j = 0; j < colLen; j++) {
				if(this.boxes[i][j] == 'A') {
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
				this.boxes[i][j] = line.charAt(j);
				j++;
			}
			i++;
			System.out.println(line);
	    }
	    br.close();
	}
	
	public final void saveToTextFile(String fileName) throws FileNotFoundException {
        PrintWriter printWriter = new PrintWriter(fileName);
        int i = 0;
        int j = 0;
        
        while(i < this.colLen) {
        	j = 0;
        	while(j < this.rowLen) {
        		printWriter.printf("%c", boxes[i][j]);
        		j++;
        	}
        	System.out.printf("%d", i);
        	printWriter.println();
        	i++;
        }
        printWriter.close();
    }
}
