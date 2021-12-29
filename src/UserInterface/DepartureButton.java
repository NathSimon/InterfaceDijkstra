package UserInterface;

import javax.swing.* ;


public class DepartureButton extends JButton {

	private final DrawingApp drawingApp ;
	
	public DepartureButton(DrawingApp drawingApp)
	{
		super("Departure") ; // Button's text
		
		this.drawingApp = drawingApp ;
	}
}
