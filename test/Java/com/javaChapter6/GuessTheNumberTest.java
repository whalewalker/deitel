package Java.com.javaChapter6;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuessTheNumberTest {
    GuessTheNumber myPuzzle;
    @BeforeEach
    void setUp() {
        myPuzzle = new GuessTheNumber();
    }

    @AfterEach
    void tearDown() {
        myPuzzle = null;
    }

    @Test
    void testForIfRandomNumberCanBeGenerated(){
        myPuzzle.randomNumber();
        int firstNumber = myPuzzle.getRandomValue();
        int secondNumber = myPuzzle.getRandomValue();

        assertTrue(firstNumber != secondNumber);
    }
}