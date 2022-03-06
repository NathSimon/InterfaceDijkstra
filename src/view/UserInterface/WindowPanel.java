package view.UserInterface;
import javax.swing.* ;
import java.awt.*;

/**
 * @author Nathanael
 *
 */
public class WindowPanel extends JPanel
{

	private static final long serialVersionUID = 1L;
	
	private ButtonPanelMaze buttonPanelMaze ;
    private GridMazePanel gridMazePanel;
    private final MazeApp mazeApp;
    
	public WindowPanel(MazeApp mazeApp)
	{
		this.mazeApp = mazeApp;
		setLayout(new BorderLayout()) ;
		
		gridMazePanel = new GridMazePanel(this.mazeApp, this);
		add(buttonPanelMaze = new ButtonPanelMaze (this.mazeApp, this, gridMazePanel), BorderLayout.WEST);	
		add(gridMazePanel, BorderLayout.CENTER);
	}
	
	public void initMazePanel() {
		
		remove(gridMazePanel);
		remove(buttonPanelMaze);
	
		gridMazePanel = new GridMazePanel(mazeApp, this);
		
		add(buttonPanelMaze = new ButtonPanelMaze (this.mazeApp, this, gridMazePanel), BorderLayout.WEST);	
		add(gridMazePanel, BorderLayout.CENTER);
		revalidate(); 
	}

	public GridMazePanel getGridMazePanel() {
		return gridMazePanel;
	}
	
	public ButtonPanelMaze getButtonPanelMaze() {
		return buttonPanelMaze;
	}	

	public void notifyForUpdate() {
		gridMazePanel.notifyForUpdate();
		buttonPanelMaze.notifyForUpdate();
	}
	
}