package SaveFrame;
import javax.swing.* ;

import java.awt.*;

public class SavePanel extends JPanel
{
    private SaveApp saveApp;
    private SaveFieldsPanel saveFieldsPanel;
    
	public SavePanel(SaveApp saveApp)
	{
		this.saveApp = saveApp;
		setLayout(new BorderLayout()) ;

		add(saveFieldsPanel = new SaveFieldsPanel(saveApp), BorderLayout.CENTER);	
	}
}