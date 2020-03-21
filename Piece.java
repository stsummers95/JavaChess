import java.util.ArrayList;

/**
 * Interface to define operations for all pieces. Implemented by each type of
 * chess piece.
 */
public interface Piece
{
    String color = "white"; // fix to set color on constructor
    
    public ArrayList<Integer> getAvailableMoves();
    
    public ArrayList<Integer> getAvailableCaptures();
}
