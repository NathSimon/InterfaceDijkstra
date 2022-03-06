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
public class FullscreenMenuItem extends JMenuItem
{
	
	private static final long serialVersionUID = 1L;

	private final MazeApp mazeApp ;

	public FullscreenMenuItem(MazeApp mazeApp)
	{
		super("Fullscreen") ; // Text of menu item

		this.mazeApp = mazeApp ;
		addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){
				mazeApp.setExtendedState(JFrame.MAXIMIZED_BOTH); 
			}}); 
	}
	
	public void update() {
		//rien a update
	}

}