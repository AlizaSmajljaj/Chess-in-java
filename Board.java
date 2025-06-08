
public class Board {
    private Piece[][] board;

    public Board() {
        board = new Piece[8][8];
        setupBoard();
    }

    public void setupBoard() {
        // Place pawns
        for (int i = 0; i < 8; i++) {
            board[1][i] = new Pawn(false); // black pawns
            board[6][i] = new Pawn(true);  // white pawns
        }

        // Add other pieces later...
    }

    public void printBoard() {
        for (int r = 0; r < 8; r++) {
            System.out.print((8 - r) + " ");
            for (int c = 0; c < 8; c++) {
                Piece p = board[r][c];
                System.out.print((p == null ? '.' : p.getSymbol()) + " ");
            }
            System.out.println();
        }
        System.out.println("  a b c d e f g h");
    }

    public boolean movePiece(int sr, int sc, int er, int ec, boolean whiteTurn) {
        Piece p = board[sr][sc];
        if (p == null || p.isWhite() != whiteTurn) return false;
        if (!p.isValidMove(sr, sc, er, ec, board)) return false;

        board[er][ec] = p;
        board[sr][sc] = null;
        return true;
    }
}
