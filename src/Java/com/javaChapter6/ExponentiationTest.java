package Java.com.javaChapter6;

import java.util.Scanner;

public class ExponentiationTest {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

        System.out.print("Enter base : ");
        int base = input.nextInt();

        System.out.print("Enter exponent : ");
        int exponent = input.nextInt();

            int result =  Exponentiation.generateExponential(base, exponent);
            System.out.printf("Indices of base %d and exponent %d = %d", base, exponent, result);


    }
}
