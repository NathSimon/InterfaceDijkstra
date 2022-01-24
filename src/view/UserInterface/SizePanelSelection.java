package view.UserInterface;
import java.awt.Dimension;

import javax.swing.* ;

public class SizePanelSelection extends JPanel {

	private static final long serialVersionUID = 1L;

	private final DrawingApp drawingApp ;
	
	public SizePanelSelection(DrawingApp drawingApp)
	{
			this.drawingApp = drawingApp ;
			setPreferredSize(new Dimension(100,100)) ;
	}
}
