package UserInterfaceMenus;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.* ;

import UserInterface.DrawingApp;
import UserInterface.GridMazePanel;
import UserInterface.WindowPanel;

public class ResetMenuItem extends JMenuItem implements ActionListener{

	private static final long serialVersionUID = 1L;

	private final DrawingApp drawingApp ;

	public ResetMenuItem(DrawingApp drawingApp, WindowPanel windowPanel, GridMazePanel gridMazePanel)
	{
		super("Reset") ; // Text of menu item

		this.drawingApp = drawingApp ;
		
		addActionListener(this);
//			public void actionPerformed(ActionEvent e){  
//				windowPanel.initMazePanel(Integer.toString(gridMazePanel.getColLen()), Integer.toString(gridMazePanel.getRowLen()));
//			}});
	}
	public void actionPerformed(ActionEvent evt) {
		
		int response = JOptionPane.showInternalOptionDialog(this, " Reset the maze?", "Reset ?", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, null, null);
		switch(response) {
		case JOptionPane.CANCEL_OPTION :
			return ;
		case JOptionPane.OK_OPTION :
			this.drawingApp.getWindowPanel().initMazePanel(Integer.toString(drawingApp.getWindowPanel().getGridMazePanel().getColLen()), Integer.toString(drawingApp.getWindowPanel().getGridMazePanel().getRowLen()));
			break;
		case JOptionPane.NO_OPTION :
			break;
		}	
	}
}
