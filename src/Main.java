import java.io.IOException;
import java.util.ArrayList;

import Dijkstra.GraphInterface;
import Dijkstra.PreviousInterface;
import Dijkstra.VertexInterface;
import Dijkstra.Dijkstra;
import Maze.MBox;
import Maze.Maze;
import Maze.MazeReadingException;

public class Main {

	
	public static void main(String[] args) throws IOException, MazeReadingException {
		
		int rowLen = 10;
		int colLen = 10;
		PreviousInterface previous;
		ArrayList<VertexInterface> path = new ArrayList<VertexInterface>();
		
		Maze maze = new Maze(rowLen, colLen);
		maze.initFromTextFile("data/labyrinthe.txt");
		
		MBox departure = maze.findDeparture();
		MBox arrival = maze.findArrival();

		previous = Dijkstra.dijkstra((GraphInterface)maze, (VertexInterface)departure);
		
		path = previous.getPathTo(arrival);
		
		for(VertexInterface vertex : path) {
			if(vertex != arrival && vertex != departure) //continuer a afficher les departs arrives
			((MBox) vertex).setLabel("Point");
		}
				
		maze.saveToTextFile("data/labyrinthe2.txt");
		maze.readFile("data/labyrinthe2.txt");
	}
}
