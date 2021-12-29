package UserInterface;

import javax.swing.* ;


public class ArrivalButton extends JButton {

	private final DrawingApp drawingApp ;
	
	public ArrivalButton(DrawingApp drawingApp)
	{
		super("Arrival") ; // Button's text
		
		this.drawingApp = drawingApp ;
	}
}
