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

    public ArrayList<Square> getAvailableMoves(Square s, GameBoard[][] b)
    {
        ArrayList<Square> moves = new ArrayList<Square>();
        
        //up
        
        //down
        
        //left
        
        //right
        
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