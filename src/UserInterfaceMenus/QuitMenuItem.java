package UserInterfaceMenus;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.* ;

import UserInterface.DrawingApp;

public class QuitMenuItem extends JMenuItem
{

	private static final long serialVersionUID = 1L;

	private final DrawingApp drawingApp ;

	public QuitMenuItem(DrawingApp drawingApp)
	{
		super("Quit") ; // Text of menu item

		this.drawingApp = drawingApp ;
		
		addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
				drawingApp.closeFrame();
		}}); 

	}

}