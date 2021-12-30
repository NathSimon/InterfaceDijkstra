package UserInterface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.* ;


public class GridMazeButton extends JButton {

	private final DrawingApp drawingApp ;
	private int index;
	private String label;
	
	public GridMazeButton(DrawingApp drawingApp, WindowPanel windowPanel, int index)
	{
		super("Empty");// Button's text
		this.setLabel("E");
		
		this.index = index;
		this.drawingApp = drawingApp ;
		
		addActionListener(new ActionListener(){  
			  public void actionPerformed(ActionEvent e){  
			        if(windowPanel.getValueOfMouse() == 1) {      
				  	setText("Wall"); 
				  	setLabel("W");
			        }
			        if(windowPanel.getValueOfMouse() == 2) {      
				  	setText("Empty");  
				  	setLabel("E");
			        }
			        if(windowPanel.getValueOfMouse() == 3) {      
				  	setText("Departure");  
				  	setLabel("D");
			        }
			        if(windowPanel.getValueOfMouse() == 4) {      
				  	setText("Arrival");  
				  	setLabel("A");
			        }
			  }
		});  
	}
	
	public int getIndex() {
		return index;
	}
	
	public void setLabel(String value) {
		this.label = value;
	}
	
	public void setIcon(Icon b) {
		//pour modifier licone du boutton
	}
}
