package UserInterface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.* ;


public class WallButton extends JButton {

	private final DrawingApp drawingApp ;
	
	public WallButton(DrawingApp drawingApp, WindowPanel windowPanel)
	{
		super("Wall") ; // Button's text
				
		addActionListener(new ActionListener(){  
				public void actionPerformed(ActionEvent e){  
			              windowPanel.setValueOfMouse(1);
				}}); 
		this.drawingApp = drawingApp ;
	}
}

