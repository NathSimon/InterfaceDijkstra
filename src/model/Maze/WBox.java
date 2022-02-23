/**
 * Classe de la box wall. Implémente la classe abstraite MBox
 * 
 * @author Nathanael SIMON
 * 
 * @see MBox.java
 *  
 * @since TP07
 */

package model.Maze;
import model.Dijkstra.VertexInterface;

public class WBox extends MBox implements VertexInterface  {

	public WBox(int x, int y, MBox[][] maze) {
		super(x,y,maze, "W");
	}
	
	@Override
	public boolean isTraversable() {
		return false;
	}
}
