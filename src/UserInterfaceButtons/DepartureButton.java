package UserInterfaceButtons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.* ;

import UserInterface.DrawingApp;
import UserInterface.WindowPanel;


public class DepartureButton extends JButton {

	private final DrawingApp drawingApp ;
	
	public DepartureButton(DrawingApp drawingApp, WindowPanel windowPanel)
	{
		super("Departure") ; // Button's text
		addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
		              windowPanel.setValueOfMouse(3);
				      windowPanel.getButtonPanelMaze().updateBlockType(); //mise a jour de linfo user sur le block selectionne

			}}); 
		
		this.drawingApp = drawingApp ;
	}
}
