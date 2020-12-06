package com.chapter7;

import Java.com.javaChapter7.MyArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MyArrayListTest {
    MyArrayList array;
    @BeforeEach
    void setUp() {
        array = new MyArrayList();
    }

    @AfterEach
    void tearDown() {
        array = null;
    }

    @Test
    void CheckForTheSumOFElementInAnArray(){
        int[] studentGrade = {1, 2, 3, 4, 9, 4};
        int sum = array.sumArrayElement(studentGrade);

        assertEquals(23, sum);
    }
    @Test
    void TestForTheAverageOfArr(){
        int [] newArr = {3,6,1,3,3};
        double average = array.averageArray(newArr);
        assertEquals(average, 3.2);
    }

    @Test
    void testIfIndexOfArrayCanBeRemove(){
        int [] newArr = {3,6,1,7,9};
        int[] output = array.removeItemInArray(newArr, 4);
        int [] test ={3,6,1,7};
        assertEquals(Arrays.toString(output), Arrays.toString(test));
    }



    @Test
    void testForTheMinimumArrayOfIntegers(){
        int [] newArr = {3,6,1,0,-4};
        int minimum = array.getMinimumFromArr(newArr);
        assertEquals(minimum, -4);
    }

    @Test
    void testForTheMaximumArrayOfIntegers(){
        int [] newArr = {3,6,7,3,3};
        int maximum = array.getMaximumFromArr(newArr);
        assertEquals(maximum, 7);
    }

    @Test
    void testIfArrayIsInAscendingOrder(){
        int [] newArr = {3,6,7,3,3};
        array.sortArray(newArr);
        int [] testingArray = {3, 3, 3, 6, 7};
        assertEquals(Arrays.toString(newArr), Arrays.toString(testingArray));
    }

    @Test
    void testIfArrayIsSortedUsingInsert(){
        int [] newArr = {3,6,7,3,3};
        array.insertArray(newArr);
        int [] testingArray = {3, 3, 3, 6, 7};
        assertEquals(Arrays.toString(newArr), Arrays.toString(testingArray));
    }

    @Test
    void testForMaximumCumulativeSumOfElementInArray(){
        int [] newArr = {1, 2, 3, 2};
        int maxCumulativeSum = array.MaximumCumulativeSumOfElementInArray(newArr);
        assertEquals(7, maxCumulativeSum);
    }

    @Test
    void testForMinimumCumulativeSumOfElementInArray(){
        int [] newArr = {1, 2, 3, 1, 0};
        int minCumulativeSum = array.MinimumCumulativeSumOfElementInArray(newArr);
        assertEquals(4, minCumulativeSum);
    }
}