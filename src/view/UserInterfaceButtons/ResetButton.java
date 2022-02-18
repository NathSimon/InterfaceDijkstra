package view.UserInterfaceButtons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.* ;

import view.SaveFrame.*;
import view.UserInterfaceButtons.*;
import view.UserInterfaceMenus.*;
import view.UserInterface.*;

public class ResetButton extends JButton {

	private static final long serialVersionUID = 1L;

	private final MazeApp mazeApp ;

	public ResetButton(MazeApp mazeApp, WindowPanel windowPanel, GridMazePanel gridMazePanel)
	{
		super("RESET") ; // Text of menu item

		this.mazeApp = mazeApp ;
		
		//addActionListener(this);
		
		addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){  
			mazeApp.getMazeMenuBar().getMazeMenu().getResetMenuItem().actionPerformed(e);
		}});
	}

}