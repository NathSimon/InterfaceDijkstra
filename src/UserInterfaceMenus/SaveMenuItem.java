package UserInterfaceMenus;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.* ;

import SaveFrame.SaveApp;
import SaveFrame.SaveFrame;
import UserInterface.DrawingApp;

public class SaveMenuItem extends JMenuItem
{

	private static final long serialVersionUID = 1L;

	private final DrawingApp drawingApp ;

	public SaveMenuItem(DrawingApp drawingApp)
	{
		super("Save to file") ; // Text of menu item

		this.drawingApp = drawingApp ;
		
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
		new SaveApp();
	}
	
	//Runtime.getRuntime().exec("Explorer.exe "C:\Program Files\Adobe"); 
}

