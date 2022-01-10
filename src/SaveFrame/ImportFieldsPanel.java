package SaveFrame;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.* ;

import Maze.MazeReadingException;
import UserInterface.DrawingApp;
import UserInterface.GridMazePanel;
import UserInterface.SizeReadingException;
import UserInterface.WindowPanel;

public class ImportFieldsPanel extends JPanel {
	
	private JLabel labelFileName;
	private JLabel labelTitle;
	private JTextField fieldFileName;
	private WindowPanel windowPanel;
	private SaveApp saveApp;
	private Container grid;
	private JButton importButton;
	private JButton cancelButton;
	
	public ImportFieldsPanel(ImportApp importApp, DrawingApp drawingApp) {
		
		setLayout(new FlowLayout()); //Le flow Layout contient un gridLayout pour lempecher de changer de taille
		
		add(labelTitle = new JLabel("Import maze from .txt in project folder"));
		
		add(createGridLayout());
		add(createBoxLayout());
		
		importButton.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){ 
				try {
					drawingApp.getWindowPanel().getGridMazePanel().initFromTextFile(fieldFileName.getText() + ".txt");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (MazeReadingException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				importApp.closeFrame();
			}}); 
		
		cancelButton.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
				importApp.closeFrame();
			}}); 
		
		
		
	}
	
	private Container createGridLayout() {
		
		Container gridTmp = new Container();
		
		gridTmp.setLayout(new GridLayout(1,2)) ; // 1 row, 3 columns
		gridTmp.add(labelFileName = new JLabel("File name : "));
		gridTmp.add(fieldFileName = new JTextField());
		fieldFileName.setMaximumSize(getMinimumSize());
		
		fieldFileName.setText("importMaze");
		
		return gridTmp;
	}

	private Container createBoxLayout() {
		
		Container gridTmp2 = new Container();
		
		gridTmp2.setLayout(new BoxLayout(gridTmp2,BoxLayout.X_AXIS)) ;
		gridTmp2.add(importButton = new JButton("Import"));
		gridTmp2.add(cancelButton = new JButton("Cancel"));
		
		return gridTmp2;
	}
	
}
