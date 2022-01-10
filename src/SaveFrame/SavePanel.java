package SaveFrame;
import javax.swing.* ;

import UserInterface.DrawingApp;

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