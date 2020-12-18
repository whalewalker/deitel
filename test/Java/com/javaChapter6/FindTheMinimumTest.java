package Java.com.javaChapter6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindTheMinimumTest {
    @Test
    void testIfMinimumNumberCanBeKnownBetweenThreeNumber(){
        float value1 = 5, value2 = 4, value3 = 6;
        float expected = 4;
        float actual = FindTheMinimum.getMinimum(value1, value2, value3);

        assertEquals(expected, actual);
    }
}