package com.knight_tour;

public class Pen {
    private Position penPosition;

    public Pen() {
        this.penPosition = Position.PEN_UP;
    }

    public Position getPenPosition() {
        return penPosition;
    }

    public void setPenPosition(com.knight_tour.Position penPosition) {
        this.penPosition = penPosition;
    }
}
