package Maze;
import Dijkstra.VertexInterface;

public class WBox extends MBox implements VertexInterface  {

	public WBox(int x, int y, Maze maze) {
		super(x,y,maze);
	}
	
	public int print() {
		System.out.println("Wall");
		return 0;
	}
	
}
