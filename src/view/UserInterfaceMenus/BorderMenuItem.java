package view.UserInterfaceMenus;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.* ;

import view.SaveFrame.*;
import view.UserInterfaceButtons.*;
import view.UserInterfaceMenus.*;
import view.UserInterface.*;

public class BorderMenuItem extends JMenuItem
{
	
	private static final long serialVersionUID = 1L;

	private final MazeApp mazeApp ;
	private int colorBorder = 1;

	public BorderMenuItem(MazeApp mazeApp)
	{
		super("Switch border color to black");

		this.mazeApp = mazeApp ;
		
		
		addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){
				colorBorder = mazeApp.getWindowPanel().getButtonPanelMaze().getButtonPanelSolve().getColorBorderButton().getColorBorder();
				changeText(colorBorder);
				mazeApp.getWindowPanel().getButtonPanelMaze().getButtonPanelSolve().getColorBorderButton().changeText(colorBorder);
				colorBorder = mazeApp.getWindowPanel().getGridMazePanel().setButtonsBorder(colorBorder); 
				mazeApp.getWindowPanel().getButtonPanelMaze().getButtonPanelSolve().getColorBorderButton().setColorBorder(colorBorder);
				
			}}); 
	}
	
	public void changeText(int colorBorder) {
		if(colorBorder == 0) {
			setText("Switch border color to black");
		}
		else {
			setText("Switch border color to gray");
		}
		
	}
	
	public int getColorBorder() {
		return colorBorder;
	}
	
	public void setColorBorder(int color) {
		colorBorder = color;
	}

}