package Java.com.javaChapter7.turtle;

import Java.com.javaChapter7.turtle.exceptions.SketchPadOverFlowException;
import Java.com.javaChapter7.turtle.exceptions.SketchPadUnderFlowException;
import Java.com.javaChapter7.turtle.pen.Pen;
import Java.com.javaChapter7.turtle.sketchPad.SketchPad;
import Java.com.javaChapter7.turtle.sketchPad.SketchPadPosition;
import Java.com.knight_tour.Position;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static Java.com.javaChapter7.turtle.direction.Direction.*;
import static Java.com.knight_tour.Position.*;
import static org.junit.jupiter.api.Assertions.*;

public class TurtleTest {

    Pen pen;
    Turtle turtle;
    SketchPad sketchPad;

    @BeforeEach
    void setUp(){
        pen = new Pen();
        turtle = new Turtle(pen);
        sketchPad = new SketchPad(20, 20);
    }

    @AfterEach
    void tearDown(){
        pen = null;
        turtle = null;
        sketchPad = null;
    }

    @Test
    void turtle_hasAPen(){
        assertNotNull(turtle.getPen());
    }

    @Test
    void turtle_positionCanBeUpByDefault(){
        turtle.getPen().setPenPosition(Position.PEN_UP);
        Position actual = turtle.getPen().getPenPosition();
        assertEquals(Position.PEN_UP, actual);
    }

    @Test
    void turtle_positionCanBeDown(){
        turtle.getPen().setPenPosition(PEN_DOWN);
        Position actual = turtle.getPen().getPenPosition();
        assertEquals(PEN_DOWN, actual);
    }

    @Test
    void turtle_positionCanBeUp(){
        turtle.getPen().setPenPosition(PEN_DOWN);
        turtle.getPen().setPenPosition(PEN_UP);
        Position actual = turtle.getPen().getPenPosition();
        assertEquals(PEN_UP, actual);
    }

    @Test
    void turtlePen_canTurnRightAtNinetyDegree(){
//        90 degree direction
        turtle.turnRightNinetyDegree();
        assertEquals(SOUTH, turtle.getCurrentDirection());

        turtle.turnRightNinetyDegree();
        assertEquals(WEST, turtle.getCurrentDirection());

        turtle.turnRightNinetyDegree();
        assertEquals(NORTH, turtle.getCurrentDirection());

        turtle.turnRightNinetyDegree();
        assertEquals(EAST, turtle.getCurrentDirection());

//        45 degree direction
        turtle.setCurrentDirection(NORTH_EAST);

        turtle.turnRightNinetyDegree();
        assertEquals(SOUTH_EAST, turtle.getCurrentDirection());

        turtle.turnRightNinetyDegree();
        assertEquals(SOUTH_WEST, turtle.getCurrentDirection());

        turtle.turnRightNinetyDegree();
        assertEquals(NORTH_WEST, turtle.getCurrentDirection());

        turtle.turnRightNinetyDegree();
        assertEquals(NORTH_EAST, turtle.getCurrentDirection());
    }

    @Test
    void turtle_canTurnRightAtFortyFiveDegree(){
        turtle.setCurrentDirection(NORTH_EAST);

        turtle.turnRightFortyFiveDegree();
        assertEquals(EAST, turtle.getCurrentDirection());

        turtle.turnRightFortyFiveDegree();
        assertEquals(SOUTH_EAST, turtle.getCurrentDirection());

        turtle.turnRightFortyFiveDegree();
        assertEquals(SOUTH, turtle.getCurrentDirection());

        turtle.turnRightFortyFiveDegree();
        assertEquals(SOUTH_WEST, turtle.getCurrentDirection());

        turtle.turnRightFortyFiveDegree();
        assertEquals(WEST, turtle.getCurrentDirection());

        turtle.turnRightFortyFiveDegree();
        assertEquals(NORTH_WEST, turtle.getCurrentDirection());

        turtle.turnRightFortyFiveDegree();
        assertEquals(NORTH, turtle.getCurrentDirection());

        turtle.turnRightFortyFiveDegree();
        assertEquals(NORTH_EAST, turtle.getCurrentDirection());
    }

