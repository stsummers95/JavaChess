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

    public ArrayList<Square> getAvailableMoves(Square s, GameBoard b)
    {
        ArrayList<Square> moves = new ArrayList<Square>();
        
        //up
        Square previous = s;
        while(true){
            Square up = b.getSquareAbove(previous);
            
            if(up.containsPiece() || up == null){
                break;
            }
            
            moves.add(up);
            previous = up;
        }
        
        //down
        previous = s;
        while(true){
            Square down = b.getSquareBelow(previous);
            
            if(down.containsPiece() || down == null){
                break;
            }
            
            moves.add(down);
            previous = down;
        }
        
        //left
        previous = s;
        while(true){
            Square left = b.getSquareLeft(previous);
            
            if(left.containsPiece() || left == null){
                break;
            }
            
            moves.add(left);
            previous = left;
        }
        
        //right
        previous = s;
        while(true){
            Square right = b.getSquareRight(previous);
            
            if(right.containsPiece() || right == null){
                break;
            }
            
            moves.add(right);
            previous = right;
        }
        
        return moves;
    }

    public ArrayList<Square> getAvailableCaptures()
    {
        return null;
    }
}
