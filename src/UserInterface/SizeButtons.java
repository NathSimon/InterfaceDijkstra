package UserInterface;

import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.* ;

public class SizeButtons extends JPanel {
	
	private JLabel labelRow;
	private JLabel labelCol;
	private JTextField fieldCol;
	private JTextField fieldRow;
	private WindowPanel windowPanel;
	private GridMazePanel gridMazePanel;
	
	public SizeButtons(DrawingApp drawingApp, WindowPanel windowPanel, GridMazePanel gridMazePanel) {
		
		this.windowPanel = windowPanel;
		this.gridMazePanel = gridMazePanel;
		
		setLayout(new GridLayout(2,2)) ; // 1 row, 3 columns
		add(labelRow = new JLabel("Columns : "));
		add(fieldCol = new JTextField());
		add(labelCol = new JLabel("Rows : "));
		add(fieldRow = new JTextField());	
		
		fieldRow.setText(Integer.toString(this.gridMazePanel.getRowLen()));
		fieldCol.setText(Integer.toString(this.gridMazePanel.getColLen()));
		
		fieldCol.addActionListener(new ActionListener(){
			public void actionPerformed(java.awt.event.ActionEvent e) {
				windowPanel.initMazePanel(fieldCol.getText(), fieldRow.getText());
			}
			});
		fieldRow.addActionListener(new ActionListener(){
			public void actionPerformed(java.awt.event.ActionEvent e) {
				windowPanel.initMazePanel(fieldCol.getText(), fieldRow.getText());
			}
			});
	}
}
