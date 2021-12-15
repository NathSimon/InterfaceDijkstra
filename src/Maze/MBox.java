package Maze;
import Dijkstra.VertexInterface;

public abstract class MBox implements VertexInterface {

	int x;
	int y;
	int type; // 0 = wall, 1 = path, 2 = Depart, 3 = Arrive
	Maze maze;
	String label;
	
	public MBox(int x, int y, Maze maze, String label) {
		this.x = x;
		this.y = y;
		this.maze = maze;
		this.label = label;
	}
	
	public int print() { //BESOIN DE REDIFINIR?????
		return 0;
	}
	public final String getLabel() {
		return label;
	}
	
}
