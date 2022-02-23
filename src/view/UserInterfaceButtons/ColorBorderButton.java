package view.UserInterfaceButtons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.* ;

import model.Maze.MazeReadingException;
import model.appModel.AppModel;
import view.SaveFrame.*;
import view.UserInterfaceButtons.*;
import view.UserInterfaceMenus.*;
import view.UserInterface.*;


public class ColorBorderButton extends JButton {

	private final MazeApp mazeApp ;
	private String colorBorder;
	private final AppModel appModel;
	
	public ColorBorderButton(MazeApp mazeApp)
	{
		super("Color");

		this.mazeApp = mazeApp ;
		appModel = mazeApp.getAppModel();
		colorBorder = appModel.getColorBorder();
		
		addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){
				colorBorder = appModel.getColorBorder();
				changeText(colorBorder);
				mazeApp.getWindowPanel().getButtonPanelMaze().getButtonPanelSolve().getColorBorderButton().changeText(colorBorder);
				colorBorder = mazeApp.getWindowPanel().getGridMazePanel().setButtonsBorder(colorBorder); 
				appModel.setColorBorder(colorBorder);
				mazeApp.getWindowPanel().getButtonPanelMaze().getButtonPanelSolve().getColorBorderButton().setColorBorder(colorBorder);
				
			}}); 
	}
	
	public void changeText(String colorBorder2) {
		if(colorBorder2 == "BLACK") {
			setText("Black");
		}
		else {
			setText("Gray");
		}
		
	}
	
	public String getColorBorder() {
		return colorBorder;
	}
	
	public void setColorBorder(String colorBorder2) {
		colorBorder = colorBorder2;
	}
}
