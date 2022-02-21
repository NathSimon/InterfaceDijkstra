/**
 * Classe abstraite des box.
 * 
 * @author Nathanael SIMON
 * 
 * @see ABox.java DBox.java WBox.java EBox.java
 * 
 * @since TP07
 */

package model.Maze;
import model.Dijkstra.VertexInterface;

public abstract class MBox implements VertexInterface {

	int x;
	int y;
	int type; // 0 = wall, 1 = path, 2 = Depart, 3 = Arrive
	MBox[][] maze;
	String label;
	
	public MBox(int x, int y, MBox[][] maze2, String label) {
		this.x = x;
		this.y = y;
		this.maze = maze2;
		this.label = label;
	}
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
	public int print() { //BESOIN DE REDIFINIR?????
		return 0;
	}
	public final String getLabel() {
		return label;
	}
	public void  setLabel(String newLabel) {
		label = newLabel;
	}
	
}
