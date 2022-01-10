package UserInterfaceButtons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.* ;

import Maze.MazeReadingException;
import UserInterface.DrawingApp;


public class ColorBorderButton extends JButton {

	private final DrawingApp drawingApp ;
	private int colorBorder = 1;
	
	public ColorBorderButton(DrawingApp drawingApp)
	{
		super("Color");

		this.drawingApp = drawingApp ;
		
		addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){
				colorBorder = drawingApp.getDrawingMenuBar().getDisplayMenu().getBorderMenuItem().getColorBorder();
				drawingApp.getDrawingMenuBar().getDisplayMenu().getBorderMenuItem().changeText(colorBorder);
				colorBorder = drawingApp.getWindowPanel().getGridMazePanel().setButtonsBorder(colorBorder); 
				drawingApp.getDrawingMenuBar().getDisplayMenu().getBorderMenuItem().setColorBorder(colorBorder);
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
