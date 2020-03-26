import java.util.ArrayList;

/**
 * Defines data members and methods of each pawn piece.
 */
public class Pawn extends Piece
{
        /**
     * Constructor for objects of class Pawn
     */
    public Pawn(String color)
    {
        super(color);
    }
    
    public ArrayList<Square> getAvailableMoves(Square s, GameBoard[][] b)
    {
        ArrayList<Square> moves = new ArrayList<Square>();
        
        //up one
        
        //up two (if hasn't moved)
        
        //en passant
        
        return moves;
    }

    public ArrayList<Square> getAvailableCaptures()
    {
        return null;
    }
}