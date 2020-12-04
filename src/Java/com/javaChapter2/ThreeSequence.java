package Java.com.javaChapter2;

import java.util.Scanner;

public class ThreeSequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first value : ");
        int firstInput = input.nextInt();

        System.out.print("Enter second value : ");
        int secondInput = input.nextInt();

        System.out.print("Enter second value : ");
        int threeInput = input.nextInt();

        int sum = firstInput + secondInput + threeInput;
        System.out.printf("Sum : %d%n ", sum);

        int average = (firstInput + secondInput + threeInput)/3;
        System.out.printf("average : %d%n ", average);

        int product = firstInput * secondInput * threeInput;
        System.out.printf("product : %d%n ", product);

        int large = firstInput > secondInput ? firstInput : secondInput;
        int largest = threeInput > large ? threeInput : large;


        int small = firstInput < secondInput ? firstInput : secondInput;
        int smallest = threeInput < small ? threeInput : small;

        System.out.printf("Largest value : %d%n", largest);
        System.out.printf("Smallest value : %d", smallest);

    }
}
