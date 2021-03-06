/**
 * Classe de la box arrival. Implémente la classe abstraite MBox
 * 
 * @author Nathanael SIMON
 * 
 * @see MBox.java
 *  
 * @since TP07
 */

package model.Maze;

public class ABox extends MBox {

	public ABox(int x, int y, MBox[][] maze) {
		super(x,y,maze, "A");
	}

	@Override
	public boolean isTraversable() {
		return true;
	}
	
}
