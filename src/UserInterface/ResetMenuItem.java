package UserInterface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.* ;

public class ResetMenuItem extends JMenuItem
{

	private static final long serialVersionUID = 1L;

	private final DrawingApp drawingApp ;

	public ResetMenuItem(DrawingApp drawingApp, WindowPanel windowPanel, GridMazePanel gridMazePanel)
	{
		super("Reset") ; // Text of menu item

		this.drawingApp = drawingApp ;
		
		addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
				windowPanel.initMazePanel(Integer.toString(gridMazePanel.getColLen()), Integer.toString(gridMazePanel.getRowLen()));
			}}); 
	}

}
