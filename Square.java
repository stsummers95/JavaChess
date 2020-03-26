
/**
 * This class represents one space on the chessboard and its occupying piece.
 */
public class Square
{
    int rank;
    String file;
    Piece piece;
    /**
     * Constructor for objects of class Square
     */
    public Square(int rank, String file)
    {
        this.rank = rank;
        this.file = file;
        this.piece = null;
    }

    public void setPiece(Piece piece)
    {
        this.piece = piece;
    }

    /**
     * 
     */
    public boolean containsPiece()
    {
        return (piece != null);
    }

    public int getRank(){
        return rank;
    }

    public String getFile(){
        return file;
    }
}
