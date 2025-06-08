
public abstract class Piece {
    protected boolean isWhite;

    public Piece(boolean isWhite) {
        this.isWhite = isWhite;
    }

    public boolean isWhite() {
        return isWhite;
    }

    // Symbol for printing (e.g., 'P' or 'p')
    public abstract char getSymbol();

    // Each piece must define how it moves
    public abstract boolean isValidMove(int sr, int sc, int er, int ec, Piece[][] board);
}
