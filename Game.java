
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Board board = new Board();
    boolean whiteTurn = true;

    while (true) {
        board.printBoard();
        System.out.print((whiteTurn ? "White" : "Black") + "'s move (e.g., e2 e4): ");
        String from = input.next();
        String to = input.next();

        int sr = 8 - Character.getNumericValue(from.charAt(1));
        int sc = from.charAt(0) - 'a';
        int er = 8 - Character.getNumericValue(to.charAt(1));
        int ec = to.charAt(0) - 'a';

        boolean moved = board.movePiece(sr, sc, er, ec, whiteTurn);
        if (!moved) {
            System.out.println("Invalid move. Try again.");
            continue;
        }

        whiteTurn = !whiteTurn;
    }
}

    }

