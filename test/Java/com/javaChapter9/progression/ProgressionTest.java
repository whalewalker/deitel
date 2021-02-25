package Java.com.javaChapter9.progression;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProgressionTest {
    Progression progression;
    ArithmeticProgression arithmeticProgression;
    GeometricProgression geometricProgression;
    Fibonacci fibonacci;

    @BeforeEach
    void setUp() {
        progression = new Progression();
        arithmeticProgression = new ArithmeticProgression();
        geometricProgression = new GeometricProgression();
         fibonacci = new Fibonacci();
    }

    @AfterEach
    void tearDown() {
        progression = null;
        arithmeticProgression = null;
    }

    @Test
    void progression_canSetDefaultValueAtThePointOfCreatingProgressionObject(){
        progression = new Progression(6L);
        assertEquals(progression.getCurrent(), 6);
    }

    @Test
    void test_currentValueCanBeGetAfterConstruction(){
        assertEquals(progression.getCurrent(), 0);
    }

    @Test
    void test_currentValueCanBeSet(){
        progression.setCurrent(4L);
        assertEquals(progression.getCurrent(), 4);
    }

    @Test
    void Progression_canIncrementCurrentValue(){
        progression.setCurrent(4L);
        progression.advance();
        assertEquals(progression.getCurrent(), 5);
    }

    @Test
    void Progression_canGetPreviousProgressionByIncreasingTheCurrentValue(){
        progression.setCurrent(4L);
        assertEquals(progression.nextValue(), 4);
        assertEquals(progression.nextValue(), 5);
        assertEquals(progression.nextValue(), 6);
    }

    @Test
    void Progression_canPrintAllPossibleProgressionOfAGivenValue(){
        progression.setCurrent(4L);
        assertEquals("4,5,6,", progression.printProgression(3));
    }

    @Test
    void arithmeticProgression_canGetCurrentValue(){
        assertEquals(arithmeticProgression.getCurrent(), 1);
    }

    @Test
    void arithmeticProgression_canSetOneDefaultValueAtPointOfCreation(){
        arithmeticProgression = new ArithmeticProgression(0);
        assertEquals(arithmeticProgression.getCurrent(), 0);
    }

    @Test
    void setArithmeticProgression_canIncrementCurrentValue(){
        arithmeticProgression = new ArithmeticProgression(2, 1);
        arithmeticProgression.advance();
        assertEquals(arithmeticProgression.getCurrent(), 3);
        arithmeticProgression.advance();
        assertEquals(arithmeticProgression.getCurrent(), 5);
    }

    @Test
    void geometricProgression_canGetCurrentValue(){
        assertEquals(geometricProgression.getCurrent(), 1);
    }

    @Test
    void geometricProgression_canSetStartValueAtThePointOfCreation(){
        geometricProgression = new GeometricProgression(2, 2);
        assertEquals(geometricProgression.getCurrent(), 2);
    }

    @Test
    void geometricProgression_canGetBaseValueAtThePointOfCreation(){
        geometricProgression = new GeometricProgression(2);
        assertEquals(geometricProgression.getBase(), 2);
    }


    @Test
    void setGeometricProgression_canIncrementCurrentValue(){
        geometricProgression = new GeometricProgression(2, 1);
        geometricProgression.advance();
        assertEquals(geometricProgression.getCurrent(), 2);
        geometricProgression.advance();
        assertEquals(geometricProgression.getCurrent(), 4);
    }

    @Test
    void fibonacci_canGetPrevAfterObjectConstructor(){
       assertEquals(1,  fibonacci.getPrevious());
    }


    @Test
    void fibonacciProgression_canIncrementCurrentValue(){
        fibonacci = new Fibonacci(1, 2);
        fibonacci.advance();
        assertEquals(fibonacci.getPrevNum(), 2);
        assertEquals(fibonacci.getCurrent(), 3);

        fibonacci.advance();
        assertEquals(fibonacci.getPrevNum(), 3);
        assertEquals(fibonacci.getCurrent(), 5);
    }
}