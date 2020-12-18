package Java.com.javaChapter6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoundingNumbersTest {

    @Test
    void testIfNumberCanRoundToTheirNearestValue(){
        double value = 3.4;

        RoundingNumbers myNumber = new RoundingNumbers();
        double actual = myNumber.roundValue(value);

        assertEquals(3, actual);
    }

    @Test
    void testIfNumberCanBeRoundToASpecificDecimalPlace(){
        double value = 3.4;
        int decimalPlace = 2;
        RoundingNumbers myNumber = new RoundingNumbers();
        double actual = myNumber.roundToSpecificDecimal(value, decimalPlace);

        assertEquals(0.34, actual);
    }

    @Test
    void checkerForDecimalPlace(){
        int decimalPlace = 2;
        long expected = 100;

        RoundingNumbers myNumber = new RoundingNumbers();
        double actual = RoundingNumbers.getDecimalPlace(decimalPlace);
        assertEquals(expected, actual);
    }
}