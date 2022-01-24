package view.UserInterface;

import javax.swing.JOptionPane;

public class SizeReadingException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public SizeReadingException ()
	{
		super("Error : invalid size, maze must have rows and columns of size between 4 and 100");
	}
	 
	public SizeReadingException (String str)
	{
		super("Error : invalid caracter, must be numbers "); 
	}
}
