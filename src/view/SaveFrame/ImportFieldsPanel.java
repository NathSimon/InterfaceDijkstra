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
import model.Maze.ABox;
import model.Maze.DBox;
import model.Maze.EBox;
import model.Maze.MazeReadingException;
import model.Maze.WBox;
import model.appModel.AppModel;

public class ImportFieldsPanel extends JPanel {
	
	private JLabel labelFileName;
	private final JLabel labelTitle;
	private JTextField fieldFileName;
	private Container grid;
	private JButton importButton;
	private JButton cancelButton;
	private final MazeApp mazeApp;
	private final AppModel appModel;
	
	
	private int row = 0;
	private int col = 0;
	
	
	public ImportFieldsPanel(ImportApp importApp, MazeApp mazeApp) {
		
		this.mazeApp = mazeApp;
		this.appModel = mazeApp.getAppModel();
		
		setLayout(new FlowLayout()); //Le flow Layout contient un gridLayout pour lempecher de changer de taille
		
		add(labelTitle = new JLabel("Import maze from .txt in project folder"));
		
		add(createGridLayout());
		add(createBoxLayout());
		
		importButton.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){ 
				try {
					checkSizeOfMaze(fieldFileName.getText() + ".txt");
					mazeApp.getWindowPanel().getGridMazePanel().initFromTextFile(fieldFileName.getText() + ".txt");
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
						JOptionPane.showMessageDialog(mazeApp,
							    "Invalid charactere at line : " + i,
							    "File error",
							    JOptionPane.ERROR_MESSAGE);
						throw new MazeReadingException(fileName, i, "Invalid charactere in file at line : " + i);
					}
					j++;
			}
			if(j != col) {
				JOptionPane.showMessageDialog(mazeApp,
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
	    	
	    	JOptionPane.showMessageDialog(mazeApp,
				    "File Not found",
				    "File error",
				    JOptionPane.ERROR_MESSAGE);
	    	
	    	error.getStackTrace();
	    }
	    if(arrivalCount != 1) {
	    	
	    	JOptionPane.showMessageDialog(mazeApp,
				    "Invalid number of arrival",
				    "File error",
				    JOptionPane.ERROR_MESSAGE);
	    	
	    	throw new MazeReadingException(fileName, i, "Invalid number of arrival in maze : " + arrivalCount + ". There should be only one");
	    }
	    if(departureCount != 1) {
	    	
	    	JOptionPane.showMessageDialog(mazeApp,
				    "Invalid number of departure",
				    "File error",
				    JOptionPane.ERROR_MESSAGE);
	    	
	    	throw new MazeReadingException(fileName, i, "Invalid number of arrival in maze : " + departureCount + ". There should be only one");
	    }
	    
	    if(col < 4 || i + 1 < 4) {
	    	
	    	JOptionPane.showMessageDialog(mazeApp,
				    "Maze too small. Must be at least 4*4",
				    "File error",
				    JOptionPane.ERROR_MESSAGE);
	    	
	    	throw new MazeReadingException(fileName, i, "Maze to small");
	    }
	    if(col > 100 || i + 1 > 100) {
	    	
	    	JOptionPane.showMessageDialog(mazeApp,
				    "Maze too big. Must be at most 100*100",
				    "File error",
				    JOptionPane.ERROR_MESSAGE);
	    	
	    	throw new MazeReadingException(fileName, i, "Maze to big");
	    }
	    
	    
	    appModel.setSizeRow(i + 1);
	    appModel.setSizeCol(col);
		mazeApp.getWindowPanel().initMazePanel();
	}			
}
