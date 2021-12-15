package Maze;

public class ABox extends MBox {

	public ABox(int x, int y, Maze maze) {
		super(x,y,maze);
	}
	
	public int print() {
		System.out.println("Arrival");
		return 3;
	}
}
