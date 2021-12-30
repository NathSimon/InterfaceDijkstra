package UserInterface;
import javax.swing.* ;
import java.awt.*;

public class WindowPanel extends JPanel
{
    private final ButtonPanelMaze buttonPanelMaze ;
    private final GridMazePanel gridMazePanel;
    
	public WindowPanel(DrawingApp drawingApp)
	{
		setLayout(new BorderLayout()) ;
		
		add(buttonPanelMaze = new ButtonPanelMaze (drawingApp), BorderLayout.EAST);	
		add(gridMazePanel = new GridMazePanel(drawingApp, 2,7), BorderLayout.CENTER);
	}
	
}