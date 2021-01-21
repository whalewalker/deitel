package Java.com.javaChapter7.dice_rolling;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiceRollingTest {
    DiceRolling newDice = new DiceRolling();
    @BeforeEach
    void setUp() {
        newDice = new DiceRolling();
    }

    @AfterEach
    void tearDown() {
        newDice = null;
    }



    @Test
    void checkIfRandomNumberIsBetweenOneToSix(){
        int random = newDice.generateRandomValue();
        boolean itExit = newDice.RandomNumberIsBetweenOneToSix(random);
        assertTrue(itExit);
    }

    @Test
    void checkIfFirstDiceCanBeCollected(){
        int random = newDice.getFirstDice();
        boolean itExit = newDice.RandomNumberIsBetweenOneToSix(random);
        assertTrue(itExit);
    }

    @Test
    void checkIfSecondDiceCanBeCollected(){
        int random = newDice.getSecondDice();
        boolean itExit = newDice.RandomNumberIsBetweenOneToSix(random);
        assertTrue(itExit);
    }

    @Test
    void testIfColumnNumberCanBeCollect(){
        int firstDice = newDice.getFirstDice();
        int column = newDice.getColumnNumber(firstDice);
        boolean onColumn  = newDice.RandomNumberIsBetweenZeroToSixtyFive(column);
        assertTrue(onColumn);
    }

    @Test
    void checkTotalCombinationOfRollingDice(){
        int [] diceArr = newDice.CombinationOfRollingDice();
        boolean checkArrLength = newDice.RandomNumberIsBetweenZeroToSixtyFive(diceArr);
        assertTrue(checkArrLength);
    }
}