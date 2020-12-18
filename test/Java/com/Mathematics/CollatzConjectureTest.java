package Java.com.Mathematics;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CollatzConjectureTest {
    CollatzConjecture myNumber;
    @BeforeEach
    void setUp() {
        myNumber = new CollatzConjecture();
    }

    @AfterEach
    void tearDown() {
        myNumber = null;
    }

    @Test
    void TestIfOddNumberCanBeGet(){
        int value = 5;
        int output = myNumber.getOddNumber(value, 0);
        assertEquals(1, output);
    }

    @Test
    void TestIfEvenNumberCanBeGet(){
        int value = 5;
        int output = myNumber.getEvenNumber(value, 0);
        assertEquals(1, output);
    }

}