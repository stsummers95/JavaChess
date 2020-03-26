import java.util.ArrayList;

/**
 * Defines data members and methods of each rook piece.
 */
public class Rook extends Piece
{
    /**
     * Constructor for objects of class Rook
     */
    public Rook(String color)
    {
        super(color);
    }

    public ArrayList<Square> getAvailableMoves(Square s, GameBoard[][] b)
    {
        ArrayList<Square> moves = new ArrayList<Square>();
        
        //up
        
        //down
        
        //left
        
        //right
        
        return moves;
    }

    public ArrayList<Square> getAvailableCaptures()
    {
        return null;
    }
}
