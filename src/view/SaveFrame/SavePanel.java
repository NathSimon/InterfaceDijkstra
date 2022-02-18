package view.SaveFrame;
import javax.swing.* ;

import view.SaveFrame.*;
import view.UserInterfaceButtons.*;
import view.UserInterfaceMenus.*;
import view.UserInterface.*;

import java.awt.*;

public class SavePanel extends JPanel
{
    private SaveApp saveApp;
    private SaveFieldsPanel saveFieldsPanel;
  
	public SavePanel(SaveApp saveApp, MazeApp mazeApp)
	{
		this.saveApp = saveApp;
		setLayout(new BorderLayout()) ;

		add(saveFieldsPanel = new SaveFieldsPanel(saveApp, mazeApp), BorderLayout.CENTER);	
	}
}