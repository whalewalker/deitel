package Java.com.knight_tour;

public class Pen {
    private Position penPosition;

    public Pen() {
        this.penPosition = Position.PEN_UP;
    }

    public Position getPenPosition() {
        return penPosition;
    }

    public void setPenPosition(Java.com.knight_tour.Position penPosition) {
        this.penPosition = penPosition;
    }
}
