package Maze;

public class ABox extends MBox {

	public ABox(int x, int y, MBox[][] maze) {
		super(x,y,maze, "Arrival");
	}
	
	public int print() {
		System.out.println("Arrival");
		return 3;
	}
}
