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
	
	public SizeButtons(DrawingApp drawingApp, WindowPanel windowPanel) {
		
		this.windowPanel = windowPanel;
		
		setLayout(new GridLayout(2,2)) ; // 1 row, 3 columns
		add(labelRow = new JLabel("Rows : "));
		add(fieldCol = new JTextField());
		add(labelCol = new JLabel("Collumns : "));
		add(fieldRow = new JTextField());	
		
		fieldRow.setText("10");
		fieldCol.setText("10");
		
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
