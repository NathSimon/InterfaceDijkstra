package UserInterface;
import javax.swing.* ;
import java.awt.*;

public class WindowPanel extends JPanel
{
    private ButtonPanelMaze buttonPanelMaze ;
    private GridMazePanel gridMazePanel;
    private DrawingApp drawingApp;
    private int valueOfMouse = 1;
    
	public WindowPanel(DrawingApp drawingApp)
	{
		this.drawingApp = drawingApp;
		setLayout(new BorderLayout()) ;
		
		gridMazePanel = new GridMazePanel(this.drawingApp, this, 10,10);
		add(buttonPanelMaze = new ButtonPanelMaze (this.drawingApp, this, gridMazePanel), BorderLayout.EAST);	
		add(gridMazePanel, BorderLayout.CENTER);
	}
	
	public void initMazePanel(String colNum, String rowNum) {
		
		remove(gridMazePanel);
		remove(buttonPanelMaze);
		
		int colLen = Integer.parseInt(colNum);
		int rowLen = Integer.parseInt(rowNum);
		
		gridMazePanel = new GridMazePanel(drawingApp, this, rowLen, colLen);
		
		add(buttonPanelMaze = new ButtonPanelMaze (this.drawingApp, this, gridMazePanel), BorderLayout.EAST);	
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