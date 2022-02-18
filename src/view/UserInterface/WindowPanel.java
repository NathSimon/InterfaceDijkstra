package view.UserInterface;
import javax.swing.* ;
import java.awt.*;

public class WindowPanel extends JPanel
{
    private ButtonPanelMaze buttonPanelMaze ;
    private GridMazePanel gridMazePanel;
    private MazeApp mazeApp;
    private int valueOfMouse = 1;
    
	public WindowPanel(MazeApp mazeApp)
	{
		this.mazeApp = mazeApp;
		setLayout(new BorderLayout()) ;
		
		gridMazePanel = new GridMazePanel(this.mazeApp, this, 10,10);
		add(buttonPanelMaze = new ButtonPanelMaze (this.mazeApp, this, gridMazePanel), BorderLayout.WEST);	
		add(gridMazePanel, BorderLayout.CENTER);
	}
	
	public void initMazePanel(String colNum, String rowNum) {
		
		remove(gridMazePanel);
		remove(buttonPanelMaze);
		
		int colLen = Integer.parseInt(colNum);
		int rowLen = Integer.parseInt(rowNum);
		
		gridMazePanel = new GridMazePanel(mazeApp, this, rowLen, colLen);
		
		add(buttonPanelMaze = new ButtonPanelMaze (this.mazeApp, this, gridMazePanel), BorderLayout.WEST);	
		add(gridMazePanel, BorderLayout.CENTER);
		revalidate(); //ne pas oublier cette ligne sinon cest une nuit blanche pour rien
	}
	
	public void setValueOfMouse(int val) {
		valueOfMouse = val;
	}
	
	public GridMazePanel getGridMazePanel() {
		return gridMazePanel;
	}
	
	public ButtonPanelMaze getButtonPanelMaze() {
		return buttonPanelMaze;
	}
	
	public int getValueOfMouse() {
		return valueOfMouse;
	}
	
}