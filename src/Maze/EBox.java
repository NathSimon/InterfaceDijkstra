/**
 * Classe de la box empty. Implémente la classe abstraite MBox
 * 
 * @author Nathanael SIMON
 * 
 * @see MBox.java
 *  
 * @since TP07
 */


package Maze;

public class EBox extends MBox {
	
	public EBox(int x, int y, MBox[][] maze) {
		super(x,y,maze, "Path");
	}
}
