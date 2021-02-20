package Java.com.chapterJava14.comparingString;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComparingStringTest {
    @Test
    void testIfTwoStringAreEqual(){
        String val1 = "Hello";
        String val2 = "Hello";

        String output = ComparingString.checkEqual(val1, val2);
        assertEquals("equal to", output);
    }

    @Test
    void testIfTwoStringAreGreater(){
        String val1 = "Brother i have a surprise for you";
        String val2 = "Did you eat last night";

        String newVal1 = ComparingString.getFirstWord(val1);
        String newVal2  =  ComparingString.getFirstWord(val2);

            String output = ComparingString.checkGreater(newVal1, newVal2);
        assertEquals("greater than", output);
    }

    @Test
    void testIfTwoStringAreLesser(){
        String val1 = "Pale";
        String val2 = "Sweet";

        String output = ComparingString.checkLesser(val1, val2);
        assertEquals("lesser than", output);
    }

    @Test
    void testIfFirstWordInASentenceCanBeReturn(){
        String sentences = "Please bro, am broke";
        String firstWord = ComparingString.getFirstWord(sentences);
        assertEquals("Please", firstWord);
    }
}