package Java.com.javaChapter6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplesTest {
    @Test
    void checkIfAMultipleNumberCanBeKnown(){
        int value = 27;
        int multiple = 9;

      boolean isMultiple = Multiples.isItMultiple(value, multiple);
      assertEquals(true, isMultiple);
    }
}