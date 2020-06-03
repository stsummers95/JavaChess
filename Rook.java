import java.util.ArrayList;

/**
 * Defines data members and methods of each rook piece.
 */
public class Rook extends Piece
{
    boolean moved;
    
    /**
     * Constructor for objects of class Rook
     */
    public Rook(String color)
    {
        super(color);
        moved = false;
    }
    
    public boolean hasMoved()
    {
        return this.moved;
    }

    public ArrayList<Square> getAvailableMoves(Square s, GameBoard b)
    {
        ArrayList<Square> moves = new ArrayList<Square>();
        
        //up
        Square previous = s;
        while(true){
            Square up = b.getSquareAbove(previous);
            
            if(up == null || up.containsPiece()){
                break;
            }
            
            moves.add(up);
            previous = up;
        }
        
        //down
        previous = s;
        while(true){
            Square down = b.getSquareBelow(previous);
            
            if(down == null || down.containsPiece()){
                break;
            }
            
            moves.add(down);
            previous = down;
        }
        
        //left
        previous = s;
        while(true){
            Square left = b.getSquareLeft(previous);
            
            if(left == null || left.containsPiece()){
                break;
            }
            
            moves.add(left);
            previous = left;
        }
        
        //right
        previous = s;
        while(true){
            Square right = b.getSquareRight(previous);
            
            if(right == null || right.containsPiece()){
                break;
            }
            
            moves.add(right);
            previous = right;
        }
        
        return moves;
    }

    public ArrayList<Square> getAvailableCaptures(Square s, GameBoard b)
    {
        ArrayList<Square> captures = new ArrayList<Square>();
        
        Square temp = s;
        while(true) {
            temp = b.getSquareAbove(temp);
            if(temp == null) {
                break;
            }
            else if(temp.containsPiece()) {
                if(!temp.getPiece().getColor().equals(this.color)) {
                    captures.add(temp);
                }
                break;
            }
        }
        
        temp = s;
        while(true) {
            temp = b.getSquareBelow(temp);
            if(temp == null) {
                break;
            }
            else if(temp.containsPiece()) {
                if(!temp.getPiece().getColor().equals(this.color)) {
                    captures.add(temp);
                }
                break;
            }
        }
        
        temp = s;
        while(true) {
            temp = b.getSquareLeft(temp);
            if(temp == null) {
                break;
            }
            else if(temp.containsPiece()) {
                if(!temp.getPiece().getColor().equals(this.color)) {
                    captures.add(temp);
                }
                break;
            }
        }
        
        temp = s;
        while(true) {
            temp = b.getSquareRight(temp);
            if(temp == null) {
                break;
            }
            else if(temp.containsPiece()) {
                if(!temp.getPiece().getColor().equals(this.color)) {
                    captures.add(temp);
                }
                break;
            }
        }
        
        return null;
    }
}
