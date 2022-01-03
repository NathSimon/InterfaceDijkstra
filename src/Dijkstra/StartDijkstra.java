package Dijkstra;

import java.io.IOException;
import java.util.ArrayList;

import Maze.MBox;
import Maze.Maze;
import Maze.MazeReadingException;
import UserInterface.GridMazePanel;

public class StartDijkstra {
	
	public StartDijkstra(int rowLen, int colLen, GridMazePanel gridMazePanel) throws IOException, MazeReadingException {
		
		PreviousInterface previous;
		ArrayList<VertexInterface> path = new ArrayList<VertexInterface>();
		
		Maze maze = new Maze(rowLen, colLen, gridMazePanel);
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