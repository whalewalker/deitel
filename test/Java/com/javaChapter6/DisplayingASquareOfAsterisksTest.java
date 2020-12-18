package Java.com.javaChapter6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DisplayingASquareOfAsterisksTest {

    @Test
    void testIfAsteriskCanBeGenerated(){
        String fillChar = "*";
        int side = 4;
        String expected = "****\n****\n****\n****\n";

         String actual = DisplayingASquareOfAsterisks.generateAsterisk(fillChar, side);

        assertEquals(expected, actual);
    }

}