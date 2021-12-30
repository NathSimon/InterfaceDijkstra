package UserInterface;

import java.awt.*;
import javax.swing.* ;

public class MazeButtons extends JPanel{
	
	private final WallButton wallButton;
	private final ArrivalButton arrivalButton;
	private final DepartureButton departureButton;
	private final EmptyButton emptyButton;
	
	public MazeButtons(DrawingApp drawingApp) {
		
		setLayout(new GridLayout(2,2)) ; // 1 row, 3 columns
		add(wallButton = new WallButton     (drawingApp));
		add(emptyButton   = new EmptyButton (drawingApp));
		add(arrivalButton   = new ArrivalButton (drawingApp));
		add(departureButton   = new DepartureButton (drawingApp));
	}
}