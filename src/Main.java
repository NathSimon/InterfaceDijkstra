import java.io.IOException;

import Maze.Maze;

public class Main {

	
	public static void main(String[] args) throws IOException {
		
		int rowLen = 10;
		int colLen = 10;
		Maze maze = new Maze(rowLen, colLen);
		maze.initFromTextFile("data/labyrinthe.txt");
		
		MBox departure = maze.findDeparture();
		MBox arrival = maze.findArrival();		
		
		maze.saveToTextFile("data/labyrinthe2.txt");
		maze.readFile("data/labyrinthe2.txt");
	}
}
