package SaveFrame;
import javax.swing.* ;

import UserInterface.DrawingApp;

import java.awt.*;

public class ImportPanel extends JPanel
{
    private ImportApp importApp;
    private ImportFieldsPanel importFieldsPanel;
  
	public ImportPanel(ImportApp importApp, DrawingApp drawingApp)
	{
		this.importApp = importApp;
		setLayout(new BorderLayout()) ;

		add(importFieldsPanel = new ImportFieldsPanel(importApp, drawingApp), BorderLayout.CENTER);	
	}

}