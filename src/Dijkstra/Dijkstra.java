package Dijkstra;

public class Dijkstra {

	private int source;
	private GraphInterface graph;
	private ASetInterface asset;
	private VertexInterface sommet;
	private PreviousInterface previous;
	private PiInterface pi;

	public Dijkstra(GraphInterface graph, VertexInterface sommet, ASetInterface asset, PiInterface pi, PreviousInterface previous, int source) {
		this.asset = asset;
		this.sommet = sommet;
		this.graph = graph;
		this.previous = previous;
		this.pi = pi;
		this.source = source; 
		
		for(int i = 0; i < graph.size(); i++) {
			graph.get(i).setValue(Integer.MAX_VALUE);
		}
		graph.get(source).setValue(Integer.MAX_VALUE);
		
		
		while(!asset.isEmpty()) {
			int s1 = pi.findMin(asset);
			graph.removeSommet(s1);
			for(int i = 0; i < graph.size(); i++) {
				if(previous.isPrevious(s1, graph.get(i))) {
					if(graph.get(i).getValue(i) > graph.get(s1).getValue(i) + sommet.getValueBetween(i, s1)) {
						graph.get(i).setValue(graph.get(s1).getValue(i) + sommet.getValueBetween(i, s1));
						(sommet.get(i)).setPrevious(graph.get(s1)); 
					}
				}
			}
		}
	}
}


