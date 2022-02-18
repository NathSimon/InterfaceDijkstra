package view.UserInterfaceMenus;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.* ;

import view.SaveFrame.*;
import view.UserInterfaceButtons.*;
import view.UserInterfaceMenus.*;
import view.UserInterface.*;

public class MinimizeMenuItem extends JMenuItem
{
	private static final long serialVersionUID = 1L;

	private final MazeApp mazeApp ;

	public MinimizeMenuItem(MazeApp mazeApp)
	{
		super("Minimize") ; // Text of menu item

		this.mazeApp = mazeApp ;
		
		addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){
				mazeApp.pack();
			}}); 
	}
}
