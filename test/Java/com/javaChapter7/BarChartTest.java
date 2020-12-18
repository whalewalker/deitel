package Java.com.javaChapter7;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BarChartTest {
        BarChart myChart;
    @BeforeEach
    void setUp() {
        myChart = new BarChart();
    }

    @AfterEach
    void tearDown() {
        myChart = null;
    }

    @Test
    void testIfBarChartCanBePrinted(){
        int[] arr = {2, 4, 5, 6,};
        int outcome = myChart.generateBars(arr);
        assertEquals(30, outcome);
    }



}