package UserInterface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.* ;


public class DepartureButton extends JButton {

	private final DrawingApp drawingApp ;
	
	public DepartureButton(DrawingApp drawingApp, WindowPanel windowPanel)
	{
		super("Departure") ; // Button's text
		addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
		              windowPanel.setValueOfMouse(3);
			}}); 
		
		this.drawingApp = drawingApp ;
	}
}
