import java.util.ArrayList;

/**
 * Defines data members and methods of each king piece.
 */
public class King extends Piece
{
    boolean hasMoved;
    
    /**
     * Constructor for objects of class King
     */
    public King(String color)
    {
        super(color);
        this.hasMoved = false;
    }

    public ArrayList<Square> getAvailableMoves(Square s, GameBoard b)
    {
        ArrayList<Square> moves = new ArrayList<Square>();
        
        Square up = b.getSquareAbove(s);
        Square down = b.getSquareBelow(s);
        
        //up
        if(up != null && !up.containsPiece()){
            moves.add(up);
        }
        
        //down
        if(down != null && !down.containsPiece()){
            moves.add(down);
        }
        
        //left
        if(b.getSquareLeft(s) != null && !b.getSquareLeft(s).containsPiece()){
            moves.add(b.getSquareLeft(s));
        }
        
        //right
        if(b.getSquareRight(s) != null && !b.getSquareRight(s).containsPiece()){
            moves.add(b.getSquareRight(s));
        }
        
        //upper left
        if(b.getSquareLeft(up) != null && !b.getSquareLeft(up).containsPiece()){
            moves.add(b.getSquareLeft(up));
        }
        
        //upper right
        if(b.getSquareRight(up) != null && !b.getSquareRight(up).containsPiece()){
            moves.add(b.getSquareRight(up));
        }
        
        //bottom left
        if(b.getSquareLeft(down) != null && !b.getSquareLeft(down).containsPiece()){
            moves.add(b.getSquareLeft(down));
        }
        
        //bottom right
        if(b.getSquareRight(down) != null && !b.getSquareRight(down).containsPiece()){
            moves.add(b.getSquareRight(down));
        }
        
        //castling
        if(!this.hasMoved)
        {
            if(!b.getSquareRight(s).containsPiece() &&
                !b.getSquareRight(b.getSquareRight(s)).containsPiece() &&
                b.getSquareRight(b.getSquareRight(b.getSquareRight(s))).getPiece() instanceof Rook)
                {
                Rook rook = (Rook)(b.getSquareRight(b.getSquareRight(b.getSquareRight(s))).getPiece());
                if(!rook.hasMoved())
                {
                    //Must make sure king is not currently in check,
                    //moving through check, or moving into check.
                    moves.add(b.getSquareRight(b.getSquareRight(s)));
                }
            }
            if(!b.getSquareLeft(s).containsPiece() &&
                !b.getSquareLeft(b.getSquareLeft(s)).containsPiece() &&
                b.getSquareLeft(b.getSquareLeft(b.getSquareLeft(b.getSquareLeft(s)))).getPiece() instanceof Rook)
                {
                Rook rook = (Rook)(b.getSquareLeft(b.getSquareLeft(b.getSquareLeft(b.getSquareLeft(s)))).getPiece());
                if(!rook.hasMoved())
                {
                    //Must make sure king is not currently in check,
                    //moving through check, or moving into check.
                    moves.add(b.getSquareLeft(b.getSquareLeft(s)));
                }
            }
        }
        
        return moves;
    }

    public ArrayList<Square> getAvailableCaptures()
    {
        return null;
    }
}