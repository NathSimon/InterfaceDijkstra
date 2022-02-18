package view.UserInterfaceButtons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.* ;

import Maze.MazeReadingException;
import view.SaveFrame.*;
import view.UserInterfaceButtons.*;
import view.UserInterfaceMenus.*;
import view.UserInterface.*;


public class ColorBorderButton extends JButton {

	private final MazeApp mazeApp ;
	private int colorBorder = 1;
	
	public ColorBorderButton(MazeApp mazeApp)
	{
		super("Color");

		this.mazeApp = mazeApp ;
		
		addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){
				colorBorder = mazeApp.getMazeMenuBar().getDisplayMenu().getBorderMenuItem().getColorBorder();
				mazeApp.getMazeMenuBar().getDisplayMenu().getBorderMenuItem().changeText(colorBorder);
				colorBorder = mazeApp.getWindowPanel().getGridMazePanel().setButtonsBorder(colorBorder); 
				mazeApp.getMazeMenuBar().getDisplayMenu().getBorderMenuItem().setColorBorder(colorBorder);
				changeText(colorBorder);
				
			}}); 
	}
	
	public void changeText(int colorBorder) {
		if(colorBorder == 0) {
			setText("Black");
		}
		else {
			setText("Gray");
		}
		
	}
	
	public int getColorBorder() {
		return colorBorder;
	}
	
	public void setColorBorder(int color) {
		colorBorder = color;
	}
}
