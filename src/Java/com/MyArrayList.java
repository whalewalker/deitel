package Java.com;

import java.util.ArrayList;
import java.util.Arrays;

public class MyArrayList {
    int sum = 0;

    public int sumArrayElement(int[] myArr) {
        for (int counter = 0; counter < myArr.length; counter++) {
            sum += myArr[counter];
        }
        return sum;
    }


    public double averageArray(int[] newArr) {
        return sumArrayElement(newArr) / (newArr.length * 1.0);
    }

    public int getMinimumFromArr(int[] newArr) {
        int minimum = 0;
        for (int counter = 0; counter < newArr.length; counter++) {
            if (newArr[counter] < minimum) {
                minimum = newArr[counter];
            }
        }

        return minimum;
    }

    public int getMaximumFromArr(int[] newArr) {
        int maximum = 0;
        for (int counter = 0; counter < newArr.length; counter++) {
            if (newArr[counter] > maximum) {
                maximum = newArr[counter];
            }
        }
        return maximum;
    }

    public int[] sortArray(int[] newArr) {

        for (int counter = 0; counter < newArr.length; counter++) {
            for (int i = 1; i < newArr.length; i++) {
                arrangeArray(newArr, i - 1, i);
            }
        }
        return newArr;
    }


    public void arrangeArray(int[] arr, int arrElement1, int arrElement2) {
        if (arr[arrElement1] > arr[arrElement2]) {
            int storeArrayElement = arr[arrElement2];
            arr[arrElement2] = arr[arrElement1];
            arr[arrElement1] = storeArrayElement;
        }
    }

    public int MaximumCumulativeSumOfElementInArray(int[] newArr) {
        int maximumNumber = 0;
        return maximumNumber;
    }

    public int MinimumCumulativeSumOfElementInArray(int[] newArr) {
        int minmumNumber = 0;

        return minmumNumber;
    }

    public static void main(String[] args) {
        MyArrayList newArray = new MyArrayList();
        int[] number = {3, 6, 7, 3, 3};

    }


}
