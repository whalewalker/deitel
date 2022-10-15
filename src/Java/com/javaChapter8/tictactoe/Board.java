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

    public String displayBoard(){
        StringBuilder builder = new StringBuilder();
        for (Flag[] flags : board) {
            for (int column = 0; column < board.length; column++) {
                switch (flags[column]) {
                    case EMPTY -> builder.append(" - ");
                    case O -> builder.append(" O ");
                    case X -> builder.append(" X ");
                }
            }
            builder.append("\n");
        }
        return builder.toString();
    }
}
