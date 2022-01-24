package view.SaveFrame;
import javax.swing.* ;

import view.SaveFrame.*;
import view.UserInterfaceButtons.*;
import view.UserInterfaceMenus.*;
import view.UserInterface.*;


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