package UserInterface;

import javax.swing.* ;


public class ResetButton extends JButton {

	private final DrawingApp drawingApp ;
	
	public ResetButton(DrawingApp drawingApp)
	{
		super("RESET") ; // Button's text
		
		this.drawingApp = drawingApp ;
	}
}
