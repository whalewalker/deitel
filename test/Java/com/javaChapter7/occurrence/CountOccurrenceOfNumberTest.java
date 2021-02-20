package Java.com.javaChapter7.occurrence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountOccurrenceOfNumberTest {
    @Test
    void checkIfElementExistMoreThanOnce(){
        int[] numbers = {5, 6, 8, 3, 5, 6, 6, 3, 2};
        int occur = CountOccurrenceOfNumber.checkOccurrence(6, numbers);
        assertEquals(3, occur);
    }

    @Test
    void checkIfElementThatExitInArrayCanBeTrack(){
        int[] numbers = {5, 6, 8, 3, 5, 6, 6, 3, 2};
        assertNotNull(CountOccurrenceOfNumber.countOccurrence(numbers));
    }

    @Test
    void checkIfItemCanBeDisplay(){
        int[] numbers = {5, 6, 8, 3, 5, 6, 6, 3, 2};
        String occurrence = CountOccurrenceOfNumber.displayOccurrence(numbers);

        assertNotNull(occurrence);
    }
}