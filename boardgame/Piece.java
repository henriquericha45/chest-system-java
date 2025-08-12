package boardgame;

public class Piece {
    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
    }

    protected Board getBoard() {
        return board;
    }

    @Override
    public String toString() {
        return "Piece [position=" + position + ", board=" + board + "]";
    }
}
