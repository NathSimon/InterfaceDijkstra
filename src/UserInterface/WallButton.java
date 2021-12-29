package UserInterface;

import javax.swing.* ;


public class WallButton extends JButton {

	private final DrawingApp drawingApp ;
	
	public WallButton(DrawingApp drawingApp)
	{
		super("Wall") ; // Button's text
		
		this.drawingApp = drawingApp ;
	}
}

