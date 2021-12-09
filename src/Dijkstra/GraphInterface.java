package Dijkstra;

public interface GraphInterface {
	void addSommet();
	int size();
	void setValue(int value);
	int getValue(int i);
	GraphInterface get(int source);
	void removeSommet(int s1);
}