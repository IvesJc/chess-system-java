package boardgame;

public class Piece {
	
	private Board board;
	protected Position position;
	
	public Piece(Board board) {
		this.board = board;
	}
	
	public boolean[][] possibleMoves(){
		return null;
	}
	public boolean possibleMove(Position position) {
		return true;
	}
	public boolean isThereAnyPossibleMove() {
		return true;
	}

	protected Board getBoard() {
		return board;
	}

	
	
	
	
	
}
