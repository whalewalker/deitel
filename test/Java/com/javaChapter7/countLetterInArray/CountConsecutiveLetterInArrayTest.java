package Java.com.javaChapter7.countLetterInArray;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CountConsecutiveLetterInArrayTest {
    CountConsecutiveLetterInArray letter;
    @BeforeEach
    void setUp() {
        letter = new CountConsecutiveLetterInArray();
    }

    @AfterEach
    void tearDown() {
        letter = null;
    }

    @Test
    void letter_canOccurManyTimeInCharacterArray(){
        char[] characterArr = {'a', 'b', 'c', 'a', 'a'};
        int[] count = letter.characterCount(characterArr);
        int[] excepted = {2, 0, 2, 0, 1, 1, 1, 1};
        assertEquals(Arrays.toString(excepted), Arrays.toString(count)  );
    }
}