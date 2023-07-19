	package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;
import model.entities.ChessPosition;

public class ChessPiece extends Piece{
	
	private Color color;
	private int moveCount;
	

	
	
	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
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

	public int getMoveCount() {
		return moveCount;
	}
	public void setMoveCount(int moveCount) {
		this.moveCount = moveCount;
	}
	
	

}