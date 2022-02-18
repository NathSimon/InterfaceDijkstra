/**
 * Classe permttant l'initialisation et l'exécution de Dijkstra.
 * 
 * @author Nathanael SIMON
 * 
 * @see Dijkstra.java
 * 
 * @since TP09
 */

package Dijkstra;

import java.io.IOException;
import java.util.ArrayList;

import Maze.MBox;
import Maze.Maze;
import Maze.MazeReadingException;
import view.UserInterface.GridMazePanel;

public class StartDijkstra {
	
	public StartDijkstra(int rowLen, int colLen, GridMazePanel gridMazePanel) throws IOException, MazeReadingException {
		
		PreviousInterface previous;
		ArrayList<VertexInterface> path = new ArrayList<VertexInterface>();
		
		Maze maze = new Maze(rowLen, colLen, gridMazePanel);
		maze.initFromTextFile("data/labyrinthe.txt");
		
		MBox departure = maze.findDeparture();
		MBox arrival = maze.findArrival();

		previous = Dijkstra.dijkstra((GraphInterface)maze, (VertexInterface)departure);
		
		path = getPathTo(arrival, previous);
		
		for(VertexInterface vertex : path) {
			if(vertex != arrival && vertex != departure) //continuer a afficher les departs arrives
			((MBox) vertex).setLabel("Point");
		}		
		
		maze.saveToTextFile("data/labyrinthe2.txt");
		maze.readFile("data/labyrinthe2.txt");
	}
	
	public ArrayList<VertexInterface> getPathTo(VertexInterface vertex, PreviousInterface previous) {
		ArrayList<VertexInterface> path = new ArrayList<VertexInterface>();
		if(previous.getVertex(vertex) == null) { //Pas de solution = arrivee non exploree donc non implementee dans la hashtable
			System.out.println("Le labyrinthe n'a pas de solutions");
		}
		else {
			while (vertex != null) {
				path.add(vertex);
				vertex = previous.getVertex(vertex);
			}
		}
		return path;
	}
}