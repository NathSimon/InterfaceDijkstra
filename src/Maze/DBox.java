package Maze;

public class DBox extends MBox {

	public DBox(int x, int y, Maze maze, String label) {
		super(x,y,maze, label);
	}
	
	public int print() {
		System.out.println("Departure");
		return 2;
	}
}