    @Test
    void turtlePen_canTurnLeftAtNinetyDegree(){
//        90 degree direction
        turtle.turnLeftNinetyDegree();
        assertEquals(NORTH, turtle.getCurrentDirection());

        turtle.turnLeftNinetyDegree();
        assertEquals(WEST, turtle.getCurrentDirection());

        turtle.turnLeftNinetyDegree();
        assertEquals(SOUTH, turtle.getCurrentDirection());

        turtle.turnLeftNinetyDegree();
        assertEquals(EAST, turtle.getCurrentDirection());

//        45 degree direction
        turtle.setCurrentDirection(NORTH_EAST);

        turtle.turnLeftNinetyDegree();
        assertEquals(NORTH_WEST, turtle.getCurrentDirection());

        turtle.turnLeftNinetyDegree();
        assertEquals(SOUTH_WEST, turtle.getCurrentDirection());

        turtle.turnLeftNinetyDegree();
        assertEquals(SOUTH_EAST, turtle.getCurrentDirection());

        turtle.turnLeftNinetyDegree();
        assertEquals(NORTH_EAST, turtle.getCurrentDirection());
    }

    @Test
    void turtle_canTurnLeftAtFortyFiveDegree(){
        turtle.setCurrentDirection(NORTH_EAST);

        turtle.turnLeftFortyFiveDegree();
        assertEquals(NORTH, turtle.getCurrentDirection());

        turtle.turnLeftFortyFiveDegree();
        assertEquals(NORTH_WEST, turtle.getCurrentDirection());

        turtle.turnLeftFortyFiveDegree();
        assertEquals(WEST, turtle.getCurrentDirection());

        turtle.turnLeftFortyFiveDegree();
        assertEquals(SOUTH_WEST, turtle.getCurrentDirection());

        turtle.turnLeftFortyFiveDegree();
        assertEquals(SOUTH, turtle.getCurrentDirection());

        turtle.turnLeftFortyFiveDegree();
        assertEquals(SOUTH_EAST, turtle.getCurrentDirection());

        turtle.turnLeftFortyFiveDegree();
        assertEquals(EAST, turtle.getCurrentDirection());

        turtle.turnLeftFortyFiveDegree();
        assertEquals(NORTH_EAST, turtle.getCurrentDirection());
    }

    @Test
    void turtleSketchPad_canMoveEastWard_onSketchPad_whilePenIsUp(){
        turtle.setCurrentSketchPadPosition(new SketchPadPosition(0, 0));
        int stepToMoves = 7;
        try {
            turtle.move(sketchPad, stepToMoves);
        } catch (SketchPadOverFlowException | SketchPadUnderFlowException e) {
            e.getLocalizedMessage();
        }
        assertEquals(new SketchPadPosition(0, 6), turtle.getCurrentSketchPadPosition());
    }

    @Test
    void turtleSketchPad_canMoveSouthWard_onSketchPad_whilePenIsUp(){
        turtle.turnRightNinetyDegree();
        turtle.setCurrentSketchPadPosition(new SketchPadPosition(0, 0));
        int stepToMoves = 7;
        try {
            turtle.move(sketchPad, stepToMoves);
        } catch (SketchPadOverFlowException | SketchPadUnderFlowException e) {
            e.getLocalizedMessage();
        }
        assertEquals(new SketchPadPosition(6, 0), turtle.getCurrentSketchPadPosition());
    }

    @Test
    void turtleSketchPad_canMoveWestWard_onSketchPad_whilePenIsUp(){
        turtle.setCurrentDirection(WEST);
        turtle.setCurrentSketchPadPosition(new SketchPadPosition(0, 7));
        int stepToMoves = 7;
        try {
            turtle.move(sketchPad, stepToMoves);
        } catch (SketchPadOverFlowException | SketchPadUnderFlowException e) {
            e.getLocalizedMessage();
        }
        assertEquals(new SketchPadPosition(0, 1), turtle.getCurrentSketchPadPosition());
    }

    @Test
    void turtleSketchPad_canMoveNorth_onSketchPad_whilePenIsUp(){
        turtle.setCurrentDirection(NORTH);
        turtle.setCurrentSketchPadPosition(new SketchPadPosition(7, 0));
        int stepToMoves = 7;
        try {
            turtle.move(sketchPad, stepToMoves);
        } catch (SketchPadOverFlowException | SketchPadUnderFlowException e) {
            e.getLocalizedMessage();
        }
        assertEquals(new SketchPadPosition(1, 0), turtle.getCurrentSketchPadPosition());
    }

