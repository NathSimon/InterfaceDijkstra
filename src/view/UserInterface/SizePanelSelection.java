package view.UserInterface;
import java.awt.Dimension;

import javax.swing.* ;

public class SizePanelSelection extends JPanel {

	private static final long serialVersionUID = 1L;

	private final MazeApp mazeApp ;
	
	public SizePanelSelection(MazeApp mazeApp)
	{
			this.mazeApp = mazeApp ;
			setPreferredSize(new Dimension(100,100)) ;
	}
}
