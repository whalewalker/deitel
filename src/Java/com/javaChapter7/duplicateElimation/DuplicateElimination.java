package Java.com.javaChapter7.duplicateElimation;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateElimination {

    public static boolean isExit(int[] arr, int element) {
        for(int value : arr){
            if(value == element){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
           Scanner scan = new Scanner(System.in);
        int[] myArr = new int[5];
        int userValue;

        for(int value = 0; value < myArr.length; value++){
            System.out.print("Enter value between 1 to 100: ");
            userValue = scan.nextInt();
            if(!isExit(myArr, userValue)){
                myArr[value] = userValue;
            }else{
                System.out.printf("Number %d Already exit!%n", userValue);
            }

            for(int count = 0; count < myArr.length; count++){
                if(myArr[count] != 0){
                    System.out.println(myArr[count]);
                }
            }
        }

    }
}
