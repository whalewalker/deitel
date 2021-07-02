package Java.com.knight_tour;

public class KnightTour {
    private Java.com.knight_tour.Pen pen;
    private Direction currentDirection;

    public KnightTour(Java.com.knight_tour.Pen pen) {
        this.pen = pen;
        this.currentDirection = Direction.EAST;
    }

    public Java.com.knight_tour.Pen getPen() {
        return pen;
    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public void setCurrentDirection(Direction direction) {
        this.currentDirection = direction;
    }

    public void turnRightTwoColumnOneRow() {
        switch (currentDirection){
            case EAST, SOUTH -> setCurrentDirection(Direction.SOUTH);
        }
    }


    public void turnLeftTwoColumnOneRow() {
        switch (currentDirection){
            case WEST, SOUTH -> setCurrentDirection(Direction.SOUTH);
        }
    }

    public void turnTwoRowOneColumnToLeft() {
        switch (currentDirection){case WEST -> setCurrentDirection(Direction.WEST); }
    }

    public void turnTwoRowOneColumnToRight() {
        switch (currentDirection){
            case EAST -> setCurrentDirection(Direction.EAST);
        }
    }
}
