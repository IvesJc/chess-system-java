package model.inheritance;

import model.entities.ChessPosition;
import model.entities.Position;
import model.enums.Color;

public class ChessPiece extends Piece{
	
	private Color color;
	private int moveCount;
	
	
	public ChessPiece() {
	}
	
	public ChessPiece(Color color, int moveCount) {
		this.color = color;
		this.moveCount = moveCount;
	}
	
	public ChessPosition getChessPosition() {
		return null;
	}
	
	protected boolean isThereOpponentPiec(Position position) {
		return true;
	}
	
	protected void increaseMoveCount() {
		
	}
	protected void decreaseMoveCount() {
		
	}

	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public int getMoveCount() {
		return moveCount;
	}
	public void setMoveCount(int moveCount) {
		this.moveCount = moveCount;
	}
	
	

}
