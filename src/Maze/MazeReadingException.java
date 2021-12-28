package Maze;

public class MazeReadingException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public MazeReadingException (String fileName, int lineNumber, String message)
	{
		super("Erreur pendant la lecture du labyrinthe au " + fileName + "(" + lineNumber + ")" + message);
	}
	 
}
