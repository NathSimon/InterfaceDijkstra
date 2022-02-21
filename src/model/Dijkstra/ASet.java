/**
 * Class qui représente l'ensemble des vertex déjà traité par Dijkstra. Implémente l'interface ASet.
 * 
 * @author Nathanael SIMON
 * 
 * @see Dijksra.java
 * 
 * @since TP09
 */

package model.Dijkstra;

import java.util.HashSet;

public class ASet extends HashSet<VertexInterface> implements ASetInterface {

	private static final long serialVersionUID = 1L;
	
	public ASet() {
		super();
	}
	
	public void addVertex(VertexInterface vertex) {
		add(vertex);
	}
	public boolean containsVertex(VertexInterface vertex) {
		return contains(vertex);
	}
	
}
