package UserInterfaceMenus;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.* ;

import UserInterface.DrawingApp;

public class FullscreenMenuItem extends JMenuItem
{
	
	private static final long serialVersionUID = 1L;

	private final DrawingApp drawingApp ;

	public FullscreenMenuItem(DrawingApp drawingApp)
	{
		super("Fullscreen") ; // Text of menu item

		this.drawingApp = drawingApp ;
		addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){
				drawingApp.setExtendedState(JFrame.MAXIMIZED_BOTH); 
			}}); 
	}

}