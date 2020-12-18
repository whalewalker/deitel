package Java.com.javaChapter6;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TableOfBinaryTest {

    @Test
    void testIfNumberIsDecimal(){
        int decimal = 30;
         boolean isDecimal = TableOfBinary.checkDecimal(decimal);
        assertTrue(isDecimal);
    }


    @Test
    void testIfDecimalCanBeConvertedToBinary(){
        int decimal = 20;
        String binary = TableOfBinary.convertBinary(decimal);
        String  expected = "10100";
        assertEquals(expected, binary);
    }


    @Test
    void testIfDecimalCanBeConvertedToOctal(){
        int decimal = 20;
        String  octal = TableOfBinary.convertOctal(decimal);
        String expected = "24";
        assertEquals(expected, octal);
    }


    @Test
    void testIfDecimalCanBeConvertedToHexadecimal(){
        int decimal = 20;
        String hex = TableOfBinary.convertHexadecimal(decimal);
        String  expected = "14";
        assertEquals(expected, hex);
    }
}