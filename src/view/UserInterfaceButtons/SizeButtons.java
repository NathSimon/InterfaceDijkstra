package view.UserInterfaceButtons;

import java.awt.*;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.* ;

import model.appModel.AppModel;
import view.SaveFrame.*;
import view.UserInterfaceButtons.*;
import view.UserInterfaceMenus.*;
import view.UserInterface.*;

public class SizeButtons extends JPanel {
	
	private JLabel labelRow;
	private JLabel labelCol;
	private JLabel labelSize;
	private JTextField fieldCol;
	private JTextField fieldRow;
	private final WindowPanel windowPanel;
	private Container grid;
	private final AppModel appModel;
	
	public SizeButtons(MazeApp mazeApp, WindowPanel windowPanel) {
		
		this.windowPanel = windowPanel;
		this.appModel = mazeApp.getAppModel();
		
		setLayout(new FlowLayout()); //Le flow Layout contient un gridLayout pour lempecher de changer de taille
		
		add(createLayout());
		
		fieldCol.addActionListener(new ActionListener(){
			public void actionPerformed(java.awt.event.ActionEvent e) {
				try {
					if(checkInput(fieldCol.getText(),fieldRow.getText()) == 1) {
						int response = JOptionPane.showOptionDialog(mazeApp, "Update size of the maze ?", "Update ?", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
						
						switch(response) {
						
						case JOptionPane.CANCEL_OPTION :
							return ;
						case JOptionPane.OK_OPTION :
							appModel.setSizeCol(fieldCol.getText());
							windowPanel.initMazePanel();
							break;
						case JOptionPane.NO_OPTION :
							break;
						}		
						
					}
				} catch (SizeReadingException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			});
		
		fieldRow.addActionListener(new ActionListener(){
			public void actionPerformed(java.awt.event.ActionEvent e) {
				try {
					if(checkInput(fieldCol.getText(),fieldRow.getText()) == 1) {
 					
						int response = JOptionPane.showOptionDialog(mazeApp, "Update size of the maze ?", "Update ?", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
						
						switch(response) {
						
						case JOptionPane.CANCEL_OPTION :
							return ;
						case JOptionPane.OK_OPTION :
							appModel.setSizeRow(fieldRow.getText());
							windowPanel.initMazePanel();
							break;
						case JOptionPane.NO_OPTION :
							break;
						}		
					}
				} catch (SizeReadingException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			});
	}
	
	private Container createLayout() {
		
		Container gridTmp = new Container();
		
		gridTmp.setLayout(new GridLayout(2,2)) ; // 1 row, 3 columns
		gridTmp.add(labelRow = new JLabel("Columns : "));
		gridTmp.add(fieldCol = new JTextField());
		fieldCol.setMaximumSize(getMinimumSize());
		gridTmp.add(labelCol = new JLabel("Rows : "));
		gridTmp.add(fieldRow = new JTextField());	
		fieldRow.setMaximumSize(getMinimumSize());
		
		fieldRow.setText(this.appModel.getSizeRow());
		fieldCol.setText(this.appModel.getSizeCol());
		
		return gridTmp;
	}
	
	private int checkInput(String col, String row) throws SizeReadingException{
		
		try {
			int colNum = Integer.parseInt(col);
			int rowNum = Integer.parseInt(row);
			
			if(colNum < 101 && rowNum < 101) {
				if(colNum > 3 && rowNum > 3) {
					return 1;
				}
			}
			JOptionPane.showMessageDialog(windowPanel,
				    "Invalid input size",
				    "Size Error",
				    JOptionPane.ERROR_MESSAGE);
			throw new SizeReadingException();
			
			
		} catch (NumberFormatException e1) {
			e1.printStackTrace();
			JOptionPane.showMessageDialog(windowPanel,
				    "Invalid input format",
				    "Format Error",
				    JOptionPane.ERROR_MESSAGE);
		}
		return 0;
	}
}
