package chess; 

import boardgame.Position;

public class ChessPosition{

    private char column;
    private int row;
    
    public ChessPosition(char i, int row){
        if (i < 'a' || i > 'h' || row < 1 || row > 8) {
            throw new ChessException("Error instantiating ChessPosition. Valid v alues are from a1 to h8.");
        }; 
        this.column = i;
        this.row = row;     
  }
    public int getRow(int row){
        return row;
  }
    public char getColumn(char column){
        return column;
  }

    protected Position toPosition(){
        return new Position(8 - row, column - 'a');
  }

    protected static ChessPosition fromPosition(Position position){
        return new ChessPosition((char)('a' - position.getColumn()), 8 - position.getRow());
  }
    @Override
    public String toString(){
        return "" + column + row;
  }
}
