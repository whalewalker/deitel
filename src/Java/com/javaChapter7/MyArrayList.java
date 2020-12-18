package Java.com.javaChapter7;

import java.util.Arrays;

public class MyArrayList {

    public int sumArrayElement(int[] myArr) {
        int sum = 0;
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
            if(minimum == 0){
                minimum = newArr[counter];
            }else {
                if (newArr[counter] < minimum) {
                    minimum = newArr[counter];
                }
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

    public void arrangeArray(int[] arr, int arrElement0, int arrElement1) {
        if (arr[arrElement0] > arr[arrElement1]) {
            int storeArrayElement = arr[arrElement1];
            arr[arrElement1] = arr[arrElement0];
            arr[arrElement0] = storeArrayElement;
        }
    }

    public void   insertArray(int[] newArr) {
        for (int count = 1; count < newArr.length; count++){
            int current = newArr[count];
            int j = count - 1;
            while (j >= 0 && newArr[j] > current){
                newArr[j + 1] = newArr[j];
                j--;
            }
            newArr[j + 1] = current;
        }
    }

    public int[] removeItemInArray(int[] arr, int index){
        if(arr == null || index < 0 || index >= arr.length)
            return arr;

        int [] newArray = new int[arr.length - 1];
        for(int counter = 0, indexValue = 0; counter < arr.length; counter++){
            if(counter == index){
                continue;
            }
            newArray[indexValue++] = arr[counter];
        }
        return newArray;
    }

    public int MaximumCumulativeSumOfElementInArray(int[] newArr) {
        int maxCount = 0;
        for (int counter = 0;  counter < newArr.length; counter++){
            int[] returnedArr = removeItemInArray(newArr, counter);
            int sum = sumArrayElement(returnedArr);
            if (sum > maxCount){
                maxCount = sum;
            }
        }
        return maxCount;
    }

    public int MinimumCumulativeSumOfElementInArray(int[] newArr) {
        int minCount = 0;
        for (int counter = 0;  counter < newArr.length; counter++){
            int[] returnedArr =  removeItemInArray(newArr, counter);
            int sum = sumArrayElement(returnedArr);
            if (minCount == 0){
                minCount = sum;
            }
            else {
                if (sum < minCount) {
                    minCount = sum;
                }
            }
        }
        return minCount;
    }

    public int[] MaxMinCumulativeSumOfElementInArray(int[] newArr) {
        int [] maxMinCumulativeSum = new int[2];
        int sum = sumArrayElement(newArr);
        int min = getMinimumFromArr(newArr);
        int max = getMaximumFromArr(newArr);
        int maxSum = sum - min;
        int minSum = sum - max;
        maxMinCumulativeSum[0] =  minSum;
        maxMinCumulativeSum[1] = maxSum;
        return maxMinCumulativeSum;
    }

    public int findGiveNumber(int value, int[] arr){
        int output = 0;
        int [] sortedArr = sortArray(arr);
        for (int counter = 0; counter < sortedArr.length; counter++){
            if(sortedArr[counter] == value){
                output = sortedArr[counter];
                System.out.println(value);
            }
        }
        return output;
    }


    public static void main(String[] args) {
        int [] number = {7, 4, 1,7,3};
        MyArrayList array = new MyArrayList();
        int [] output = array.sortArray(number);
        System.out.println(Arrays.toString(output));
    }


}
