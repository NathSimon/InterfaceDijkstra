package UserInterface;

import java.awt.*;
import javax.swing.* ;

public class MazeButtons extends JPanel{
	
	private final WallButton wallButton;
	private final ArrivalButton arrivalButton;
	private final DepartureButton departureButton;
	private final EmptyButton emptyButton;
	private WindowPanel windowPanel;
	
	public MazeButtons(DrawingApp drawingApp, WindowPanel windowPanel) {
		
		this.windowPanel = windowPanel;
		
		setLayout(new GridLayout(2,2)) ; // 1 row, 3 columns
		add(wallButton = new WallButton     (drawingApp, windowPanel));
		add(emptyButton   = new EmptyButton (drawingApp, windowPanel));
		add(departureButton   = new DepartureButton (drawingApp, windowPanel));
		add(arrivalButton   = new ArrivalButton (drawingApp, windowPanel));
	}
	
	public String getBlockType() {
		switch(windowPanel.getValueOfMouse()) {
		case 1 : return "Wall";
		case 2 : return "Empty";
		case 3 : return "Departure";
		case 4 : return "Arrival";
		default : return "ERROR";
		}
	}
	
}