/**
 * Classe de la box departure. Implémente la classe abstraite MBox
 * 
 * @author Nathanael SIMON
 * 
 * @see MBox.java
 *  
 * @since TP07
 */

package model.Maze;

public class DBox extends MBox {

	public DBox(int x, int y, MBox[][] maze) {
		super(x,y,maze, "D");
	}

	@Override
	public boolean isTraversable() {
		return true;
	}
}
