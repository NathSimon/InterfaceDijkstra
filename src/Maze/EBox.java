package Maze;

public class EBox extends MBox {
	
	public EBox(int x, int y, Maze maze, String label) {
		super(x,y,maze, label);
	}
	public int print() {
		System.out.println("Path");
		return 1;
	}

}
