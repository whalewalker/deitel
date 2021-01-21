package Java.com.crap;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.security.SecureRandom;

import static org.junit.jupiter.api.Assertions.*;

class CrapTest {
    Crap myCrap;

    @BeforeEach
    void setUp() {
        myCrap = new Crap();
    }

    @AfterEach
    void tearDown() {
        myCrap = null;
    }

    @Test
    void testIfRandomNumberCanBeDetected(){
        SecureRandom random = new SecureRandom();
        int randomValue = 1 + random.nextInt(6);
        boolean onRange = myCrap.checkRandomNumber(randomValue);
        assertTrue(onRange);
    }

    @Test
    void testIfRandomNumberCanBeGeneratedBetweenOneAndSix() {
        int random = myCrap.generateRandomNumber();
        boolean onRange = myCrap.checkRandomNumber(random);
        assertTrue(onRange);
    }

    @Test
    void testIfSumOfRandomNumberCanBeDetected(){
        SecureRandom random = new SecureRandom();
        int random1 = 1 + random.nextInt(6);
        int random2 = 1 + random.nextInt(6);
        int sum = random1 + random2;

        boolean isCorrect = myCrap.checkSum(sum);
        assertTrue(isCorrect);
    }

    @Test
    void checkIfSumOfRandomNumberDoesNotExceedTwelve(){
        int sum = myCrap.getSum();
        boolean isCorrect = myCrap.checkSum(sum);
        assertTrue(isCorrect);
    }

    @Test
    void checkIfUserWinOrLose(){
        boolean win = myCrap.checkIfWonOrLose(Status.WIN);
    }

}