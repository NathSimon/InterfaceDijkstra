package Maze;

public class DBox extends MBox {

	public DBox(int x, int y, Maze maze) {
		super(x,y,maze);
	}
	
	public int print() {
		System.out.println("Departure");
		return 2;
	}
}
