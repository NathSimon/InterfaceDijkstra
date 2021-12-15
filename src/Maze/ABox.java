package Maze;

public class ABox extends MBox {

	public ABox(int x, int y, Maze maze, String label) {
		super(x,y,maze, label);
	}
	
	public int print() {
		System.out.println("Arrival");
		return 3;
	}
}
