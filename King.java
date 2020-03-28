import java.util.ArrayList;

/**
 * Defines data members and methods of each pawn piece.
 */
public class King extends Piece
{
    /**
     * Constructor for objects of class King
     */
    public King(String color)
    {
        super(color);
    }

    public ArrayList<Square> getAvailableMoves(Square s, GameBoard b)
    {
        ArrayList<Square> moves = new ArrayList<Square>();
        
        Square up = b.getSquareAbove(s);
        Square down = b.getSquareBelow(s);
        
        //up
        if(up != null && !up.containsPiece()){
            moves.add(up);
        }
        
        //down
        if(down != null && !down.containsPiece()){
            moves.add(down);
        }
        
        //left
        if(b.getSquareLeft(s) != null && !b.getSquareLeft(s).containsPiece()){
            moves.add(b.getSquareLeft(s));
        }
        
        //right
        if(b.getSquareRight(s) != null && !b.getSquareRight(s).containsPiece()){
            moves.add(b.getSquareRight(s));
        }
        
        //upper left
        if(b.getSquareLeft(up) != null && !b.getSquareLeft(up).containsPiece()){
            moves.add(b.getSquareLeft(up));
        }
        
        //upper right
        if(b.getSquareRight(up) != null && !b.getSquareRight(up).containsPiece()){
            moves.add(b.getSquareRight(up));
        }
        
        //bottom left
        if(b.getSquareLeft(down) != null && !b.getSquareLeft(down).containsPiece()){
            moves.add(b.getSquareLeft(down));
        }
        
        //bottom right
        if(b.getSquareRight(down) != null && !b.getSquareRight(down).containsPiece()){
            moves.add(b.getSquareRight(down));
        }
        
        //castling
        
        return moves;
    }

    public ArrayList<Square> getAvailableCaptures()
    {
        return null;
    }
}