package Java.com.javaChapter6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeparatingDigitsTest {
    @Test
    void testIfTheQuotientOfANumberCanBeKnown() {
        int value = 4593;
        int expected = 459;
        int actual = SeparatingDigits.quotientOfNumber(value);

        assertEquals(expected, actual);
    }

    @Test
    void testIfTheReminderOfANumberCanBeKnown() {
        int value = 4593;
        int expected = 3;
        int actual = SeparatingDigits.reminderOfNumber(value);

        assertEquals(expected, actual);
    }


    @Test
    void checkIfDigitsCanBeDisplay() {
        int value = 4593;
        String expected = 4 + "  " + 5 + "  " + 9 + "  " + 3 + "  ";

        String actual = SeparatingDigits.displayDigits(value);
        assertEquals(expected, actual);
    }

    @Test
    void checkIfDigitsDigitCanBeReverse(){
        int value = 4593;
        int expected = 3954;

        int actual = SeparatingDigits.reverseDigit(value);
        assertEquals(expected, actual);
    }
}