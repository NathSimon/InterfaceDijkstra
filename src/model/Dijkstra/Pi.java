/**
 * Classe permttant de mémoriser et récupérer les valeurs des vertexs.
 * 
 * @author Nathanael SIMON
 * 
 * @see Dijkstra.java
 * 
 * @since TP09
 */


package model.Dijkstra;

import java.util.Hashtable;

public class Pi implements PiInterface {

	private final Hashtable<VertexInterface, Integer> hashVertex;

	public Pi() {
		hashVertex = new  Hashtable<VertexInterface, Integer>();
	}

	public void setValue(VertexInterface vertex, int weight) {
		hashVertex.put(vertex, weight);
		
	}

	public int getValue(VertexInterface vertex) {
		return hashVertex.get(vertex);
	}
	

}
