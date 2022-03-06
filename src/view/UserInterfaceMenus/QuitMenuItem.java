package view.UserInterfaceMenus;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.* ;

import view.SaveFrame.*;
import view.UserInterfaceButtons.*;
import view.UserInterfaceMenus.*;
import view.UserInterface.*;

/**
 * @author Nathanael
 *
 */
public class QuitMenuItem extends JMenuItem
{

	private static final long serialVersionUID = 1L;

	private final MazeApp mazeApp ;

	public QuitMenuItem(MazeApp mazeApp)
	{
		super("Quit") ; // Text of menu item

		this.mazeApp = mazeApp ;
		
		addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){ 
			
				int response = JOptionPane.showOptionDialog(mazeApp, " Quit the application ?", "Quit ?", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, null, null);
				
				switch(response) {
				
				case JOptionPane.CANCEL_OPTION :
					return ;
				case JOptionPane.OK_OPTION :
					mazeApp.closeFrame();
					break;
				case JOptionPane.NO_OPTION :
					break;
				}		
			}}); 

	}
	
	public void update () {
		//rien a update
	}
}

