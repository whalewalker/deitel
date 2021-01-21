package Java.com.javaChapter7.argument_list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VariableArgumentListTest {

    @Test
    void testIfProductOfDifferentValueCanBeCalculated(){
        double product = VariableArgumentList.product(2, 3, 5, 6);
        assertEquals(180, product);
    }

    @Test
    void testIfSumOfDifferenceValuesCanBeCalculated(){
        double sum = VariableArgumentList.sum(2, 3, 5, 6);
        assertEquals(16, sum);
    }

}