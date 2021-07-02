package Java.com.javaChapter3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateTest {

    Date date = new Date(2, 7, 2021);

    @Test
    @DisplayName("Check if date can be display in / format")
    void displayDate() {
        assertEquals("2/7/2021", date.displayDate());
    }
}