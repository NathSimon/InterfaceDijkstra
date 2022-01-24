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
  
	public SavePanel(SaveApp saveApp, DrawingApp drawingApp)
	{
		this.saveApp = saveApp;
		setLayout(new BorderLayout()) ;

		add(saveFieldsPanel = new SaveFieldsPanel(saveApp, drawingApp), BorderLayout.CENTER);	
	}
}