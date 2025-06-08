
public class Pawn extends Piece {
    public Pawn(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public char getSymbol() {
        return isWhite ? 'P' : 'p';
    }

    @Override
public boolean isValidMove(int sr, int sc, int er, int ec, Piece[][] board) {
    int direction = isWhite ? -1 : 1;
    int startRow = isWhite ? 6 : 1;

    // Move forward one
    if (sc == ec && er == sr + direction && board[er][ec] == null) {
        return true;
    }

    // Move forward two from starting row
    if (sc == ec && sr == startRow && er == sr + 2 * direction
        && board[sr + direction][ec] == null && board[er][ec] == null) {
        return true;
    }

    // Capture diagonally
    if (Math.abs(sc - ec) == 1 && er == sr + direction && board[er][ec] != null
        && board[er][ec].isWhite() != this.isWhite()) {
        return true;
    }

    return false;
}

}
