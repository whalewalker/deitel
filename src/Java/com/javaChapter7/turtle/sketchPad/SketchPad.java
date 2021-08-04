package Java.com.javaChapter7.turtle.sketchPad;

public class SketchPad {

    private final Board sketchPad;

    public SketchPad(int numberOfRow, int numberOfColumn) {
        this.sketchPad = new Board(numberOfRow, numberOfColumn);
    }

    public Board getSketchPad() {
        return sketchPad;
    }

    public String displayTurtle(){
        StringBuilder builder = new StringBuilder();
        int[][] board = getSketchPad().getBoard();
        for (int[] row : board){
            for (int column : row){
                if (column == 1) builder.append("* ");
                else builder.append("  ");
            }
            builder.append("\n");
        }
        return builder.toString();
    }
}