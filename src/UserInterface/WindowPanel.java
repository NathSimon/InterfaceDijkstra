package UserInterface;
import javax.swing.* ;
import java.awt.*;

public class WindowPanel extends JPanel
{
    private final ButtonPanelMaze buttonPanelMaze ;
    
	public WindowPanel(DrawingApp drawingApp)
	{
		setLayout(new BorderLayout()) ;
		
		add(buttonPanelMaze = new ButtonPanelMaze (drawingApp), BorderLayout.EAST);		
	}
	
}