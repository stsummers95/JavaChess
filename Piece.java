import java.util.ArrayList;

/**
 * SuperClass to define operations for all pieces. Implemented by each type of
 * chess piece.
 */
public abstract class Piece
{
    String color; // fix to set color on constructor
    
    public Piece(String color)
    {
        this.color = color;
    }
    
    public String getColor() {
        return this.color;
    }
    
    public abstract ArrayList<Square> getAvailableMoves(Square s, GameBoard b);
    
    public abstract ArrayList<Square> getAvailableCaptures();
}
