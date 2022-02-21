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
		super(x,y,maze, "Departure");
	}
	
	public int print() {
		System.out.println("Departure");
		return 2;
	}
}
