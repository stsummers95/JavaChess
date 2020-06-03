import java.util.ArrayList;

/**
 * Defines data members and methods of each knight piece.
 */
public class Knight extends Piece
{
    /**
     * Constructor for objects of class Knight
     */
    public Knight(String color)
    {
        super(color);
    }

    public ArrayList<Square> getAvailableMoves(Square s, GameBoard b)
    {
        ArrayList<Square> moves = new ArrayList<Square>();

        //up two, right one
        Square up1 = b.getSquareAbove(s);
        Square up2 = b.getSquareAbove(up1);

        if(b.getSquareRight(up2) != null && !b.getSquareRight(up2).containsPiece()){
            moves.add(b.getSquareRight(up2));
        }

        //up two, left one
        if(b.getSquareLeft(up2) != null && !b.getSquareLeft(up2).containsPiece()){
            moves.add(b.getSquareLeft(up2));
        }

        //down two, right one
        Square down1 = b.getSquareBelow(s);
        Square down2 = b.getSquareBelow(down1);

        if(b.getSquareRight(down2) != null && !b.getSquareRight(down2).containsPiece()){
            moves.add(b.getSquareRight(down2));
        }

        //down two, left one
        if(b.getSquareLeft(down2) != null && !b.getSquareLeft(down2).containsPiece()){
            moves.add(b.getSquareLeft(down2));
        }

        //right two, up one
        Square right1 = b.getSquareRight(s);
        Square right2 = b.getSquareRight(right1);

        if(b.getSquareAbove(right2) != null && !b.getSquareAbove(right2).containsPiece()){
            moves.add(b.getSquareAbove(right2));
        }

        //right two, down one
        if(b.getSquareBelow(right2) != null && !b.getSquareBelow(right2).containsPiece()){
            moves.add(b.getSquareBelow(right2));
        }

        //left two, up one
        Square left1 = b.getSquareLeft(s);
        Square left2 = b.getSquareLeft(left1);

        if(b.getSquareAbove(left2) != null && !b.getSquareAbove(left2).containsPiece()){
            moves.add(b.getSquareAbove(left2));
        }

        //left two, down one
        if(b.getSquareBelow(left2) != null && !b.getSquareBelow(left2).containsPiece()){
            moves.add(b.getSquareBelow(left2));
        }

        return moves;
    }

    public ArrayList<Square> getAvailableCaptures(Square s, GameBoard b)
    {
        ArrayList<Square> captures = new ArrayList<Square>();
        
        Square two_above = b.getSquareAbove(s, 2);
        if(two_above != null){
            if(b.getSquareLeft(two_above) != null && b.getSquareLeft(two_above).containsPiece() && !b.getSquareLeft(two_above).getPiece().getColor().equals(this.color)) {
                captures.add(b.getSquareLeft(two_above));
            }
            if(b.getSquareRight(two_above) != null && b.getSquareRight(two_above).containsPiece() && !b.getSquareRight(two_above).getPiece().getColor().equals(this.color)) {
                captures.add(b.getSquareRight(two_above));
            }
        }
        
        Square two_below = b.getSquareBelow(s, 2);
        if(two_below != null){
            if(b.getSquareLeft(two_below) != null && b.getSquareLeft(two_below).containsPiece() && !b.getSquareLeft(two_below).getPiece().getColor().equals(this.color)) {
                captures.add(b.getSquareLeft(two_below));
            }
            if(b.getSquareRight(two_below) != null && b.getSquareRight(two_below).containsPiece() && !b.getSquareRight(two_below).getPiece().getColor().equals(this.color)) {
                captures.add(b.getSquareRight(two_below));
            }
        }
        
        Square two_left = b.getSquareLeft(s, 2);
        if(two_left != null) {
            if(b.getSquareAbove(two_left) != null && b.getSquareAbove(two_left).containsPiece() && !b.getSquareAbove(two_left).getPiece().getColor().equals(this.color)) {
                captures.add(b.getSquareAbove(two_left));
            }
            if(b.getSquareBelow(two_left) != null && b.getSquareBelow(two_left).containsPiece() && !b.getSquareBelow(two_left).getPiece().getColor().equals(this.color)) {
                captures.add(b.getSquareBelow(two_left));
            }
        }
        
        Square two_right = b.getSquareRight(s, 2);
        if(two_right != null) {
            if(b.getSquareAbove(two_right) != null && b.getSquareAbove(two_right).containsPiece() && !b.getSquareAbove(two_right).getPiece().getColor().equals(this.color)) {
                captures.add(b.getSquareAbove(two_right));
            }
            if(b.getSquareBelow(two_right) != null && b.getSquareBelow(two_right).containsPiece() && !b.getSquareBelow(two_right).getPiece().getColor().equals(this.color)) {
                captures.add(b.getSquareBelow(two_right));
            }
        }
        
        return captures;
    }
}