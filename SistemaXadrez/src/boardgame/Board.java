package boardgame;


public class Board {
	
	private Piece[][] pieces;
	private int rows;
	private int columns;
	
	public Board( int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}

	public Piece piece(int rows, int columns) {
		return pieces[rows][columns];
	}
	public Piece piece(Position position) {
		return pieces[position.getRow()][position.getColumn()];
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

	@Override
	public String toString() {
		return rows+", "+columns;
	}
	
	

}
