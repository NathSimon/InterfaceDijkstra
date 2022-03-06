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
public class AllWallMenuItem extends JMenuItem
{
	private static final long serialVersionUID = 1L;

	private final MazeApp mazeApp ;

	public AllWallMenuItem(MazeApp mazeApp)
	{
		super("Put every box to wall") ; // Text of menu item

		this.mazeApp = mazeApp ;
		
		addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){
				mazeApp.getWindowPanel().getGridMazePanel().setAllWall();
			}}); 
	}
	
	public void update () {
		//rien a update
	}
}
