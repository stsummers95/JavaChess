import java.util.ArrayList;

/**
 * Defines data members and methods of each pawn piece.
 */
public class Pawn extends Piece
{
    boolean isFirstMove;
    
    /**
     * Constructor for objects of class Pawn
     */
    public Pawn(String color)
    {
        super(color);
        isFirstMove = true;
    }

    public ArrayList<Square> getAvailableMoves(Square s, GameBoard b)
    {
        ArrayList<Square> moves = new ArrayList<Square>();

        //up one
        if(b.getSquareAbove(s) != null && !b.getSquareAbove(s).containsPiece()){
            moves.add(b.getSquareAbove(s));
            
            //up two(if hasn't moved)
            if(isFirstMove && !b.getSquareAbove(moves.get(0)).containsPiece()){
                moves.add(b.getSquareAbove(moves.get(0)));
            }
        }

        return moves;
    }

    public ArrayList<Square> getAvailableCaptures()
    {
        //en passant
        
        return null;
    }
}