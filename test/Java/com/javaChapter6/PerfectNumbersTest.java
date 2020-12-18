package Java.com.javaChapter6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PerfectNumbersTest {
    @Test
    void testIfAPerfectNumberCanBeKnown(){
        int number = 6;

        boolean actual = PerfectNumbers.isPerfect(number);
        PerfectNumbers.loopThrough();
        assertEquals(true, actual);
    }

}