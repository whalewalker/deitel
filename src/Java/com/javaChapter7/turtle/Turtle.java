package Java.com.javaChapter7.turtle;

import Java.com.javaChapter7.turtle.direction.Direction;
import Java.com.javaChapter7.turtle.exceptions.SketchPadOverFlowException;
import Java.com.javaChapter7.turtle.exceptions.SketchPadUnderFlowException;
import Java.com.javaChapter7.turtle.pen.Pen;
import Java.com.javaChapter7.turtle.sketchPad.Board;
import Java.com.javaChapter7.turtle.sketchPad.SketchPad;
import Java.com.javaChapter7.turtle.sketchPad.SketchPadPosition;

import static Java.com.javaChapter7.turtle.direction.Direction.*;
import static Java.com.knight_tour.Position.PEN_DOWN;
import static Java.com.knight_tour.Position.PEN_UP;

public class Turtle {
    private Pen pen;
    private Direction currentDirection;
    private SketchPadPosition sketchPadPosition;

    public Turtle(Pen pen) {
        this.pen = pen;
        this.sketchPadPosition = new SketchPadPosition(0, 0);
        currentDirection = EAST;
    }

    public Pen getPen() {
        return pen;
    }

    public void setPen(Pen pen) {
        this.pen = pen;
    }

    public Direction getCurrentDirection() {
        return this.currentDirection;
    }

    public void setCurrentDirection(Direction currentDirection) {
        this.currentDirection = currentDirection;
    }

    public void turnRightNinetyDegree() {
        updateCurrentDirection(SOUTH, WEST, NORTH, EAST, SOUTH_EAST, SOUTH_WEST, NORTH_WEST, NORTH_EAST);
    }

    public void turnRightFortyFiveDegree() {
        updateCurrentDirection(SOUTH_EAST, SOUTH_WEST, NORTH_WEST, NORTH_EAST, EAST, SOUTH, WEST, NORTH);
    }

    private void updateCurrentDirection(Direction southEast, Direction southWest, Direction northWest, Direction northEast, Direction east, Direction south, Direction west, Direction north) {
        switch (currentDirection) {
            case EAST -> setCurrentDirection(southEast);
            case SOUTH -> setCurrentDirection(southWest);
            case WEST -> setCurrentDirection(northWest);
            case NORTH -> setCurrentDirection(northEast);
            case NORTH_EAST -> setCurrentDirection(east);
            case SOUTH_EAST -> setCurrentDirection(south);
            case SOUTH_WEST -> setCurrentDirection(west);
            case NORTH_WEST -> setCurrentDirection(north);
        }
    }


    public void turnLeftNinetyDegree() {
        updateCurrentDirection(NORTH, EAST, SOUTH, WEST, NORTH_WEST, NORTH_EAST, SOUTH_EAST, SOUTH_WEST);
    }

    public void turnLeftFortyFiveDegree() {
        updateCurrentDirection(NORTH_EAST, SOUTH_EAST, SOUTH_WEST, NORTH_WEST, NORTH, EAST, SOUTH, WEST);
    }
    
    public void setCurrentSketchPadPosition(SketchPadPosition sketchPadPosition){
        this.sketchPadPosition = sketchPadPosition;
    }
    
    public SketchPadPosition getCurrentSketchPadPosition(){
        return sketchPadPosition;
    }

    public void move(SketchPad sketchPad, int stepToMoves) throws SketchPadOverFlowException, SketchPadUnderFlowException {
        stepToMoves -= 1;
        Board floor = sketchPad.getSketchPad();

        int currentColumn = getCurrentSketchPadPosition().getColumnPosition();
        int currentRow = getCurrentSketchPadPosition().getRowPosition();

        SketchPadPosition currentSketchPadPosition = getCurrentSketchPadPosition();

        if (getPen().getPenPosition() == PEN_UP) {

            switch (currentDirection){
                case EAST ->{
                    if (currentColumn >= floor.getNumberOfColumn()) throw new SketchPadOverFlowException("Number of column has been exceeded");
                    currentSketchPadPosition.setColumnPosition(currentColumn + stepToMoves);
                }
                case SOUTH -> {
                    if (currentRow >= floor.getNumberOfRow()) throw new SketchPadOverFlowException("Number of row has been exceeded");
                    currentSketchPadPosition.setRowPosition(currentRow + stepToMoves);
                }
                case WEST -> {
                    if (currentColumn <= 0) throw new SketchPadUnderFlowException("column is underflow");
                    currentSketchPadPosition.setColumnPosition(currentColumn - stepToMoves);
                }
                case NORTH -> {
                    if (currentRow <= 0) throw new SketchPadUnderFlowException("Row underflow");
                    currentSketchPadPosition.setRowPosition(currentRow - stepToMoves);
                }
                case SOUTH_EAST -> {
                    if (currentColumn >= floor.getNumberOfColumn() || currentRow >= floor.getNumberOfRow()) throw new SketchPadOverFlowException("Number of column or row is exceeded");
                    currentSketchPadPosition.setColumnPosition(currentColumn + stepToMoves);
                    currentSketchPadPosition.setRowPosition(currentRow + stepToMoves);
                }

                case SOUTH_WEST -> {
                    if (currentRow >= floor.getNumberOfRow() || currentRow <= 0) throw new SketchPadUnderFlowException("Number of column or row is underflow");
                    currentSketchPadPosition.setColumnPosition(currentColumn - stepToMoves);
                    currentSketchPadPosition.setRowPosition(currentRow + stepToMoves);
                }
                case NORTH_EAST -> {
                    if(currentRow <= 0 || currentColumn >= floor.getNumberOfColumn())throw new SketchPadOverFlowException("Number of column or row is underflow");
                    currentSketchPadPosition.setRowPosition(currentRow - stepToMoves);
                    currentSketchPadPosition.setColumnPosition(currentColumn + stepToMoves);
                }

                case NORTH_WEST -> {
                    if (currentRow <= 0 || currentColumn <= 0) throw new SketchPadUnderFlowException("Number of column or row is underflow");
                    currentSketchPadPosition.setRowPosition(currentRow - stepToMoves);
                    currentSketchPadPosition.setColumnPosition(currentColumn - stepToMoves);
                }
            }
        }

        if (getPen().getPenPosition() == PEN_DOWN){

            switch (currentDirection){
                case EAST -> {
                    while (currentColumn < stepToMoves){
                        floor.getBoard()[currentRow][currentColumn++] = 1;
                    }
                    currentSketchPadPosition.setColumnPosition(currentColumn);
                }
                case SOUTH -> {
                    while (currentRow < stepToMoves){
                        floor.getBoard()[currentRow++][currentColumn] = 1;
                    }
                    currentSketchPadPosition.setRowPosition(currentRow);
                }

                case NORTH -> {
                    while (stepToMoves > 0){
                        floor.getBoard()[stepToMoves--][currentColumn] = 1;
                    }
                    currentSketchPadPosition.setRowPosition(stepToMoves);
                }

                case WEST -> {
                    while (stepToMoves > 0){
                        floor.getBoard()[currentRow][stepToMoves--] = 1;
                    }
                    currentSketchPadPosition.setColumnPosition(stepToMoves);
                }
            }
        }
    }
}
