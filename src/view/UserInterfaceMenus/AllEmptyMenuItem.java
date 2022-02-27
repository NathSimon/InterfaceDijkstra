package view.UserInterfaceMenus;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.* ;

import view.SaveFrame.*;
import view.UserInterfaceButtons.*;
import view.UserInterfaceMenus.*;
import view.UserInterface.*;

public class AllEmptyMenuItem extends JMenuItem
{
	private static final long serialVersionUID = 1L;

	private final MazeApp mazeApp ;

	public AllEmptyMenuItem(MazeApp mazeApp)
	{
		super("Put every box to empty") ; // Text of menu item

		this.mazeApp = mazeApp ;
		
		addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){
				mazeApp.getWindowPanel().getGridMazePanel().setAllEmpty();
			}}); 
	}
	
	public void update () {
		//rien a update
	}
}
