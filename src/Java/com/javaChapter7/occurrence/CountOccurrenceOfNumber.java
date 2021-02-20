package Java.com.javaChapter7.occurrence;

import java.util.Objects;

public class CountOccurrenceOfNumber {
    public static int checkOccurrence(int value, int[] numbers) {
        int number = 0;
        for(int count = 0; count < numbers.length; count++){
            if(value == numbers[count]){
                number++;
            }
        }
        return number;
    }


    public static int[] countOccurrence(int[] numbers) {
       int[] occurrence = new int[100];
       for(int number : numbers){
           if(number > 100){
               return null;
           }else {
               occurrence[number]++;
           }
       }
       return occurrence;
    }

    public static String displayOccurrence(int[] numbers){
        int[] arr = countOccurrence(numbers);
        StringBuilder occurrence = new StringBuilder();
        for(int count = 0; count < Objects.requireNonNull(arr).length; count++){
            if(arr[count] == 0){
                continue;
            }else {
                occurrence.append(numbers[count]).append(" occurs ").append(arr[numbers[count]]).append(" times\n");
            }
        }
        return occurrence.toString();
    }

    public static void main(String[] args) {
        int[] numbers = {5, 6, 8, 3, 5, 6, 6, 3, 2};
        System.out.println(displayOccurrence(numbers));
    }
}
