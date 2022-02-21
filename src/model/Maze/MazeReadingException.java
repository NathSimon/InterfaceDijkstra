/**
 * Exception lors de la lecture du maze. Déclenchée dans Maze.java
 * 
 * @author Nathanael SIMON
 * 
 * @see Maze.java
 *  
 * @since TP07
 */

package model.Maze;

public class MazeReadingException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public MazeReadingException (String fileName, int lineNumber, String message)
	{
		super("Erreur pendant la lecture du labyrinthe au " + fileName + "(" + lineNumber + ")" + message);
	}
	 
}
