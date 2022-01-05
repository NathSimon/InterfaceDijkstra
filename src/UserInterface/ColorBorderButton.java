package UserInterface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.* ;

import Maze.MazeReadingException;


public class ColorBorderButton extends JButton {

	private final DrawingApp drawingApp ;
	private int colorBorder = 1;
	
	public ColorBorderButton(DrawingApp drawingApp)
	{
		super("Switch border color to black");

		this.drawingApp = drawingApp ;
		
		addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){
				colorBorder = drawingApp.getDrawingMenuBar().getDisplayMenu().getBorderMenuItem().getColorBorder();
				changeText(colorBorder);
				drawingApp.getDrawingMenuBar().getDisplayMenu().getBorderMenuItem().changeText(colorBorder);
				colorBorder = drawingApp.getWindowPanel().getGridMazePanel().setButtonsBorder(colorBorder); 
				drawingApp.getDrawingMenuBar().getDisplayMenu().getBorderMenuItem().setColorBorder(colorBorder);
				
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
