package Java.com.javaChapter7.exercise.sales_commission;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SalesCommissionsTest {
    SalesCommissions saleOfMonth;
    @BeforeEach
    void setUp() {
        saleOfMonth = new SalesCommissions();
    }

    @AfterEach
    void tearDown() {
        saleOfMonth  = null;
    }

    @Test
    void checkIfUserCanSetGrossPayPerMonth(){
        double[] grossPay = {2499, 753, 2944, 5638};
        saleOfMonth.setGrossPay(grossPay);
        double[] actual = saleOfMonth.getGrossPay();
        assertEquals(Arrays.toString(grossPay), Arrays.toString(actual));
    }

    @Test
    void checkIfEarningCanBeCalculatedPerMonth(){
        double[] grossPay = {2499, 753, 2944, 5638};
        saleOfMonth.setGrossPay(grossPay);
       double[] earnArray = saleOfMonth.calculateEarn();
       double[]expected = {424.91, 267.77, 464.96, 707.42};
       assertEquals(Arrays.toString(expected), Arrays.toString(earnArray));
    }

    @Test
    void checkEarningPercentage(){
        double[] grossPay = {2499, 753, 2944, 5638};
        saleOfMonth.setGrossPay(grossPay);
        double[] earnArray = saleOfMonth.calculateEarn();
        double[] newValue = {424.91, 267.77, 464.96, 707.42};
        int[] frequency = saleOfMonth.outputBarChar(earnArray);
        int[] expected = {0, 0, 1, 0, 2, 0, 0, 1, 0, 0, 0};
        assertEquals(Arrays.toString(expected), Arrays.toString(frequency));
    }


}