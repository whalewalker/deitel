package Java.com.javaChapter2;

import java.util.Scanner;

public class Arithmetics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        System.out.print("Enter first value : ");
//        int firstInput = input.nextInt();
//
//        System.out.print("Enter second value : ");
//        int secondInput = input.nextInt();
//
//        int sum = firstInput + secondInput;
//        int product = firstInput * secondInput;
//        int difference = firstInput - secondInput;
//        double quotient = (firstInput / secondInput);
//        int reminder = firstInput % secondInput;
//
//
//        System.out.printf("The addition of %d and %d is %d%n", firstInput, secondInput, sum);
//        System.out.printf("The product of %d and %d is %d%n", firstInput, secondInput, product);
//        System.out.printf("The difference of %d and %d is %d%n", firstInput, secondInput, difference);
//        System.out.printf("The quotient of %d and %d is %.2f%n", firstInput, secondInput, quotient);
//        System.out.printf("The quotient of %d and %d is %d%n", firstInput, secondInput, reminder);
        System.out.print("Enter counter : ");
        int counter = input.nextInt();


        if (counter > 0) {
            int count = 1;
            System.out.print("\nEnter value 1 : ");
            int result = input.nextInt();

            while(count < counter){
                System.out.printf("\nEnter value %d : ", count+1);
                int temp = input.nextInt();
                if(temp < result){
                    result = temp;
                }

                count++;
            }
            System.out.printf("Smallest number : %d ", result);
        }





    }
}