    @Test
    void turtleSketch_canThrowException_whenColumnPositionIsLesserOrEqualToThanZero_OnWestWard_WhilePenIsUp() {
        turtle.setCurrentDirection(WEST);
        turtle.setCurrentSketchPadPosition(new SketchPadPosition(0, 0));
        int stepToMoves = 7;
        assertThrows(SketchPadUnderFlowException.class, ()-> turtle.move(sketchPad, stepToMoves));
    }

    @Test
    void turtleSketch_canThrowException_whenRowPositionIsLesserOrEqualToThanZero_OnNorthWard_WhilePenIsUp() {
        turtle.setCurrentDirection(NORTH);
        turtle.setCurrentSketchPadPosition(new SketchPadPosition(0, 0));
        int stepToMoves = 7;
        assertThrows(SketchPadUnderFlowException.class, ()-> turtle.move(sketchPad, stepToMoves));
    }



    @Test
    void turtleSketch_canThrowException_whenColumnPositionIsGreaterOrEqualToThanBoardColumnPosition_OnEastWard_WhilePenIsUp() {
        turtle.setCurrentSketchPadPosition(new SketchPadPosition(0, 20));
        int stepToMoves = 7;
        assertThrows(SketchPadOverFlowException.class, ()-> turtle.move(sketchPad, stepToMoves));
    }


    @Test
    void turtleSketch_canThrowException_whenRowPositionIsGreaterOrEqualToThanBoardRowPosition_OnSouthWard_WhilePenIsUp()  {
        turtle.setCurrentDirection(SOUTH);
        turtle.setCurrentSketchPadPosition(new SketchPadPosition(20, 0));
        int stepToMoves = 7;
        assertThrows(SketchPadOverFlowException.class, ()-> turtle.move(sketchPad, stepToMoves));
    }

    @Test
    void turtleSketchPad_canMoveSouthEastWard_onSketchPad_whilePenIsUp(){
        turtle.setCurrentDirection(SOUTH_EAST);
        turtle.setCurrentSketchPadPosition(new SketchPadPosition(0, 0));
        int stepToMoves = 7;
        try {
            turtle.move(sketchPad, stepToMoves);
        } catch (SketchPadOverFlowException | SketchPadUnderFlowException e) {
            e.getLocalizedMessage();
        }
        assertEquals(new SketchPadPosition(6, 6), turtle.getCurrentSketchPadPosition());
    }

    @Test
    void turtleSketchPad_canMoveSouthWestWard_onSketchPad_whilePenIsUp(){
        turtle.setCurrentDirection(SOUTH_WEST);
        turtle.setCurrentSketchPadPosition(new SketchPadPosition(7, 7));
        int stepToMoves = 5;
        try {
            turtle.move(sketchPad, stepToMoves);
        } catch (SketchPadOverFlowException | SketchPadUnderFlowException e) {
            e.getLocalizedMessage();
        }
        assertEquals(new SketchPadPosition(11, 3), turtle.getCurrentSketchPadPosition());
    }

    @Test
    void turtleSketchPad_canMoveNorthWestWard_onSketchPad_whilePenIsUp(){
        turtle.setCurrentDirection(NORTH_WEST);
        turtle.setCurrentSketchPadPosition(new SketchPadPosition(7, 7));
        int stepToMoves = 7;
        try {
            turtle.move(sketchPad, stepToMoves);
        } catch (SketchPadOverFlowException | SketchPadUnderFlowException e) {
            e.getLocalizedMessage();
        }
        assertEquals(new SketchPadPosition(1, 1), turtle.getCurrentSketchPadPosition());
    }

    @Test
    void turtleSketchPad_canMoveNorthEastWard_onSketchPad_whilePenIsUp(){
        turtle.setCurrentDirection(NORTH_EAST);
        turtle.setCurrentSketchPadPosition(new SketchPadPosition(7, 7));
        int stepToMoves = 7;
        try {
            turtle.move(sketchPad, stepToMoves);
        } catch (SketchPadOverFlowException | SketchPadUnderFlowException e) {
            e.getLocalizedMessage();
        }
        assertEquals(new SketchPadPosition(1, 13), turtle.getCurrentSketchPadPosition());
    }



    @Test
    void turtleSketch_canThrowException_OnSouthWestWard_WhilePenIsUp() {
        turtle.setCurrentDirection(SOUTH_WEST);
        turtle.setCurrentSketchPadPosition(new SketchPadPosition(0, 0));
        int stepToMoves = 7;
        assertThrows(SketchPadUnderFlowException.class, ()-> turtle.move(sketchPad, stepToMoves));
    }

