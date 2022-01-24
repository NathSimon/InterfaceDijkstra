package view.UserInterfaceButtons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.* ;

import view.SaveFrame.*;
import view.UserInterfaceButtons.*;
import view.UserInterfaceMenus.*;
import view.UserInterface.*;


public class WallButton extends JButton {

	private final DrawingApp drawingApp ;
	
	public WallButton(DrawingApp drawingApp, WindowPanel windowPanel)
	{
		super("Wall / Empty") ; // Button's text
				
		addActionListener(new ActionListener(){  
				public void actionPerformed(ActionEvent e){  
			              windowPanel.setValueOfMouse(1);
					      windowPanel.getButtonPanelMaze().updateBlockType(); //mise a jour de linfo user sur le block selectionne

				}}); 
		this.drawingApp = drawingApp ;
	}
}

