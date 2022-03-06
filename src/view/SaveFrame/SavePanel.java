package view.SaveFrame;
import javax.swing.* ;

import view.SaveFrame.*;
import view.UserInterfaceButtons.*;
import view.UserInterfaceMenus.*;
import view.UserInterface.*;

import java.awt.*;

/**
 * @author Nathanael
 *
 */
public class SavePanel extends JPanel
{
    private final SaveApp saveApp;
    private final SaveFieldsPanel saveFieldsPanel;
  
	public SavePanel(SaveApp saveApp, MazeApp mazeApp)
	{
		this.saveApp = saveApp;
		setLayout(new BorderLayout()) ;

		add(saveFieldsPanel = new SaveFieldsPanel(saveApp, mazeApp), BorderLayout.CENTER);	
	}
}