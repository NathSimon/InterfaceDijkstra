package UserInterfaceButtons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.* ;

import UserInterface.DrawingApp;
import UserInterface.WindowPanel;


public class EmptyButton extends JButton {

	private final DrawingApp drawingApp ;
	
	public EmptyButton(DrawingApp drawingApp, WindowPanel windowPanel)
	{
		super("Empty") ; // Button's text
		addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
		              windowPanel.setValueOfMouse(2);
				      windowPanel.getButtonPanelMaze().updateBlockType(); //mise a jour de linfo user sur le block selectionne

			}}); 
		
		this.drawingApp = drawingApp ;
	}
}
