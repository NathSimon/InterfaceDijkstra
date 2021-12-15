package Maze;

public class EBox extends MBox {
	
	public EBox(int x, int y, Maze maze) {
		super(x,y,maze);
	}
	public int print() {
		System.out.println("Path");
		return 1;
	}

}
