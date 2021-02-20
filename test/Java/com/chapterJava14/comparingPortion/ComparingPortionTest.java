package Java.com.chapterJava14.comparingPortion;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComparingPortionTest {
    ComparingPortion sentence;

    @BeforeEach
    void setUp() {
        sentence = new ComparingPortion();
    }

    @AfterEach
    void tearDown() {
        sentence = null;
    }

    @Test
    void testIfTwoStringAreEqualWithoutCaseSensitive(){
        String str1 = "Hello World";
        String str2 = "Am good and you";

        boolean isEqual = sentence.compareStringPortion(str1, str2);
        assertFalse(isEqual);
    }

}