package model.entities;

import boardgame.Position;

public class ChessPosition {
	
	private char column;
	private int row;
	
	
	public ChessPosition() {
	}
	
	public ChessPosition(char column, int row) {
		this.column = column;
		this.row = row;
	}
	
	
	protected Position toPosition() {
		return null;
		
	}
	
	protected ChessPosition fromPosition(Position position) {
		return null;
	}

	public char getColumn() {
		return column;
	}
	public void setColumn(char column) {
		this.column = column;
	}
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	
	

}
