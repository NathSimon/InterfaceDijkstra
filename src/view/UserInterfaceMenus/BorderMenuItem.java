package view.UserInterfaceMenus;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.* ;

import model.appModel.AppModel;
import view.SaveFrame.*;
import view.UserInterfaceButtons.*;
import view.UserInterfaceMenus.*;
import view.UserInterface.*;

public class BorderMenuItem extends JMenuItem
{
	
	private static final long serialVersionUID = 1L;

	private final MazeApp mazeApp ;
	private String colorBorder;
	private final AppModel appModel;

	public BorderMenuItem(MazeApp mazeApp)
	{
		super("Switch border color to black");

		this.mazeApp = mazeApp ;
		this.appModel = mazeApp.getAppModel();
		this.colorBorder = appModel.getColorBorder();
		
		
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
	
	public void changeText(String colorBorder) {
		if(colorBorder == "BLACK") {
			setText("Switch border color to black");
		}
		else {
			setText("Switch border color to gray");
		}
		
	}
	
	public String getColorBorder() {
		return colorBorder;
	}
	
	public void setColorBorder(String color) {
		colorBorder = color;
	}

}