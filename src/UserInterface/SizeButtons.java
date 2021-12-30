package UserInterface;

import java.awt.*;
import javax.swing.* ;

public class SizeButtons extends JPanel{
	
	private JLabel labelRow;
	private JLabel labelCol;
	private JTextField fieldCol;
	private JTextField fieldRow;
	
	public SizeButtons(DrawingApp drawingApp) {
		
		setLayout(new GridLayout(2,2)) ; // 1 row, 3 columns
		add(labelRow = new JLabel("Rows : "));
		add(fieldCol = new JTextField());
		add(labelCol = new JLabel("Collumns : "));
		add(fieldRow = new JTextField());	
	}
}
