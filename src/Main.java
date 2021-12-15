import java.io.IOException;

import Maze.Maze;

public class Main {

	public static void main(String[] args) throws IOException {
		Maze maze = new Maze(10,10);
		
		maze.initFromTextFile("data/labyrinthe.txt");
		maze.saveToTextFile("data/labyrinthe2.txt");
		maze.readFile("data/labyrinthe2.txt");
	}
}
