
/**
 * Data structure that maintains the location of each Piece in the game.
 */
public class GameBoard
{
    private Piece[][] board;

    //bottom pieces
    Rook bottomLeftRook;
    Knight bottomLeftKnight;
    Bishop bottomLeftBishop;
    Queen bottomQueen;
    King bottomKing;
    Bishop bottomRightBishop;
    Knight bottomRightKnight;
    Rook bottomRightRook;
    Pawn bottomPawn1;
    Pawn bottomPawn2;
    Pawn bottomPawn3;
    Pawn bottomPawn4;
    Pawn bottomPawn5;
    Pawn bottomPawn6;
    Pawn bottomPawn7;
    Pawn bottomPawn8;

    //top pieces
    Rook topLeftRook;
    Knight topLeftKnight;
    Bishop topLeftBishop;
    Queen topQueen;
    King topKing;
    Bishop topRightBishop;
    Knight topRightKnight;
    Rook topRightRook;
    Pawn topPawn1;
    Pawn topPawn2;
    Pawn topPawn3;
    Pawn topPawn4;
    Pawn topPawn5;
    Pawn topPawn6;
    Pawn topPawn7;
    Pawn topPawn8;

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

        //set bottom pieces
        bottomLeftRook = new Rook();
        board[0][0] = bottomLeftRook;

        bottomLeftKnight = new Knight();
        board[1][0] = bottomLeftKnight;

        bottomLeftBishop = new Bishop();
        board[2][0] = bottomLeftBishop;

        bottomQueen = new Queen();
        board[3][0] = bottomQueen;

        bottomKing = new King();
        board[4][0] = bottomKing;

        bottomRightBishop = new Bishop();
        board[5][0] = bottomRightBishop;

        bottomRightKnight = new Knight();
        board[6][0] = bottomRightKnight;

        bottomRightRook = new Rook();
        board[7][0] = bottomRightRook;

        bottomPawn1 = new Pawn();
        board[0][1] = bottomPawn1;

        bottomPawn2 = new Pawn();
        board[1][1] = bottomPawn2;

        bottomPawn3 = new Pawn();
        board[2][1] = bottomPawn3;

        bottomPawn4 = new Pawn();
        board[3][1] = bottomPawn4;

        bottomPawn5 = new Pawn();
        board[4][1] = bottomPawn5;

        bottomPawn6 = new Pawn();
        board[5][1] = bottomPawn6;

        bottomPawn7 = new Pawn();
        board[6][1] = bottomPawn7;

        bottomPawn8 = new Pawn();
        board[7][1] = bottomPawn8;

        //set top pieces
        topLeftRook = new Rook();
        board[0][7] = topRightRook;

        topLeftKnight = new Knight();
        board[1][7] = topRightKnight;

        topLeftBishop = new Bishop();
        board[2][7] = topRightBishop;

        topQueen = new Queen();
        board[3][7] = topQueen;

        topKing = new King();
        board[4][7] = topKing;

        topRightBishop = new Bishop();
        board[5][7] = topRightBishop;

        topRightKnight = new Knight();
        board[6][7] = topRightKnight;

        topRightRook = new Rook();
        board[7][7] = topRightRook;

        topPawn1 = new Pawn();
        board[0][6] = topPawn1;

        topPawn2 = new Pawn();
        board[1][6] = topPawn2;

        topPawn3 = new Pawn();
        board[2][6] = topPawn3;

        topPawn4 = new Pawn();
        board[3][6] = topPawn4;

        topPawn5 = new Pawn();
        board[4][6] = topPawn5;

        topPawn6 = new Pawn();
        board[5][6] = topPawn6;

        topPawn7 = new Pawn();
        board[6][6] = topPawn7;

        topPawn8 = topPawn8;
    }

    public Piece getPieceAt(int rank, int file)
    {
        return null;
    }
}
