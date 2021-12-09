package Dijkstra;

public interface VertexInterface {
	int getValueBetween(int s1, int s2);
	void setPrevious(GraphInterface graphInterface);
	VertexInterface get(int i);
}