/**
 * Classe permttant de mémoriser et récupérer les les prédécesseurs d'un vertex.
 * 
 * @author Nathanael SIMON
 * 
 * @see Dijkstra.java
 * 
 * @since TP09
 */


package Dijkstra;

import java.util.ArrayList;
import java.util.Hashtable;

public final class Previous extends Hashtable<VertexInterface, VertexInterface> implements PreviousInterface {
	
	private static final long serialVersionUID = 1L;

	public Previous() {
		super();
	}

	public void setValue(VertexInterface vertex, VertexInterface value) {
		super.put(vertex, value);
	}

	public VertexInterface getVertex(VertexInterface vertex) {
		return super.get(vertex);
	}

	public boolean containsVertex(VertexInterface vertex) {
		return contains(vertex);
	}
	
	public ArrayList<VertexInterface> getPathTo(VertexInterface vertex) {
		ArrayList<VertexInterface> path = new ArrayList<VertexInterface>();
		if(getVertex(vertex) == null) { //Pas de solution = arrivee non exploree donc non implementee dans la hashtable
			System.out.println("Le labyrinthe n'a pas de solutions");
		}
		else {
			while (vertex != null) {
				path.add(vertex);
				vertex = getVertex(vertex);
			}
		}
		return path;
	}
}
