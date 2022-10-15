package Java.com.javaChapter7.knight;

public class ChessBoard {
    private int [][] chessBoard;

    public ChessBoard(int size) {
        this.chessBoard = new int[size][size];
    }

    public int[][] getChessBoard() {
        return chessBoard;
    }

    public void setChessBoard(int[][] chessBoard) {
        this.chessBoard = chessBoard;
    }

    public String displayChessBoard(){
        StringBuilder builder = new StringBuilder("");
        for (int [] row : chessBoard){
            for (int col : row){
                if (col == 0){
                   builder.append(" * ");
                }
            }
            builder.append("\n");
        }
        return builder.toString();
    }
}
