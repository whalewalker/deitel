package Java.com.javaChapter7.searching;

import java.util.ArrayList;

public class BinarySearch {
    public static int search(int value, int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        while (high >= low){
            int mid = (low + high) / 2;
            if(value < arr[mid]){
                high = mid - 1;
            }else if(value == arr[mid]){
                return mid;
            }else {
                low = mid + 1;
            }
        }
        return -low - 1;
    }

}
