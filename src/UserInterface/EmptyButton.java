package UserInterface;

import javax.swing.* ;


public class EmptyButton extends JButton {

	private final DrawingApp drawingApp ;
	
	public EmptyButton(DrawingApp drawingApp)
	{
		super("Empty") ; // Button's text
		
		this.drawingApp = drawingApp ;
	}
}
