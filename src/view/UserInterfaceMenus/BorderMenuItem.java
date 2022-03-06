package view.UserInterfaceMenus;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.* ;

import model.appModel.AppModel;
import view.SaveFrame.*;
import view.UserInterfaceButtons.*;
import view.UserInterfaceMenus.*;
import view.UserInterface.*;

/**
 * @author Nathanael
 *
 */
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
				System.out.println(appModel.getColorBorder());
				colorBorder = mazeApp.getWindowPanel().getGridMazePanel().setButtonsBorder(appModel.getColorBorder()); 
				System.out.println(colorBorder);
				appModel.setColorBorder(colorBorder);
				setColorBorder(colorBorder);
				changeText(colorBorder);
			}}); 
	}
	
	public void changeText(String colorBorder) {
		if(colorBorder == "BLACK") {
			setText("Switch border color to black");
		}
		else {
			setText("Switch border color to grey");
		}
		
	}
	
	public String getColorBorder() {
		return colorBorder;
	}
	
	public void setColorBorder(String color) {
		colorBorder = color;
	}
	
	public void update() {
		changeText(appModel.getColorBorder());
	}

}