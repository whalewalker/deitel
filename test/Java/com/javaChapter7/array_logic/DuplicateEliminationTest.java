package Java.com.javaChapter7.array_logic;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class DuplicateEliminationTest {
    @Test
    void testIfValueCanBeSet(){
        int [] values = {3, 4, 5, 6, 8};
        DuplicateElimination.setValues(values);
        int[] actual = DuplicateElimination.getValues();
        assertEquals(Arrays.toString(values), Arrays.toString(actual));
    }

    @Test
    void testIfValueIsNotFiveDigit(){
        int [] values = {3, 4, 5, 6, 99};
        DuplicateElimination.setValues(values);
        int[] actual = DuplicateElimination.getValues();
        assertEquals(Arrays.toString(values), Arrays.toString(actual));
    }


}