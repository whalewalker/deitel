package Java.com.javaChapter6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExponentiationTest {
    @Test
    void testIfExponentialOfANumberCanBeGenerated(){
        int base = 3;
        int exponent = 4;

        Exponentiation indices = new Exponentiation();
       int actual =  indices.generateExponential(base, exponent);

       assertEquals(81, actual);
    }
}