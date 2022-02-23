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

public class ASet implements ASetInterface {

	private final HashSet<VertexInterface> hashASet;
	
	public ASet() {
		super();
		hashASet = new HashSet<VertexInterface>();
	}
	
	public void addVertex(VertexInterface vertex) {
		hashASet.add(vertex);
	}
	public boolean containsVertex(VertexInterface vertex) {
		return hashASet.contains(vertex);
	}
	
}
