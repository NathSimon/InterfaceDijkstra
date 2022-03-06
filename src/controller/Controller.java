/**
 * Classe permttant l'initialisation et l'exÃ©cution de Dijkstra. Réalise l'interface entre le model et la vue et est donc appellée ici controller même si l'appelation n'est pas exacte pour le modèle MVC.
 *  
 * @author Nathanael SIMON
 * 
 * @see Dijkstra.java
 * 
 * @since TP09
 */

package controller;

import java.io.IOException;
import java.util.ArrayList;

import model.Dijkstra.Dijkstra;
import model.Dijkstra.GraphInterface;
import model.Dijkstra.PreviousInterface;
import model.Dijkstra.VertexInterface;
import model.Maze.MBox;
import model.Maze.Maze;
import model.Maze.MazeReadingException;
import view.UserInterface.GridMazePanel;

/**
 * @author Nathanael
 *
 */

public class Controller {
	
	private int rowLen;
	private int colLen;
	
	public Controller() {
	}
	
	
	/**
	 * @param rowLen
	 * @param colLen
	 * @param gridMazePanel
	 * @throws IOException
	 * @throws MazeReadingException
	 */
	public void startDijkstra (String rowLen, String colLen, GridMazePanel gridMazePanel) throws IOException, MazeReadingException {
		
		PreviousInterface previous;
		ArrayList<VertexInterface> path = new ArrayList<VertexInterface>();
		
		this.rowLen = Integer.parseInt(rowLen);
		this.colLen = Integer.parseInt(colLen);
		
		Maze maze = new Maze(this.rowLen, this.colLen, gridMazePanel);
		maze.initFromTextFile("data/labyrinthe.txt");
		
		MBox departure = maze.findDeparture();
		MBox arrival = maze.findArrival();

		previous = Dijkstra.dijkstra((GraphInterface)maze, (VertexInterface)departure);
		
		path = getPathTo(arrival, previous);
		
		for(VertexInterface vertex : path) {
			if(vertex != arrival && vertex != departure) //continuer a afficher les departs arrives
				((MBox) vertex).setLabel("P");
		}		
		
		maze.saveToTextFile("data/labyrinthe2.txt");
		maze.readFile("data/labyrinthe2.txt");
	}
	
	/**
	 * @param vertex
	 * @param previous
	 * @return
	 */
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