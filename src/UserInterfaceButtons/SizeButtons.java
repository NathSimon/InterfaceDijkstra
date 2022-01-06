package UserInterfaceButtons;

import java.awt.*;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.* ;

import UserInterface.DrawingApp;
import UserInterface.GridMazePanel;
import UserInterface.SizeReadingException;
import UserInterface.WindowPanel;

public class SizeButtons extends JPanel {
	
	private JLabel labelRow;
	private JLabel labelCol;
	private JLabel labelSize;
	private JTextField fieldCol;
	private JTextField fieldRow;
	private WindowPanel windowPanel;
	private GridMazePanel gridMazePanel;
	private Container grid;
	
	public SizeButtons(DrawingApp drawingApp, WindowPanel windowPanel, GridMazePanel gridMazePanel) {
		
		this.windowPanel = windowPanel;
		this.gridMazePanel = gridMazePanel;
		
		setLayout(new FlowLayout()); //Le flow Layout contient un gridLayout pour lempecher de changer de taille
		
		add(createLayout());
		
		fieldCol.addActionListener(new ActionListener(){
			public void actionPerformed(java.awt.event.ActionEvent e) {
				try {
					if(checkInput(fieldCol.getText(),fieldRow.getText()) == 1) {
						windowPanel.initMazePanel(fieldCol.getText(), fieldRow.getText());
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
						windowPanel.initMazePanel(fieldCol.getText(), fieldRow.getText());
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
		
		fieldRow.setText(Integer.toString(this.gridMazePanel.getRowLen()));
		fieldCol.setText(Integer.toString(this.gridMazePanel.getColLen()));
		
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
			throw new SizeReadingException();
			
		} catch (NumberFormatException e1) {
			e1.printStackTrace();
		}
		return 0;
	}
}
