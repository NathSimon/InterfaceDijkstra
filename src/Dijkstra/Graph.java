package Dijkstra;

import java.util.ArrayList;

public class Graph implements GraphInterface {

	public Graph() {
		ArrayList graphList = new ArrayList<Vertex>();
	}
	
	public void addVertex(int s1) {
		graphList.add(s1);
	}
	
}
