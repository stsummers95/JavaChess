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

    public ArrayList<Square> getAvailableMoves()
    {
        return null;
    }

    public ArrayList<Square> getAvailableCaptures()
    {
        return null;
    }
}