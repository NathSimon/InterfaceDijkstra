package UserInterface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.* ;


public class ArrivalButton extends JButton {

	private final DrawingApp drawingApp ;
	
	public ArrivalButton(DrawingApp drawingApp, WindowPanel windowPanel)
	{
		super("Arrival") ; // Button's text
		addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
		              windowPanel.setValueOfMouse(4);
				      windowPanel.getButtonPanelMaze().updateBlockType(); //mise a jour de linfo user sur le block selectionne

			}}); 
		
		this.drawingApp = drawingApp ;
	}
}
