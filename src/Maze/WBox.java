package Maze;
import Dijkstra.VertexInterface;

public class WBox extends MBox implements VertexInterface  {

	public WBox(int x, int y, MBox[][] maze) {
		super(x,y,maze, "Wall");
	}
	
	public int print() {
		System.out.println("Wall");
		return 0;
	}
	
}
