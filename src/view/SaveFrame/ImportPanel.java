package view.SaveFrame;
import javax.swing.* ;

import view.SaveFrame.*;
import view.UserInterfaceButtons.*;
import view.UserInterfaceMenus.*;
import view.UserInterface.*;


import java.awt.*;

public class ImportPanel extends JPanel
{
    private final ImportApp importApp;
    private final ImportFieldsPanel importFieldsPanel;
  
	public ImportPanel(ImportApp importApp, MazeApp mazeApp)
	{
		this.importApp = importApp;
		setLayout(new BorderLayout()) ;

		add(importFieldsPanel = new ImportFieldsPanel(importApp, mazeApp), BorderLayout.CENTER);	
	}

}