package UserInterface;

import javax.swing.* ;


public class SolveButton extends JButton {

	private final DrawingApp drawingApp ;
	
	public SolveButton(DrawingApp drawingApp)
	{
		super("SOLVE") ; // Button's text
		
		this.drawingApp = drawingApp ;
	}
}
