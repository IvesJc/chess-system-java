package model.inheritance;

import model.entities.Board;
import model.entities.Position;

public class Piece {
	
	Board board = new Board();

	protected Position position;
	
	public boolean[][] possibleMoves(){
		return null;
	}
	public boolean possibleMove(Position position) {
		return true;
	}
	public boolean isThereAnyPossibleMove() {
		return true;
	}
	
}
