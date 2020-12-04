package Java.com.javaChapter2;

import java.util.Scanner;

public class NegativePositiveAndZeroValues {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number from 0 to 10 : ");
        int inputValue = input.nextInt();

        if(inputValue == -inputValue){
            System.out.println("Number is negative");
        }else if(inputValue == inputValue){
            System.out.println("Number is positive");
        }else{
            System.out.println("Number is zero");
        }
    }
}
