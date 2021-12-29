package UserInterface;

import java.awt.*;
import javax.swing.* ;

public class ButtonPanelMaze extends JPanel
{
	private final WallButton wallButton;
	private final ArrivalButton arrivalButton;
	private final DepartureButton departureButton;
	private final EmptyButton emptyButton;
	private final ResetButton resetButton;
	private final SolveButton solveButton;
	
	public ButtonPanelMaze(DrawingApp drawingApp)
	{
		setLayout(new GridLayout(4,2)) ; // 1 row, 3 columns
		add(wallButton = new WallButton     (drawingApp));
		add(emptyButton   = new EmptyButton (drawingApp));
		add(arrivalButton   = new ArrivalButton (drawingApp));
		add(departureButton   = new DepartureButton (drawingApp));
		add(Box.createRigidArea(new Dimension(0, 80)));
		add(Box.createRigidArea(new Dimension(0, 80)));
		add(solveButton   = new SolveButton(drawingApp)) ;
		add(resetButton = new ResetButton(drawingApp));
	}
}

