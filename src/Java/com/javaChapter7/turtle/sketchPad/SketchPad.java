package Java.com.javaChapter7.turtle.sketchPad;

public class SketchPad {

    private final Board sketchPad;

    public SketchPad(int numberOfRow, int numberOfColumn) {
        this.sketchPad = new Board(numberOfRow, numberOfColumn);
    }

    public Board getSketchPad() {
        return sketchPad;
    }
}