    @Test
    void turtleSketch_canThrowException_OnNorthWestWard_WhilePenIsUp() {
        turtle.setCurrentDirection(NORTH_WEST);
        turtle.setCurrentSketchPadPosition(new SketchPadPosition(0, 0));
        int stepToMoves = 7;
        assertThrows(SketchPadUnderFlowException.class, ()-> turtle.move(sketchPad, stepToMoves));
    }



    @Test
    void turtleSketch_canThrowException_OnSouthEastWard_WhilePenIsUp() {
        turtle.setCurrentDirection(SOUTH_EAST);
        turtle.setCurrentSketchPadPosition(new SketchPadPosition(0, 20));
        int stepToMoves = 7;
        assertThrows(SketchPadOverFlowException.class, ()-> turtle.move(sketchPad, stepToMoves));
    }


    @Test
    void turtleSketch_canThrowException__OnNorthEastWard_WhilePenIsUp()  {
        turtle.setCurrentDirection(NORTH_EAST);
        turtle.setCurrentSketchPadPosition(new SketchPadPosition(0, 0));
        int stepToMoves = 7;
        assertThrows(SketchPadOverFlowException.class, ()-> turtle.move(sketchPad, stepToMoves));
    }


    @Test
    void turtle_canWriteOnSketchPad_whileFacingEast(){
        turtle.getPen().setPenPosition(PEN_DOWN);
        turtle.setCurrentSketchPadPosition(new SketchPadPosition(0, 0));
        int numberOfSteps = 7;
        try {
            turtle.move(sketchPad, numberOfSteps);
        } catch (SketchPadOverFlowException | SketchPadUnderFlowException e) {
            e.printStackTrace();
        }
        for (int column = 0; column < numberOfSteps - 1; column++){
            int expected = sketchPad.getSketchPad().getBoard()[0][column];
            assertEquals(1, expected);
        }
        assertEquals(new SketchPadPosition(0, 6), turtle.getCurrentSketchPadPosition());
    }

    @Test
    void turtle_canWriteOnSketchPad_whileFacingSouth(){
        turtle.getPen().setPenPosition(PEN_DOWN);
        turtle.setCurrentSketchPadPosition(new SketchPadPosition(0, 0));
        int numberOfSteps = 7;
        turtle.setCurrentDirection(SOUTH);
        try {
            turtle.move(sketchPad, numberOfSteps);
        } catch (SketchPadOverFlowException | SketchPadUnderFlowException e) {
            e.printStackTrace();
        }
        for (int row = 0; row < numberOfSteps - 1; row++){
            int expected = sketchPad.getSketchPad().getBoard()[row][0];
            assertEquals(1, expected);
        }
        assertEquals(new SketchPadPosition(6, 0), turtle.getCurrentSketchPadPosition());
    }

    @Test
    void turtle_canWriteOnSketchPad_whileFacingWest(){
        turtle.getPen().setPenPosition(PEN_DOWN);
        turtle.setCurrentSketchPadPosition(new SketchPadPosition(7, 7));
        int numberOfSteps = 7;
        turtle.setCurrentDirection(WEST);
        try {
            turtle.move(sketchPad, numberOfSteps);
        } catch (SketchPadOverFlowException | SketchPadUnderFlowException e) {
            e.printStackTrace();
        }
        for (int column = 0; column < numberOfSteps - 1; column++){
            int expected = sketchPad.getSketchPad().getBoard()[0][column];
            assertEquals(1, expected);
        }
        assertEquals(new SketchPadPosition(7, 1), turtle.getCurrentSketchPadPosition());
    }

    @Test
    void turtle_canWriteOnSketchPad_whileFacingNorth(){
        turtle.getPen().setPenPosition(PEN_DOWN);
        turtle.setCurrentSketchPadPosition(new SketchPadPosition(8, 7));
        int numberOfSteps = 6;
        turtle.setCurrentDirection(NORTH);
        try {
            turtle.move(sketchPad, numberOfSteps);
        } catch (SketchPadOverFlowException | SketchPadUnderFlowException e) {
            e.printStackTrace();
        }
//        System.out.println(sketchPad.displayTurtle());
        for (int row = 8; row > numberOfSteps - 1; row--){
            int expected = sketchPad.getSketchPad().getBoard()[row][0];
            System.out.println(expected);
            assertEquals(1, expected);
        }

        assertEquals(new SketchPadPosition(7, 1), turtle.getCurrentSketchPadPosition());
    }

}
