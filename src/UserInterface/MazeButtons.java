package UserInterface;

import java.awt.*;
import javax.swing.* ;

import UserInterfaceButtons.ArrivalButton;
import UserInterfaceButtons.DepartureButton;
import UserInterfaceButtons.EmptyButton;
import UserInterfaceButtons.WallButton;

public class MazeButtons extends JPanel{
	
	private final WallButton wallButton;
	private final ArrivalButton arrivalButton;
	private final DepartureButton departureButton;
	//private final EmptyButton emptyButton;
	private WindowPanel windowPanel;
	private Container secondContainer;
	
	public MazeButtons(DrawingApp drawingApp, WindowPanel windowPanel) {
		
		this.windowPanel = windowPanel;
		secondContainer = new Container();
		secondContainer.setLayout(new GridLayout(1,2));
		secondContainer.add(departureButton   = new DepartureButton (drawingApp, windowPanel));
		secondContainer.add(arrivalButton   = new ArrivalButton (drawingApp, windowPanel));
		
		setLayout(new GridLayout(2,1)) ; // 1 row, 3 columns
		
		add(wallButton = new WallButton     (drawingApp, windowPanel));
		add(secondContainer);
		//add(emptyButton   = new EmptyButton (drawingApp, windowPanel));
		
	}
	
	public String getBlockType() {
		switch(windowPanel.getValueOfMouse()) {
		case 1 : return "Wall / Empty";
		case 2 : return "Empty";
		case 3 : return "Departure";
		case 4 : return "Arrival";
		default : return "ERROR";
		}
	}
	
}