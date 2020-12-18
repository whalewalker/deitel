package Java.com.javaChapter6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreatestCommonDivisorTest {
    @Test
    void checkForMinimumNumberOfTwoInteger(){
        int value_1 = 270;
        int value_2 = 192;

        int expected = 192;
        int actual = GreatestCommonDivisor.calculateMinimum(value_1, value_2);

        assertEquals(expected, actual);
    }

    @Test
    void checkForMaximumNumberOfTwoInteger(){
        int value_1 = 270;
        int value_2 = 192;

        int expected = 270;
        int actual = GreatestCommonDivisor.calculateMaximum(value_1, value_2);

        assertEquals(expected, actual);
    }

    @Test
    void testIfGreatestCommonDivisorCanBeKnownBetweenTwoInteger(){
        int value_1 = 21;
        int value_2 = 19;

        int expected = 6;
        int actual = GreatestCommonDivisor.calculateGreatestCommonDivisor(value_1, value_2);

        assertEquals(expected, actual);
    }
}