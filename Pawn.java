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

        
        //white
        if(this.color == "white" && b.getSquareAbove(s) != null && !b.getSquareAbove(s).containsPiece()) {
            moves.add(b.getSquareAbove(s));
            
            //up two (if hasn't moved)
            if(this.isFirstMove && !b.getSquareAbove(moves.get(0)).containsPiece()) {
                moves.add(b.getSquareAbove(moves.get(0)));
            }
        }
        //black
        else if(this.color == "black" && b.getSquareBelow(s) != null && !b.getSquareBelow(s).containsPiece()) {
            moves.add(b.getSquareBelow(s));
            
            //down two (if hasn't moved)
            if(this.isFirstMove && !b.getSquareBelow(moves.get(0)).containsPiece()) {
                moves.add(b.getSquareBelow(moves.get(0)));
            }
        }
            
        return moves;
    }

    public ArrayList<Square> getAvailableCaptures()
    {
        //regular capture
        //en passant
        
        return null;
    }
}