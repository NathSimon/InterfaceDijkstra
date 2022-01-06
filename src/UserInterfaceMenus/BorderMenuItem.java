package UserInterfaceMenus;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.* ;

import UserInterface.DrawingApp;

public class BorderMenuItem extends JMenuItem
{
	
	private static final long serialVersionUID = 1L;

	private final DrawingApp drawingApp ;
	private int colorBorder = 1;

	public BorderMenuItem(DrawingApp drawingApp)
	{
		super("Switch border color to black");

		this.drawingApp = drawingApp ;
		
		
		addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){
				colorBorder = drawingApp.getWindowPanel().getButtonPanelMaze().getButtonPanelSolve().getColorBorderButton().getColorBorder();
				changeText(colorBorder);
				drawingApp.getWindowPanel().getButtonPanelMaze().getButtonPanelSolve().getColorBorderButton().changeText(colorBorder);
				colorBorder = drawingApp.getWindowPanel().getGridMazePanel().setButtonsBorder(colorBorder); 
				drawingApp.getWindowPanel().getButtonPanelMaze().getButtonPanelSolve().getColorBorderButton().setColorBorder(colorBorder);
				
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