package UserInterface;
import javax.swing.* ;
import java.awt.*;

public class WindowPanel extends JPanel
{
    private final ButtonPanelMaze buttonPanelMaze ;
    private final GridMazePanel gridMazePanel;
    private int valueOfMouse = 0;
    
	public WindowPanel(DrawingApp drawingApp)
	{
		setLayout(new BorderLayout()) ;
		
		gridMazePanel = new GridMazePanel(drawingApp, this, 10,10);
		add(buttonPanelMaze = new ButtonPanelMaze (drawingApp, this), BorderLayout.EAST);	
		add(gridMazePanel, BorderLayout.CENTER);
	}
	
	public void setValueOfMouse(int val) {
		valueOfMouse = val;
	}
	
	public GridMazePanel getGridMazePanel() {
		return gridMazePanel;
	}
	
	public int getValueOfMouse() {
		return valueOfMouse;
	}
	
}