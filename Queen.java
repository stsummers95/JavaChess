import java.util.ArrayList;

/**
 * Defines data members and methods of each pawn piece.
 */
public class Queen extends Piece
{
    /**
     * Constructor for objects of class Queen
     */
    public Queen(String color)
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
            
            if(up.containsPiece()){ //TODO check if up is null (off board)
                break;
            }
            
            moves.add(up);
            previous = up;
        }
        
        //down
        //TODO reset previous to original Square
        //TODO make above changes to all loops
        while(true){
            Square down = b.getSquareBelow(previous);
            
            if(down.containsPiece()){
                break;
            }
            
            moves.add(down);
            previous = down;
        }
        
        //left
        while(true){
            Square left = b.getSquareLeft(previous);
            
            if(left.containsPiece()){
                break;
            }
            
            moves.add(left);
            previous = left;
        }
        
        //right
        while(true){
            Square right = b.getSquareRight(previous);
            
            if(right.containsPiece()){
                break;
            }
            
            moves.add(right);
            previous = right;
        }
        
        //upper left
        while(true){
            Square left = b.getSquareLeft(s);
            Square up = b.getSquareAbove(left);
            
            if(up.containsPiece()){
                break;
            }
            
            moves.add(up);
        }
        
        //upper right
        while(true){
            Square right = b.getSquareRight(s);
            Square up = b.getSquareAbove(right);
            
            if(up.containsPiece()){
                break;
            }
            
            moves.add(up);
        }
        
        //bottom left
        while(true){
            Square left = b.getSquareLeft(s);
            Square down = b.getSquareBelow(left);
            
            if(down.containsPiece()){
                break;
            }
            
            moves.add(down);
        }
        
        //bottom right
        while(true){
            Square right = b.getSquareRight(s);
            Square down = b.getSquareBelow(right);
            
            if(down.containsPiece()){
                break;
            }
            
            moves.add(down);
        }
        
        return moves;
    }

    public ArrayList<Square> getAvailableCaptures()
    {
        return null;
    }
}