package Java.com.javaChapter8.tictactoe;

public class Tictactoe {
    private Board board;
    private boolean lastPlayedWasX;
    private boolean gameWon;

    public Tictactoe(Board board) {
        this.board = board;
        lastPlayedWasX = false;
        gameWon =false;
    }

    public Board getBoard() {
        return board;
    }

    public void makeMove(int step) throws TicTactoeException {
        if (isBoardFull()) throw new TicTactoeException("Grid position is full");
        if (step > 9 || step < 1){
            throw new IllegalArgumentException("Grid position must be between 1 and 9");
        }
        step -= 1;
        int row = step / 3;
        int column = step % 3;
//        placeFlag(row, column);
    }

//    private int placeFlag(int row, int column) {
//        Flag[][] grid = board.getBoard();
//    }

    private boolean isBoardFull() {
        return false;
    }
}
