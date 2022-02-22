package view.UserInterfaceButtons;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.* ;

import view.SaveFrame.*;
import view.UserInterfaceButtons.*;
import view.UserInterfaceMenus.*;
import view.UserInterface.*;


public class GridMazeButton extends JButton {

	private final MazeApp mazeApp ;
	private WindowPanel windowPanel;
	private int index;
	private String label;
	private String mode;
	private ImageIcon wallImage;
	private ImageIcon emptyImage;
	private Image wallImageSized;
	
	
	public GridMazeButton(MazeApp mazeApp, WindowPanel windowPanel, int index)
	{
		super();// Button's text
		this.label = "E";
		
		
		this.index = index;
		this.mazeApp = mazeApp ;
		this.windowPanel = windowPanel;
		
		emptyImage = new ImageIcon("data/Empty.png");
		wallImage = new ImageIcon("data/Wall.jpg");
		
		//setIcon(emptyImage);
		setButtonColor(Color.LIGHT_GRAY);
		
		
		addActionListener(new ActionListener(){  
			  public void actionPerformed(ActionEvent e){ 
				 				  
			        if(windowPanel.getValueOfMouse() == 1) {    
			        	if(getLabel().equals("W")) {
			        		setLabel("E");
			        	}
			        	else {
			        		setLabel("W");
			        	}
			        }
			        if(windowPanel.getValueOfMouse() == 2) {
					  	setText("Empty"); 
					  	setLabel("E");
			        }
			        if(windowPanel.getValueOfMouse() == 3) {      
					  	resetDeparture();
				        setText("Departure");  
					  	setLabel("D");
				  	
			        }
			        if(windowPanel.getValueOfMouse() == 4) {     
				        resetArrival();
					  	setText("Arrival");  
					  	setLabel("A");
			        }
					 
			        mode = windowPanel.getButtonPanelMaze().getModeButton().getMode();
			        if(mode.equals("AUTO")) {
			        	recalculatePath();
			        }
			  }
		});  
	}
	
	public int resetDeparture() {
		for(int i = 0; i < windowPanel.getGridMazePanel().getRowLen() * windowPanel.getGridMazePanel().getColLen(); i++) {
			if(windowPanel.getGridMazePanel().getMazeButton(i).getLabel().equals("D")) {
				windowPanel.getGridMazePanel().getMazeButton(i).setText(null);
				windowPanel.getGridMazePanel().getMazeButton(i).setLabel("E");
				return 1;
			}
		}
		return 0;
	}
	
	public int resetArrival() {
		for(int i = 0; i < windowPanel.getGridMazePanel().getRowLen() * windowPanel.getGridMazePanel().getColLen(); i++) {
			if(windowPanel.getGridMazePanel().getMazeButton(i).getLabel().equals("A")) {
				windowPanel.getGridMazePanel().getMazeButton(i).setText(null);
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
	
	public void setButtonColor(Color color) {
		setBackground(color);
		setContentAreaFilled(false);
		setOpaque(true);
	}
	
	public void setLabel(String value) {
		
		this.label = value;
		
		switch(label) {
		case "E" :	setButtonColor(Color.LIGHT_GRAY);
			break;
		case "W" : setButtonColor(Color.DARK_GRAY);
			break;
		case "D" : setButtonColor(Color.YELLOW);
			break;
		case "A": setButtonColor(Color.GREEN);
			break;
		default :
			break;
		};
	}
	
	public String getLabel() {
		return label;
	}
}
