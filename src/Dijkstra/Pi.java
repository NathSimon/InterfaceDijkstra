package Dijkstra;

import java.util.Hashtable;

public class Pi extends Hashtable<VertexInterface, Integer> implements PiInterface {

	private static final long serialVersionUID = 1L;

	public Pi() {
		super();
	}

	public void setValue(VertexInterface vertex, int weight) {
		this.put(vertex, weight);
		
	}

	public int getValue(VertexInterface vertex) {
		return this.get(vertex);
	}
	

}
