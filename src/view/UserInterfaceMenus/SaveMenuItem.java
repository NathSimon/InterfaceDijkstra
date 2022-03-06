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
public class SaveMenuItem extends JMenuItem
{

	private static final long serialVersionUID = 1L;

	private final MazeApp mazeApp ;

	public SaveMenuItem(MazeApp mazeApp)
	{
		super("Save to file") ; // Text of menu item

		this.mazeApp = mazeApp ;
		
		addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
				openSaveWindow();
			}}); 
	}
	
	private void openSaveWindow() {
		new SaveApp(mazeApp);
	}
	
	public void update () {
		//rien a update
	}
	//Runtime.getRuntime().exec("Explorer.exe "C:\Program Files\Adobe"); 
}

