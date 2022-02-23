package view.UserInterfaceButtons;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.* ;

import model.appModel.AppModel;
import view.SaveFrame.*;
import view.UserInterfaceButtons.*;
import view.UserInterfaceMenus.*;
import view.UserInterface.*;


public class GridMazeButton extends JButton {

	private final MazeApp mazeApp ;
	private final WindowPanel windowPanel;
	private String label;
	private String mode;
	private final AppModel appModel;
	
	
	public GridMazeButton(MazeApp mazeApp, WindowPanel windowPanel)
	{
		super();// Button's text
		this.label = "E";
		
		this.mazeApp = mazeApp ;
		this.appModel = mazeApp.getAppModel();
		this.windowPanel = windowPanel;
		
		setButtonColor(Color.LIGHT_GRAY);
		
		
		addActionListener(new ActionListener(){  
			  public void actionPerformed(ActionEvent e){ 
				 				  
			        if(appModel.getValueOfMouse() == 1) {    
			        	if(getLabel().equals("W")) {
			        		setLabel("E");
			        	}
			        	else {
			        		setLabel("W");
			        	}
			        }
			        if(appModel.getValueOfMouse() == 2) {
					  	setText("Empty"); 
					  	setLabel("E");
			        }
			        if(appModel.getValueOfMouse() == 3) {      
					  	resetDeparture();
				        setText("Departure");  
					  	setLabel("D");
				  	
			        }
			        if(appModel.getValueOfMouse() == 4) {     
				        resetArrival();
					  	setText("Arrival");  
					  	setLabel("A");
			        }

			        if(appModel.getMode().equals("AUTO")) {
			        	recalculatePath();
			        }
			  }
		});  
	}
	
	public int resetDeparture() {
		for(int i = 0; i < appModel.getSizeRowInt()* appModel.getSizeColInt(); i++) {
			if(windowPanel.getGridMazePanel().getMazeButton(i).getLabel().equals("D")) {
				windowPanel.getGridMazePanel().getMazeButton(i).setText(null);
				windowPanel.getGridMazePanel().getMazeButton(i).setLabel("E");
				return 1;
			}
		}
		return 0;
	}
	
	public int resetArrival() {
		for(int i = 0; i < appModel.getSizeRowInt()* appModel.getSizeColInt(); i++) {
			if(windowPanel.getGridMazePanel().getMazeButton(i).getLabel().equals("A")) {
				windowPanel.getGridMazePanel().getMazeButton(i).setText(null);
				windowPanel.getGridMazePanel().getMazeButton(i).setLabel("E");
				return 1;
			}
		}
		return 0;
	}
	
	public void recalculatePath() {
		for(int i = 0; i < appModel.getSizeRowInt()* appModel.getSizeColInt(); i++) {
			if(windowPanel.getGridMazePanel().getMazeButton(i).getLabel().equals("D")) {
				for(int j = 0; j <  appModel.getSizeRowInt()* appModel.getSizeColInt(); j++) {
					if(windowPanel.getGridMazePanel().getMazeButton(j).getLabel().equals("A")) {
						windowPanel.getButtonPanelMaze().getSolveButton().solveAction();
					}
				}
			}
		}
	}
	
	public void setButtonColor(Color color) {
		setBackground(color);
		setContentAreaFilled(false);
		setOpaque(true);
	}
	
	public void setLabel(String value) {
		
		this.label = value;
		
		switch(label) {
		case "E" :	setText(null);
					setButtonColor(Color.LIGHT_GRAY);
			break;
		case "W" :  setText(null);
					setButtonColor(Color.DARK_GRAY);
			break;
		case "D" :  setButtonColor(Color.YELLOW);
			break;
		case "A":   setButtonColor(Color.GREEN);
			break;
		default :
			break;
		};
	}
	
	public String getLabel() {
		return label;
	}
}
