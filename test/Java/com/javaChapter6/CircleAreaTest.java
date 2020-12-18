package Java.com.javaChapter6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleAreaTest {

    @Test
    void checkIfAreaOfACircleCanBeCalculated() {
        int radius = 7;
        double area = 153.94;

        double expected = CircleArea.calculateArea(radius);
        assertEquals(area, expected);
    }
}