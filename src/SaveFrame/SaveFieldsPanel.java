package SaveFrame;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.* ;

import UserInterface.DrawingApp;
import UserInterface.GridMazePanel;
import UserInterface.SizeReadingException;
import UserInterface.WindowPanel;

public class SaveFieldsPanel extends JPanel {
	
	private JLabel labelFileName;
	private JLabel labelTitle;
	private JTextField fieldFileName;
	private WindowPanel windowPanel;
	private SaveApp saveApp;
	private Container grid;
	private JButton saveButton;
	private JButton cancelButton;
	
	public SaveFieldsPanel(SaveApp saveApp) {
		
		setLayout(new FlowLayout()); //Le flow Layout contient un gridLayout pour lempecher de changer de taille
		
		add(labelTitle = new JLabel("Save maze to default folder"));
		
		add(createGridLayout());
		add(createBoxLayout());
		
		saveButton.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
				
			}}); 
		
		cancelButton.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
				saveApp.closeFrame();
			}}); 
		
		
		
	}
	
	private Container createGridLayout() {
		
		Container gridTmp = new Container();
		
		gridTmp.setLayout(new GridLayout(1,2)) ; // 1 row, 3 columns
		gridTmp.add(labelFileName = new JLabel("File name : "));
		gridTmp.add(fieldFileName = new JTextField());
		fieldFileName.setMaximumSize(getMinimumSize());
		
		fieldFileName.setText("personnalMaze.txt");
		
		return gridTmp;
	}

	private Container createBoxLayout() {
		
		Container gridTmp2 = new Container();
		
		gridTmp2.setLayout(new BoxLayout(gridTmp2,BoxLayout.X_AXIS)) ;
		gridTmp2.add(saveButton = new JButton("Save"));
		gridTmp2.add(cancelButton = new JButton("Cancel"));
		
		return gridTmp2;
	}
}
