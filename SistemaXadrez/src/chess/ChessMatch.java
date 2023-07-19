package chess;

import boardgame.Board;
import model.entities.ChessPosition;

public class ChessMatch {
	
	private Board board;
	private int turn;
	private Color currentPlayer;
	private boolean check;
	private boolean checkMate;
	private ChessPiece enPassantVulnerable;
	private ChessPiece promoted;
	
	
	
	public ChessMatch() {
		super();
	}


	public ChessMatch(Board board, int turn, Color currentPlayer, boolean check, boolean checkMate,
			ChessPiece enPassantVulnerable, ChessPiece promoted) {
		board = new Board(8, 8);
		this.turn = turn;
		this.currentPlayer = currentPlayer;
		this.check = check;
		this.checkMate = checkMate;
		this.enPassantVulnerable = enPassantVulnerable;
		this.promoted = promoted;
	}


	public ChessPiece[][] getPieces(){
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for(int i = 0; i<board.getRows();i++) {
			for(int j = 0; j<board.getColumns();j++) {
				mat[i][j] = (ChessPiece)board.piece(i,j);
			}
		}
		return mat;
	}
	protected boolean[][] possibleMoves(ChessPosition sourcePosition){
		return null;
	}
	protected ChessPiece performChessMove(ChessPosition sourcePosition, ChessPosition targetPosition) {
		return null;
	}
	protected ChessPiece replacePromoted(String type) {
		return null;
		
		
	}
	public int getTurn() {
		return turn;
	}
	public void setTurn(int turn) {
		this.turn = turn;
	}
	public Color getCurrentPlayer() {
		return currentPlayer;
	}
	public void setCurrentPlayer(Color currentPlayer) {
		this.currentPlayer = currentPlayer;
	}
	public boolean isCheck() {
		return check;
	}
	public void setCheck(boolean check) {
		this.check = check;
	}
	public boolean isCheckMate() {
		return checkMate;
	}
	public void setCheckMate(boolean checkMate) {
		this.checkMate = checkMate;
	}
	public ChessPiece getEnPassantVulnerable() {
		return enPassantVulnerable;
	}
	public void setEnPassantVulnerable(ChessPiece enPassantVulnerable) {
		this.enPassantVulnerable = enPassantVulnerable;
	}
	public ChessPiece getPromoted() {
		return promoted;
	}
	public void setPromoted(ChessPiece promoted) {
		this.promoted = promoted;
	}
	
	
}
