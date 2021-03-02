package Java.com.javaChapter9.progression;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbstractProgressionTest {
    AbstractProgression abstractProgression;
    ArithmeticAbstractProgression arithmeticProgression;
    GeometricAbstractProgression geometricProgression;
    Fibonacci fibonacci;

    @BeforeEach
    void setUp() {
        arithmeticProgression = new ArithmeticAbstractProgression();
        geometricProgression = new GeometricAbstractProgression();
         fibonacci = new Fibonacci();
    }

    @AfterEach
    void tearDown() {
        abstractProgression = null;
        arithmeticProgression = null;
    }



    @Test
    void test_currentValueCanBeGetAfterConstruction(){
        assertEquals(abstractProgression.getCurrent(), 0);
    }

    @Test
    void test_currentValueCanBeSet(){
        abstractProgression.setCurrent(4L);
        assertEquals(abstractProgression.getCurrent(), 4);
    }

    @Test
    void Progression_canIncrementCurrentValue(){
        abstractProgression.setCurrent(4L);
        abstractProgression.advance();
        assertEquals(abstractProgression.getCurrent(), 5);
    }

    @Test
    void Progression_canGetPreviousProgressionByIncreasingTheCurrentValue(){
        abstractProgression.setCurrent(4L);
        assertEquals(abstractProgression.nextValue(), 4);
        assertEquals(abstractProgression.nextValue(), 5);
        assertEquals(abstractProgression.nextValue(), 6);
    }

    @Test
    void Progression_canPrintAllPossibleProgressionOfAGivenValue(){
        abstractProgression.setCurrent(4L);
        assertEquals("4,5,6,", abstractProgression.printProgression(3));
    }

    @Test
    void arithmeticProgression_canGetCurrentValue(){
        assertEquals(arithmeticProgression.getCurrent(), 1);
    }

    @Test
    void arithmeticProgression_canSetOneDefaultValueAtPointOfCreation(){
        arithmeticProgression = new ArithmeticAbstractProgression(0);
        assertEquals(arithmeticProgression.getCurrent(), 0);
    }

    @Test
    void setArithmeticProgression_canIncrementCurrentValue(){
        arithmeticProgression = new ArithmeticAbstractProgression(2, 1);
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
        geometricProgression = new GeometricAbstractProgression(2, 2);
        assertEquals(geometricProgression.getCurrent(), 2);
    }

    @Test
    void geometricProgression_canGetBaseValueAtThePointOfCreation(){
        geometricProgression = new GeometricAbstractProgression(2);
        assertEquals(geometricProgression.getBase(), 2);
    }


    @Test
    void setGeometricProgression_canIncrementCurrentValue(){
        geometricProgression = new GeometricAbstractProgression(2, 1);
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