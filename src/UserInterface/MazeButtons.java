package UserInterface;

import java.awt.*;
import javax.swing.* ;

public class MazeButtons extends JPanel{
	
	private final WallButton wallButton;
	private final ArrivalButton arrivalButton;
	private final DepartureButton departureButton;
	private final EmptyButton emptyButton;
	
	public MazeButtons(DrawingApp drawingApp, WindowPanel windowPanel) {
		
		setLayout(new GridLayout(2,2)) ; // 1 row, 3 columns
		add(wallButton = new WallButton     (drawingApp, windowPanel));
		add(emptyButton   = new EmptyButton (drawingApp, windowPanel));
		add(arrivalButton   = new ArrivalButton (drawingApp, windowPanel));
		add(departureButton   = new DepartureButton (drawingApp, windowPanel));
	}
}