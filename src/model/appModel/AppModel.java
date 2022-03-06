package model.appModel;

import java.util.ArrayList;

import javax.swing.event.*;

/**
 * @author Nathanael SIMON
 *
 */
public class AppModel {

	private int valueOfMouse;
	private String sizeRow;
	private int sizeRowInt;
	private String sizeCol;
	private int sizeColInt;
	private String colorBorder;
	private String mode;
	
	private final ArrayList<ChangeListener> listeners;
	
	public AppModel() {
		listeners = new ArrayList<ChangeListener>();
		mode = "AUTO";
		colorBorder = "BLACK";
		sizeRow = "10";
		sizeRowInt = 10;
		sizeCol = "10";
		sizeColInt = 10;
		valueOfMouse = 1;
	}

	public int getValueOfMouse() {
		return valueOfMouse;
	}

	public void setValueOfMouse(int valueOfMouse) {
		this.valueOfMouse = valueOfMouse;
		stateChanges();
	}

	public String getSizeRow() {
		return sizeRow;
	}

	public void setSizeRow(String sizeRow) {
		this.sizeRow = sizeRow;
		this.sizeRowInt = Integer.parseInt(sizeRow);
		stateChanges();
	}

	public String getSizeCol() {
		return sizeCol;
	}

	public int getSizeColInt() {
		return sizeColInt;
	}
	
	public int getSizeRowInt() {
		return sizeRowInt;
	}
	
	public void setSizeCol(String string) {
		this.sizeCol = string;
		this.sizeColInt = Integer.parseInt(sizeCol);
		System.out.println("test2");
		stateChanges();
		
	}
	
	public void setSizeCol(int col) {
		this.sizeCol = Integer.toString(col);
		this.sizeColInt = col;
	}
	
	public void setSizeRow(int row) {
		this.sizeRow = Integer.toString(row);
		this.sizeRowInt = row;
	}
	
	public String getColorBorder() {
		return colorBorder;
	}

	public void setColorBorder(String colorBorder) {
		this.colorBorder = colorBorder;
		stateChanges();
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
		stateChanges();
	}
	
	public void addObserver(ChangeListener listener) {
		listeners.add(listener);
	}
	
	public void stateChanges() {
        ChangeEvent evt = new ChangeEvent(this) ;
		for (ChangeListener listener : listeners)
		listener.stateChanged(evt);
	}
	
}
