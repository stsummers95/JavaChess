import java.util.ArrayList;

/**
 * Defines data members and methods of each pawn piece.
 */
public class Bishop extends Piece
{
    /**
     * Constructor for objects of class Bishop
     */
    public Bishop(String color)
    {
        super(color);
    }

    public ArrayList<Square> getAvailableMoves(Square s, GameBoard[][] b)
    {
        ArrayList<Square> moves = new ArrayList<Square>();
        
        //upper left
        
        //upper right
        
        //bottom left
        
        //bottom right
        
        return moves;
    }

    public ArrayList<Square> getAvailableCaptures()
    {
        return null;
    }
}