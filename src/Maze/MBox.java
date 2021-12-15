package Maze;
import Dijkstra.VertexInterface;

public abstract class MBox implements VertexInterface {

	int x;
	int y;
	int type; // 0 = wall, 1 = path, 2 = Depart, 3 = Arrive
	Maze maze;
	
	public MBox(int x, int y, Maze maze) {
		this.x = x;
		this.y = y;
		this.maze = maze;
	}
	
	public int print() { //BESOIN DE REDIFINIR?????
		return 0;
	}
	public final String getLabel() {
		type = print();
		return "test";
	}
	
}
