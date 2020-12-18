package Java.com.javaChapter6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenOrOddTest {

    @Test
    void checkIfANumberIsEvenOrOdd(){
        int integer = 5;
        boolean actual = EvenOrOdd.checkForEvenOrOdd(integer);

        assertEquals(false, actual);
    }

}