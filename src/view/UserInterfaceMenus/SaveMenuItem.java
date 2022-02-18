package view.UserInterfaceMenus;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.* ;

import view.SaveFrame.*;
import view.UserInterfaceButtons.*;
import view.UserInterfaceMenus.*;
import view.UserInterface.*;

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
	
	public static boolean isWindows() {

	    String os = System.getProperty("os.name").toLowerCase();
	    // windows
	    return (os.indexOf("win") >= 0);

	}
	
	private void openSaveWindow() {
		new SaveApp(mazeApp);
	}
	
	//Runtime.getRuntime().exec("Explorer.exe "C:\Program Files\Adobe"); 
}

