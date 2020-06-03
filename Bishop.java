import java.util.ArrayList;

/**
 * Defines data members and methods of each pawn piece.
 */
public class Bishop extends Piece
{
    /**
     * Constructor for objects of class Bishop
     */
    public Bishop(String color)
    {
        super(color);
    }

    public ArrayList<Square> getAvailableMoves(Square s, GameBoard b)
    {
        ArrayList<Square> moves = new ArrayList<Square>();
        
        //upper left
        while(true){
            Square left = b.getSquareLeft(s);
            Square up = b.getSquareAbove(left);
            
            if(up == null || up.containsPiece()){
                break;
            }
            
            moves.add(up); //TODO set recurring variable before looping
            //TODO do the previous changes for each loop
        }
        
        //upper right
        while(true){
            Square right = b.getSquareRight(s);
            Square up = b.getSquareAbove(right);
            
            if(up == null || up.containsPiece()){
                break;
            }
            
            moves.add(up);
        }
        
        //bottom left
        while(true){
            Square left = b.getSquareLeft(s);
            Square down = b.getSquareBelow(left);
            
            if(down == null || down.containsPiece()){
                break;
            }
            
            moves.add(down);
        }
        
        //bottom right
        while(true){
            Square right = b.getSquareRight(s);
            Square down = b.getSquareBelow(right);
            
            if(down == null || down.containsPiece()){
                break;
            }
            
            moves.add(down);
        }
        
        return moves;
    }

    public ArrayList<Square> getAvailableCaptures(Square s, GameBoard b)
    {
        ArrayList<Square> captures = new ArrayList<Square>();
        
        Square temp = s;
        while(true) {
            temp = b.getSquareLeft(b.getSquareAbove(temp));
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
            temp = b.getSquareRight(b.getSquareAbove(temp));
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
            temp = b.getSquareLeft(b.getSquareBelow(temp));
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
            temp = b.getSquareRight(b.getSquareBelow(temp));
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
        
        return captures;
    }
}