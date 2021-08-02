package Java.com.javaChapter7.turtle.sketchPad;

public class Board {
    private final int numberOfRow;
    private final int numberOfColumn;
    private final int[][] board;

    public Board(int numberOfRow, int numberOfColumn) {
        this.numberOfColumn = numberOfColumn;
        this.numberOfRow = numberOfRow;
        this.board = new int[this.numberOfRow][this.numberOfColumn];
    }

    public int getNumberOfRow() {
        return numberOfRow;
    }

    public int getNumberOfColumn() {
        return numberOfColumn;
    }

    public int[][] getBoard() {
        return board;
    }
}
