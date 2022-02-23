package view.UserInterfaceMenus;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.* ;

import model.appModel.AppModel;
import view.SaveFrame.*;
import view.UserInterfaceButtons.*;
import view.UserInterfaceMenus.*;
import view.UserInterface.*;

public class ResetMenuItem extends JMenuItem implements ActionListener{

	private static final long serialVersionUID = 1L;

	private final MazeApp mazeApp ;
	private final AppModel appModel;

	public ResetMenuItem(MazeApp mazeApp, WindowPanel windowPanel, GridMazePanel gridMazePanel)
	{
		super("Reset") ; // Text of menu item

		this.mazeApp = mazeApp ;
		appModel = mazeApp.getAppModel();
		
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
			this.mazeApp.getWindowPanel().initMazePanel(appModel.getSizeCol(), appModel.getSizeRow());
			break;
		case JOptionPane.NO_OPTION :
			break;
		}	
	}
}
