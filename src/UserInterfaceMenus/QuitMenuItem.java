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
			
				int response = JOptionPane.showOptionDialog(drawingApp, " Quit the application ?", "Quit ?", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, null, null);
				
				switch(response) {
				
				case JOptionPane.CANCEL_OPTION :
					return ;
				case JOptionPane.OK_OPTION :
					drawingApp.closeFrame();
					break;
				case JOptionPane.NO_OPTION :
					break;
				}		
			}}); 

	}
}

