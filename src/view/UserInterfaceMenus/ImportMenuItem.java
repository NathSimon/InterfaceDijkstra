package view.UserInterfaceMenus;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.* ;

import view.SaveFrame.*;
import view.UserInterfaceButtons.*;
import view.UserInterfaceMenus.*;
import view.UserInterface.*;

public class ImportMenuItem extends JMenuItem
{

	private static final long serialVersionUID = 1L;

	private final MazeApp mazeApp ;

	public ImportMenuItem(MazeApp mazeApp)
	{
		super("Import Maze") ; // Text of menu item

		this.mazeApp = mazeApp ;
		
		addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
				openSaveWindow();
			}}); 
	}
	
	private void openSaveWindow() {
		new ImportApp(mazeApp);
	}
	
	public void update () {
		//rien a update
	}

}
