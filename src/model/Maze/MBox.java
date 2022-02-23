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

	private final int x;
	private final int y;
	private final MBox[][] maze;
	private String label;
	
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
	
	public String getLabel() {
		return label;
	}
	
	public abstract boolean isTraversable();
	
	public final void  setLabel(String newLabel) {
		label = newLabel;
	}
	
}
