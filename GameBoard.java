
/**
 * Data structure that maintains the location of each Piece in the game.
 */
public class GameBoard
{
    private Square[][] board;
    private String[] fileNames = {"a", "b", "c", "d", "e", "f", "g", "h"};
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

    // a8 | b8 | ... | h8
    // ___|____|_____|___
    // a7 | b7 | ... | h7
    // ___|____|_____|___
    // ...|... | ... |...
    // ___|____|_____|___
    // a1 | b1 | ... | h1
    // For example, sqaure a8 on the board is represented as board[0][0], b8
    // as board[0][1], h7 as board[1][7], etc.
    //
    // row = rank, column = file
    /**
     * Constructor for objects of class GameBoard. Initialize all starting
     * piece locations.
     */
    public GameBoard()
    {
        board = new Square[8][8];
        for(int i = 7; i >= 0; i--)
        {
            for(int j = 0; j < 8; j++)
            {
                board[i][j] = new Square(i, fileNames[j]);
            }
        }
        //set bottom pieces
        bottomLeftRook = new Rook("white");
        board[7][0].setPiece(bottomLeftRook);

        bottomLeftKnight = new Knight("white");
        board[7][1].setPiece(bottomLeftKnight);

        bottomLeftBishop = new Bishop("white");
        board[7][2].setPiece(bottomLeftBishop);

        bottomQueen = new Queen("white");
        board[7][3].setPiece(bottomQueen);

        bottomKing = new King("white");
        board[7][4].setPiece(bottomKing);

        bottomRightBishop = new Bishop("white");
        board[7][5].setPiece(bottomRightBishop);

        bottomRightKnight = new Knight("white");
        board[7][6].setPiece(bottomRightKnight);

        bottomRightRook = new Rook("white");
        board[7][7].setPiece(bottomRightRook);

        bottomPawn1 = new Pawn("white");
        board[6][0].setPiece(bottomPawn1);

        bottomPawn2 = new Pawn("white");
        board[6][1].setPiece(bottomPawn2);

        bottomPawn3 = new Pawn("white");
        board[6][2].setPiece(bottomPawn3);

        bottomPawn4 = new Pawn("white");
        board[6][3].setPiece(bottomPawn4);

        bottomPawn5 = new Pawn("white");
        board[6][4].setPiece(bottomPawn5);

        bottomPawn6 = new Pawn("white");
        board[6][5].setPiece(bottomPawn6);

        bottomPawn7 = new Pawn("white");
        board[6][6].setPiece(bottomPawn7);

        bottomPawn8 = new Pawn("white");
        board[6][7].setPiece(bottomPawn8);

        //set top pieces
        topLeftRook = new Rook("black");
        board[0][0].setPiece(topRightRook);

        topLeftKnight = new Knight("black");
        board[0][1].setPiece(topRightKnight);

        topLeftBishop = new Bishop("black");
        board[0][2].setPiece(topRightBishop);

        topQueen = new Queen("black");
        board[0][3].setPiece(topQueen);

        topKing = new King("black");
        board[0][4].setPiece(topKing);

        topRightBishop = new Bishop("black");
        board[0][5].setPiece(topRightBishop);

        topRightKnight = new Knight("black");
        board[0][6].setPiece(topRightKnight);

        topRightRook = new Rook("black");
        board[0][7].setPiece(topRightRook);

        topPawn1 = new Pawn("black");
        board[1][0].setPiece(topPawn1);

        topPawn2 = new Pawn("black");
        board[1][1].setPiece(topPawn2);

        topPawn3 = new Pawn("black");
        board[1][2].setPiece(topPawn3);

        topPawn4 = new Pawn("black");
        board[1][3].setPiece(topPawn4);

        topPawn5 = new Pawn("black");
        board[1][4].setPiece(topPawn5);

        topPawn6 = new Pawn("black");
        board[1][5].setPiece(topPawn6);

        topPawn7 = new Pawn("black");
        board[1][6].setPiece(topPawn7);

        topPawn8 = new Pawn("black");
        board[1][7].setPiece(topPawn8);
    }

    public Piece getPieceAt(int rank, int file)
    {
        return null;
    }
}
