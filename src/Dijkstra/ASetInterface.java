package Dijkstra;

public interface ASetInterface {
	void removeFromA();
	Boolean isEmpty();
	int size();
	int getValue();
	ASetInterface get(int i);
}