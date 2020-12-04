package Java.com.javaChapter2;

import java.util.Scanner;

public class ComparingInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first value : ");
        int firstInput = input.nextInt();

        System.out.print("Enter second value : ");
        int secondInput = input.nextInt();


        if(firstInput == secondInput){
            System.out.println("These numbers are equals");
        }else{
            int largestVal = firstInput > secondInput ? firstInput : secondInput;
            System.out.printf("%d is the largest value", largestVal);
        }
    }
}
