import java.util.ArrayList;

/**
 * Defines data members and methods of each knight piece.
 */
public class Knight extends Piece
{
    /**
     * Constructor for objects of class Knight
     */
    public Knight(String color)
    {
        super(color);
    }

    public ArrayList<Square> getAvailableMoves(Square s, GameBoard[][] b)
    {
        ArrayList<Square> moves = new ArrayList<Square>();
        
        //up two, right one
        
        //up two, left one
        
        //down two, right one
        
        //down two, left one
        
        //right two, up one
        
        //right two, down one
        
        //left two, up one
        
        //left two, down one
        return moves;
    }

    public ArrayList<Square> getAvailableCaptures()
    {
        return null;
    }
}