
public abstract class ChessPiece {

	public enum Color {WHITE, BLACK}
	
	protected ChessBoard board;
	protected int row;
	protected int column;
	protected Color color;
	
	public ChessPiece(ChessBoard board, Color color){
		
	}
	public int getRow(){
		return this.row;
	}
	public int getColumn(){
		return this.column;
				
	}
	
}
