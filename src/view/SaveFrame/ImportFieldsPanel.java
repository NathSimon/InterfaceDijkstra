package view.SaveFrame;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import javax.swing.* ;

import view.SaveFrame.*;
import view.UserInterfaceButtons.*;
import view.UserInterfaceMenus.*;
import view.UserInterface.*;
import Maze.ABox;
import Maze.DBox;
import Maze.EBox;
import Maze.MazeReadingException;
import Maze.WBox;

public class ImportFieldsPanel extends JPanel {
	
	private JLabel labelFileName;
	private JLabel labelTitle;
	private JTextField fieldFileName;
	private SaveApp saveApp;
	private Container grid;
	private JButton importButton;
	private JButton cancelButton;
	private DrawingApp drawingApp;
	
	
	private int row = 0;
	private int col = 0;
	
	
	public ImportFieldsPanel(ImportApp importApp, DrawingApp drawingApp) {
		
		this.drawingApp = drawingApp;
		
		setLayout(new FlowLayout()); //Le flow Layout contient un gridLayout pour lempecher de changer de taille
		
		add(labelTitle = new JLabel("Import maze from .txt in project folder"));
		
		add(createGridLayout());
		add(createBoxLayout());
		
		importButton.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){ 
				try {
					checkSizeOfMaze(fieldFileName.getText() + ".txt");
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
		
		fieldFileName.setText("personnalMaze");
		
		return gridTmp;
	}

	private Container createBoxLayout() {
		
		Container gridTmp2 = new Container();
		
		gridTmp2.setLayout(new BoxLayout(gridTmp2,BoxLayout.X_AXIS)) ;
		gridTmp2.add(importButton = new JButton("Import"));
		gridTmp2.add(cancelButton = new JButton("Cancel"));
		
		return gridTmp2;
	}
	
	private void checkSizeOfMaze(String fileName) throws IOException, MazeReadingException {
		
		int j = 0;
		int i = 0;
		int departureCount = 0;
		int arrivalCount = 0;
		
		Reader reader = new FileReader(fileName);
	
	    // Create a BufferedReader with buffer array size of 16384 (32786 bytes = 32 KB).
		try (BufferedReader br = new BufferedReader(reader, 16384)) {

		String line = null;
	    
	    col = br.readLine().length();
	    
		while((line = br.readLine())!= null) {
			
			j = 0;
			
			while (j < line.length()) {
				char c = line.charAt(j);
				System.out.println(c);
				switch (c) {
					case('W') :
						break;
					case('P') :
						break;
					case('E') : 
						break;
					case('D') : departureCount++;
						break;
					case('A') : arrivalCount++;
						break;
					default : 
						JOptionPane.showMessageDialog(drawingApp,
							    "Invalid charactere at line : " + i,
							    "File error",
							    JOptionPane.ERROR_MESSAGE);
						throw new MazeReadingException(fileName, i, "Invalid charactere in file at line : " + i);
					}
					j++;
			}
			if(j != col) {
				JOptionPane.showMessageDialog(drawingApp,
					    "Invalid size of the maze",
					    "File error",
					    JOptionPane.ERROR_MESSAGE);
				throw new MazeReadingException(fileName, i, "Invalid size of column at column : " + j);
			}
			col = line.length();
			i++;
		}
			
	    br.close();
	    
	    } catch(FileNotFoundException error) {
	    	
	    	JOptionPane.showMessageDialog(drawingApp,
				    "File Not found",
				    "File error",
				    JOptionPane.ERROR_MESSAGE);
	    	
	    	error.getStackTrace();
	    }
	    if(arrivalCount != 1) {
	    	
	    	JOptionPane.showMessageDialog(drawingApp,
				    "Invalid number of arrival",
				    "File error",
				    JOptionPane.ERROR_MESSAGE);
	    	
	    	throw new MazeReadingException(fileName, i, "Invalid number of arrival in maze : " + arrivalCount + ". There should be only one");
	    }
	    if(departureCount != 1) {
	    	
	    	JOptionPane.showMessageDialog(drawingApp,
				    "Invalid number of departure",
				    "File error",
				    JOptionPane.ERROR_MESSAGE);
	    	
	    	throw new MazeReadingException(fileName, i, "Invalid number of arrival in maze : " + departureCount + ". There should be only one");
	    }

		drawingApp.getWindowPanel().initMazePanel(Integer.toString(col), Integer.toString(++i));
	}		
	    
			
	
	public int getCol() {
		return col;
	}
	public int getRow() {
		return row;
	}
	
}