/**
 * Classe permttant de mémoriser et récupérer les les prédécesseurs d'un vertex.
 * 
 * @author Nathanael SIMON
 * 
 * @see Dijkstra.java
 * 
 * @since TP09
 */


package model.Dijkstra;

import java.util.Hashtable;

public final class Previous implements PreviousInterface {
	
	private final Hashtable<VertexInterface, VertexInterface> hashPreviousHashtable;
	
	public Previous() {
		hashPreviousHashtable = new Hashtable<VertexInterface, VertexInterface>();
	}

	public void setValue(VertexInterface vertex, VertexInterface value) {
		hashPreviousHashtable.put(vertex, value);
	}

	public VertexInterface getVertex(VertexInterface vertex) {
		return hashPreviousHashtable.get(vertex);
	}

	public boolean containsVertex(VertexInterface vertex) {
		return hashPreviousHashtable.contains(vertex);
	}
}
