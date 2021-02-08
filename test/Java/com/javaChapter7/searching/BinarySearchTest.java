package Java.com.javaChapter7.searching;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {
    @Test
    void testIfAValueExistInArray(){
        int value = 5;
        int[] arr = {2, 4, 6, 7, 8,9, 5};
        Arrays.sort(arr);
        int position = Arrays.binarySearch(arr, value);

        assertEquals(2, position);

        int[] list1 = {2, 4, 7, 10};
        int[] list2 = {2, 4, 7, 7, 7, 10};
        java.util.Arrays.fill(list1, 5); // Fill 5 to the whole array
        java.util.Arrays.fill(list2, 1, 5, 8);

        System.out.println(Arrays.toString(list1));
        System.out.println(Arrays.toString(list2));

    }
}