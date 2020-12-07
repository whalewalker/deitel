package Java.com.javaChapter5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TheTwelveDaysOfChristmasTest {
    TheTwelveDaysOfChristmas mySong;
    @BeforeEach
    void setUp() {
        mySong = new TheTwelveDaysOfChristmas();
    }

    @AfterEach
    void tearDown() {
        mySong = null;
    }

    @Test
    void TestIfDayIsGenerated(){
        int dayNumber = 3;
        String dayValue = mySong.generateDays(dayNumber);
        assertEquals(dayValue, "fourth");
    }
}