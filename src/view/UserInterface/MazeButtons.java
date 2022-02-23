package view.UserInterface;

import java.awt.*;
import javax.swing.* ;

import model.appModel.AppModel;
import view.SaveFrame.*;
import view.UserInterfaceButtons.*;
import view.UserInterfaceMenus.*;
import view.UserInterface.*;

public class MazeButtons extends JPanel{
	
	private final WallButton wallButton;
	private final ArrivalButton arrivalButton;
	private final DepartureButton departureButton;
	//private final EmptyButton emptyButton;
	private final WindowPanel windowPanel;
	private final Container secondContainer;
	private final AppModel appModel;
	
	public MazeButtons(MazeApp mazeApp, WindowPanel windowPanel) {
		
		this.windowPanel = windowPanel;
		
		appModel = mazeApp.getAppModel();
		secondContainer = new Container();
		secondContainer.setLayout(new GridLayout(1,2));
		secondContainer.add(departureButton   = new DepartureButton (mazeApp, windowPanel));
		secondContainer.add(arrivalButton   = new ArrivalButton (mazeApp, windowPanel));
		
		setLayout(new GridLayout(2,1)) ; // 1 row, 3 columns
		
		add(wallButton = new WallButton     (mazeApp, windowPanel));
		add(secondContainer);
		//add(emptyButton   = new EmptyButton (mazeApp, windowPanel));
		
	}
	
	public String getBlockType() {
		switch(appModel.getValueOfMouse()) {
		case 1 : return "Wall / Empty";
		case 2 : return "Empty";
		case 3 : return "Departure";
		case 4 : return "Arrival";
		default : return "ERROR";
		}
	}
	
}