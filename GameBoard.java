
/**
 * Data structure that maintains the location of each Piece in the game.
 */
public class GameBoard
{
    private Piece[][] board;
    // [0][7] | [1][7] | ... | [7][7]
    // _______|________|_____|_______
    // [0][6] | [1][6] | ... | [7][6]
    // _______|________|_____|_______
    //  ...   | ...    | ... | ...
    // _______|________|_____|_______
    // [0][0] | [1][0] | ... | [7][0]
    // For example, sqaure d2 on a regular chessboard is represented in the
    // board variable as board[3][1].
    //
    // row = rank, column = file
    /**
     * Constructor for objects of class GameBoard. Initialize all starting
     * piece locations.
     */
    public GameBoard()
    {
        board = new Piece[8][8];
        Rook bottomLeftRook = new Rook();
        board[0][0] = bottomLeftRook;
        // TODO: initialize all pieces
        // TODO: make stub methods for all piece types that inherit from Piece
    }
    
    public Piece getPieceAt(int rank, int file)
    {
        return null;
    }
}
