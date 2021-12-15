package Dijkstra;

import java.util.HashSet;

public class ASet extends HashSet<VertexInterface> implements ASetInterface {

	private static final long serialVersionUID = 1L; //jsp pas trop ce que ca fait
	
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
