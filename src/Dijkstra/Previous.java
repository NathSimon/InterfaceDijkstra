package Dijkstra;

import java.util.ArrayList;
import java.util.Hashtable;

public final class Previous extends Hashtable<VertexInterface, VertexInterface> implements PreviousInterface {
	
	private static final long serialVersionUID = 1L;

	public Previous() {
		super();
	}

	public void setValue(VertexInterface vertex, VertexInterface value) {
		this.put(vertex, value);
	}

	public VertexInterface getValue(VertexInterface vertex) {
		return this.get(vertex);
	}

	public ArrayList<VertexInterface> getPathTo(VertexInterface vertex) {
		ArrayList<VertexInterface> path = new ArrayList<VertexInterface>();
		while (vertex != null) {
			path.add(vertex);
			vertex = getValue(vertex);
		}
		return path;
	}
	
}
