package com.mk.rbies.playground;

public class Field {

	private int fieldSizeX;
	private int fieldSizeY;
	
	private Field[][] fieldCells;

	public Field(int fieldSizeX, int fieldSizeY) {
		super();

		this.fieldSizeX = fieldSizeX;
		this.fieldSizeY = fieldSizeY;
		
		// create field
		fieldCells = new Field[fieldSizeX][fieldSizeY];
		
		// init fieldCells
		for (int x = 0; x < fieldSizeX; x++) {
			for (int y = 0; y < fieldSizeY; y++) {
				Field fieldCell = new Field(x, y);
				fieldCells[x][y] = fieldCell;
			}
		}

	}

	public int getFieldSizeX() {
		return fieldSizeX;
	}

	public void setFieldSizeX(int fieldSizeX) {
		this.fieldSizeX = fieldSizeX;
	}

	public int getFieldSizeY() {
		return fieldSizeY;
	}

	public void setFieldSizeY(int fieldSizeY) {
		this.fieldSizeY = fieldSizeY;
	}

}
