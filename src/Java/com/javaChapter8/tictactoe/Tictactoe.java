package Java.com.javaChapter8.tictactoe;

public class Tictactoe {
    private Board board;
    private boolean lastPlayerWasX;
    private boolean gameWon;

    public Tictactoe(Board board) {
        this.board = board;
        lastPlayerWasX = false;
        gameWon = false;
    }

    public Board getBoard() {
        return board;
    }

    public int makeMove(int step) throws TicTactoeException {
        if (isBoardFull()) throw new TicTactoeException("Grid position is full");
        if (step > 9 || step < 1) {
            throw new IllegalArgumentException("Grid position must be between 1 and 9");
        }
        step -= 1;
        int row = step / 3;
        int column = step % 3;
        return placeFlag(row, column);
    }

    private int placeFlag(int row, int column) {
        Flag[][] grid = board.getBoard();
        if (grid[row][column].equals(Flag.EMPTY)) {
            if (lastPlayerWasX) {
                grid[row][column] = Flag.O;
                lastPlayerWasX = false;
            } else {
                grid[row][column] = Flag.X;
                lastPlayerWasX = true;
            }
            return 1;
        } else {
            return -1;
        }

    }

    private boolean isBoardFull() {
        Flag[][] grid = board.getBoard();
        for (Flag[] row : grid) {
            for (Flag col : row) {
                if (col == Flag.EMPTY)
                    return false;
            }
        }
        return true;
    }

    public boolean checkWin() {
        if (checkHorizontalWin()) {
            gameWon = true;
            return true;
        }
        if (checkVerticalWin()) {
            gameWon = true;
            return true;
        }
       if ( checkDiagonal()) {
           gameWon = true;
           return true;
       }
       return gameWon;
    }

    private boolean checkHorizontalWin() {
        Flag[][] grid = board.getBoard();
        for (Flag[] flags : grid) {
            if ( !flags[0].equals(Flag.EMPTY ) || !flags[1].equals(Flag.EMPTY) || !flags[2].equals(Flag.EMPTY)) {
                if (flags[0].equals(flags[1]) && flags[1].equals(flags[2])) return true;
            }
        }
        return false;
    }

    private boolean checkVerticalWin() {
        Flag[][] grid = board.getBoard();
        for (int col = 0; col < grid.length; col++) {
            if ( !grid[0][col].equals(Flag.EMPTY ) || !grid[1][col].equals(Flag.EMPTY) || !grid[2][col].equals(Flag.EMPTY)) {
                if (grid[0][col].equals(grid[1][col]) && grid[1][col].equals(grid[2][col])) return true;
            }
        }
        return false;
    }

    private boolean checkDiagonal() {
        Flag[][] grid = board.getBoard();
        if (!grid[1][1].equals(Flag.EMPTY)){
            if (grid[0][0].equals(grid[1][1]) && grid[1][1].equals(grid[2][2])) return  true;
            return grid[0][2].equals(grid[1][1]) && grid[1][1].equals(grid[2][0]);
        }
        return false;
    }

    public void displayBoard() {
        checkWin();
        System.out.println(board.displayBoard());
    }

    public void resetGame() {
        int previousGameBoardSize = board.getBoard().length;
        board = new Board(previousGameBoardSize);
        lastPlayerWasX = false;
        gameWon = false;
    }
}
