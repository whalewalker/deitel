package Java.com.javaChapter8.tictactoe;

import java.util.Arrays;

import static Java.com.javaChapter8.tictactoe.Flag.EMPTY;

public class Board {
    private Flag[][] board;

    public Board(int girdValue) {
        board = new Flag[girdValue][girdValue];
        for (Flag[] flags : board) {
            Arrays.fill(flags, EMPTY);
        }
    }

    public Flag[][] getBoard() {
        return board;
    }

    public void setBoard(Flag[][] board) {
        this.board = board;
    }

    public String toString(){
        StringBuilder builder = new StringBuilder();
        for (int row = 0; row < board.length; row++) {
            for (int column = 0; column < board.length; column++) {
                switch (board[row][column]){
                    case EMPTY -> builder.append(" ");
                    case O -> builder.append("O");
                    case X -> builder.append("X");
                }
                if (column < 2) builder.append("|");
            }
            if (row < 2) builder.append("\n------\n");
        }
        return builder.toString();
    }
}
