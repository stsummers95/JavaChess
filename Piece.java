import java.util.ArrayList;

/**
 * Interface to define operations for all pieces. Implemented by each type of
 * chess piece.
 */
public abstract class Piece
{
    String color; // fix to set color on constructor
    
    public Piece(String color)
    {
        this.color = color;
    }
    
    public abstract ArrayList<Square> getAvailableMoves();
    
    public abstract ArrayList<Square> getAvailableCaptures();
}
