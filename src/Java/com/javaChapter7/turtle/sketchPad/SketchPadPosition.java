package Java.com.javaChapter7.turtle.sketchPad;

public class SketchPadPosition {
    private int rowPosition;
    private  int columnPosition;

    public SketchPadPosition(int rowPosition, int columnPosition) {
        this.rowPosition = rowPosition;
        this.columnPosition = columnPosition;
    }

    public int getRowPosition() {
        return rowPosition;
    }

    public void setRowPosition(int rowPosition) {
        this.rowPosition = rowPosition;
    }

    public int getColumnPosition() {
        return columnPosition;
    }

    public void setColumnPosition(int columnPosition) {
        this.columnPosition = columnPosition;
    }

    @Override
    public boolean equals(Object obj) {
        boolean isEqual = false;
        if(obj.getClass() == this.getClass()){
            SketchPadPosition comparedObject = (SketchPadPosition) obj;
            boolean isSamePosition = comparedObject.columnPosition == this.getColumnPosition() && comparedObject.getRowPosition() == this.getRowPosition();

            if (isSamePosition) isEqual = true;
        }
        return isEqual;
    }
}
