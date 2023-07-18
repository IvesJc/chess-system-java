package model.entities;

import java.util.ArrayList;
import model.inheritance.Piece;

public class Board {
	
	ArrayList<Piece> pieces = new ArrayList<>();
	
	private int rows;
	private int columns;
	
	
	
	public Board() {
	}
	
	public Board(ArrayList<Piece> pieces, int rows, int columns) {
		this.pieces = pieces;
		this.rows = rows;
		this.columns = columns;
	}

	protected Piece piece(int row, int columns) {
		return null;
	}
	protected Piece piece(Position position) {
		return null;
	}
	protected void placePiece(Piece piece, Position position) {
		return ;
	}
	protected Piece removePiece(Position position) {
		return null;
	}
	protected boolean positionExists(Position position) {
		return true;
	}
	protected boolean therelsAPiece(Position position) {
		return true;
	}
	
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	public int getColumns() {
		return columns;
	}
	public void setColumns(int columns) {
		this.columns = columns;
	}
	
	

}
