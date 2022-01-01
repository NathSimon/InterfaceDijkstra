package UserInterface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.* ;


public class GridMazeButton extends JButton {

	private final DrawingApp drawingApp ;
	private WindowPanel windowPanel;
	private int index;
	private String label;
	
	public GridMazeButton(DrawingApp drawingApp, WindowPanel windowPanel, int index)
	{
		super("Empty");// Button's text
		this.setLabel("E");
		setIcon(new ImageIcon("data/Empty.png"));
		
		this.index = index;
		this.drawingApp = drawingApp ;
		this.windowPanel = windowPanel;
		
		addActionListener(new ActionListener(){  
			  public void actionPerformed(ActionEvent e){  
			        if(windowPanel.getValueOfMouse() == 1) {      
			        	setLabel("W");
			        }
			        if(windowPanel.getValueOfMouse() == 2) {   
					  	setText("Empty"); 
					  	setLabel("E");
			        }
			        if(windowPanel.getValueOfMouse() == 3) {      
					  	resetDeparture();
				        setText("Departure");  
					  	setLabel("D");
					  	recalculatePath();
				  	
			        }
			        if(windowPanel.getValueOfMouse() == 4) {     
				        resetArrival();
					  	setText("Arrival");  
					  	setLabel("A");
					  	recalculatePath();
			        }
			  }
		});  
	}
	
	public int resetDeparture() {
		for(int i = 0; i < windowPanel.getGridMazePanel().getRowLen() * windowPanel.getGridMazePanel().getColLen(); i++) {
			if(windowPanel.getGridMazePanel().getMazeButton(i).getLabel().equals("D")) {
				windowPanel.getGridMazePanel().getMazeButton(i).setLabel("E");
				return 1;
			}
		}
		return 0;
	}
	
	public int resetArrival() {
		for(int i = 0; i < windowPanel.getGridMazePanel().getRowLen() * windowPanel.getGridMazePanel().getColLen(); i++) {
			if(windowPanel.getGridMazePanel().getMazeButton(i).getLabel().equals("A")) {
				windowPanel.getGridMazePanel().getMazeButton(i).setLabel("E");
				return 1;
			}
		}
		return 0;
	}
	
	public void recalculatePath() {
		for(int i = 0; i < windowPanel.getGridMazePanel().getRowLen() * windowPanel.getGridMazePanel().getColLen(); i++) {
			if(windowPanel.getGridMazePanel().getMazeButton(i).getLabel().equals("D")) {
				for(int j = 0; j < windowPanel.getGridMazePanel().getRowLen() * windowPanel.getGridMazePanel().getColLen(); j++) {
					if(windowPanel.getGridMazePanel().getMazeButton(j).getLabel().equals("A")) {
						windowPanel.getButtonPanelMaze().getSolveButton().solveAction();
					}
				}
			}
		}
	}
	
	public int getIndex() {
		return index;
	}
	
	public void setLabel(String value) {
		this.label = value;
		switch(label) {
		case "E" : setIcon(new ImageIcon("data/Empty.png"));
			break;
		case "W" : setIcon(new ImageIcon("data/Wall.jpg"));
			break;
		case "D" : setIcon(null);
			break;
		case "A": setIcon(null);
			break;
		default :
			break;
		};
	}
	
	public String getLabel() {
		return label;
	}
}
