/**
 * Classe qui implémente l'algorithme de Dijkstra. 
 * 
 * @author Nathanael SIMON
 * 
 * @see StartDijkstra.java
 * 
 * @since TP09
 */

package Dijkstra;

import java.util.ArrayList;

public class Dijkstra {
	
	public static PreviousInterface dijkstra(GraphInterface graph, VertexInterface root) {
		ASetInterface set = new ASet();
		PiInterface pi = new Pi();
		PreviousInterface previous = new Previous();
		int value = 0;
		int minValue = 0;
	
		VertexInterface pivot = root;
		
		ArrayList<VertexInterface> completeGraph = graph.getAllVertices();
		
		set.addVertex(root);
		pi.setValue(root, 0);
	
		for(VertexInterface vertex : completeGraph) {
			if(vertex != root) {
				pi.setValue(vertex, Integer.MAX_VALUE);	
			}
		}
		for(int j = 0; j < completeGraph.size() - 1; j++) {
			for(VertexInterface y : completeGraph) {
				if(!set.containsVertex(y) && graph.getSuccessors(pivot).contains(y)) {
					value = pi.getValue(pivot) + graph.getWeight(pivot, y);  
					if(value < pi.getValue(y)) {
						pi.setValue(y, value);
						previous.setValue(y, pivot);
					}
				}
			}
			minValue = Integer.MAX_VALUE;
			VertexInterface y = null;
			for(VertexInterface vertex : completeGraph) {
				if(!set.containsVertex(vertex) && pi.getValue(vertex) < minValue) { //trouver un sommet tel que sa valeur soit min
					minValue = pi.getValue(vertex);
					y = vertex;
				}
			}
			if(y != null)
				pivot = y;
			set.addVertex(pivot);
		}	
		return previous;
	}
}

//test 1 qui na pas marche
//public class Dijkstra {
//
//	private int source;
//	private GraphInterface graph;
//	private ASetInterface asset;
//	private VertexInterface sommet;
//	private PreviousInterface previous;
//	private PiInterface pi;
//
//	public Dijkstra(GraphInterface graph, VertexInterface sommet, ASetInterface asset, PiInterface pi, PreviousInterface previous, int source) {
//		this.asset = asset;
//		this.sommet = sommet;
//		this.graph = graph;
//		this.previous = previous;
//		this.pi = pi;
//		this.source = source; 
//		
//		for(int i = 0; i < graph.size(); i++) {
//			graph.get(i).setValue(Integer.MAX_VALUE);
//		}
//		graph.get(source).setValue(Integer.MAX_VALUE);
//		
//		
//		while(!asset.isEmpty()) {
//			int s1 = pi.findMin(asset);
//			graph.removeSommet(s1);
//			for(int i = 0; i < graph.size(); i++) {
//				if(previous.isPrevious(s1, graph.get(i))) {
//					if(graph.get(i).getValue(i) > graph.get(s1).getValue(i) + sommet.getValueBetween(i, s1)) {
//						graph.get(i).setValue(graph.get(s1).getValue(i) + sommet.getValueBetween(i, s1));
//						(sommet.get(i)).setPrevious(graph.get(s1)); 
//					}
//				}
//			}
//		}
//	}
//}
//
//
