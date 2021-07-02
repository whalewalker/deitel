package Java.com.knight_tour;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KnightTourTest {
    Java.com.knight_tour.KnightTour knight;
    Java.com.knight_tour.Pen pen;

    @BeforeEach
    void setUp() {
        pen = new Java.com.knight_tour.Pen();
        knight = new Java.com.knight_tour.KnightTour(pen);
    }

    @AfterEach
    void tearDown() {
        knight = null;
    }

    @Test
    void knight_hasAPen(){
        Assertions.assertNotNull(knight.getPen());
    }

    @Test
    void knightPen_positionCanBeUp(){
        knight.getPen().setPenPosition(Java.com.knight_tour.Position.PEN_UP);
        Java.com.knight_tour.Position actual = knight.getPen().getPenPosition();
        assertEquals(Java.com.knight_tour.Position.PEN_UP, actual);
    }

    @Test
    void knightPen_positionCanBeDown(){
        knight.getPen().setPenPosition(Java.com.knight_tour.Position.PEN_DOWN);
        Java.com.knight_tour.Position actual = knight.getPen().getPenPosition();
        assertEquals(Java.com.knight_tour.Position.PEN_DOWN, actual);
    }

//    @Test
//    void knightPen_positionCanBeLeft(){
//        knight.getPen().setPenPosition(Java.com.knight_tour.Position.PEN_LEFT);
//        Java.com.knight_tour.Position actual = knight.getPen().getPenPosition();
//        assertEquals(Java.com.knight_tour.Position.PEN_LEFT, actual);
//    }
//
//    @Test
//    void knightPen_positionCanBeRight(){
//        knight.getPen().setPenPosition(Java.com.knight_tour.Position.PEN_LEFT);
//        Java.com.knight_tour.Position actual = knight.getPen().getPenPosition();
//        assertEquals(Java.com.knight_tour.Position.PEN_LEFT, actual);
//    }

    @Test
    void knight_canMoveTwoColumnOneRowToTheRight(){
        knight.turnRightTwoColumnOneRow();
        assertEquals(Java.com.knight_tour.Direction.SOUTH, knight.getCurrentDirection());

        knight.turnRightTwoColumnOneRow();
        assertEquals(Java.com.knight_tour.Direction.SOUTH, knight.getCurrentDirection());
    }

    @Test
    void knight_canMoveTwoColumnOneRowToTheLeft(){
        knight.setCurrentDirection(Java.com.knight_tour.Direction.WEST);
        knight.turnLeftTwoColumnOneRow();
        assertEquals(Java.com.knight_tour.Direction.SOUTH, knight.getCurrentDirection());

        knight.turnRightTwoColumnOneRow();
        assertEquals(Java.com.knight_tour.Direction.SOUTH, knight.getCurrentDirection());
        knight.turnLeftTwoColumnOneRow();
        assertEquals(Direction.SOUTH, knight.getCurrentDirection());
    }

    @Test
    void knight_canMoveTwoRowOneColumnToRight(){
        knight.turnTwoRowOneColumnToRight();
        assertEquals(Direction.EAST, knight.getCurrentDirection());
    }

    @Test
    void knight_canMoveTwoRowOneColumnToLeft(){
        knight.setCurrentDirection(Java.com.knight_tour.Direction.WEST);
        knight.turnTwoRowOneColumnToLeft();
        assertEquals(Direction.WEST, knight.getCurrentDirection());
    }

    @Test
    void knightCheeseBoard_canMove_EastWard_WhilePenIsDown(){

    }



}