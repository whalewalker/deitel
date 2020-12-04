package Java.com.javaChapter2;

import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first value : ");
        int firstInput = input.nextInt();

        System.out.print("Enter second value : ");
        int secondInput = input.nextInt();

        if(firstInput % secondInput == 0 && secondInput * secondInput == firstInput){
            System.out.printf("%d is the multiple of %d", secondInput, firstInput);
        }else{
            System.out.printf("%d is not a multiple of %d", secondInput, firstInput);
        }
    }
}
