package UserInterfaceMenus;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.* ;

import SaveFrame.ImportApp;
import SaveFrame.SaveApp;
import UserInterface.DrawingApp;

public class ImportMenuItem extends JMenuItem
{

	private static final long serialVersionUID = 1L;

	private final DrawingApp drawingApp ;

	public ImportMenuItem(DrawingApp drawingApp)
	{
		super("Import Maze") ; // Text of menu item

		this.drawingApp = drawingApp ;
		
		addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
				openSaveWindow();
			}}); 
	}
	
	private void openSaveWindow() {
		new ImportApp(drawingApp);
	}

}
