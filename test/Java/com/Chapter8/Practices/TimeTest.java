package Java.com.Chapter8.Practices;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {
    Time newTime;

    @BeforeEach
    void setUp() {
        newTime = new Time();
    }

    @AfterEach
    void tearDown() {
        newTime = null;
    }

    @Test
    void testIfTimeCanBeCreatedAtThePointOfEntry() {
       newTime.setTime(12, 45, 19);
        assertEquals("12:45:19", newTime.toUniversalString());
    }

    @Test
    void testIfStandardTimeCanBeCalculatedAfterObjectConstruction(){
        newTime.setTime(12, 45, 19);
        assertEquals("12:45:19 PM", newTime.toString());
    }

    @Test
    void testIfRealWorldTimeCanBeCalculated(){
        LocalTime time = LocalTime.now();
        int hour = (time.getHour() == 12 || time.getHour() == 0) ? 12 : time.getHour() % 12;
        int min = time.getMinute();
        int sec = time.getSecond();
        String meridian = time.getHour() < 12 ? "AM" : "PM";
        assertEquals(String.format("%d:%d:%d %s", hour, min, sec, meridian), newTime.realTime());
    }
}