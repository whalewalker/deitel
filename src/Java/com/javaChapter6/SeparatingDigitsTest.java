package Java.com.javaChapter6;

import java.util.Scanner;

public class SeparatingDigitsTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Separating Digit Game!\n");

        int count = 1;
        while (count != 0){
            System.out.print("Enter any random number : ");
            int userInput = scan.nextInt();

            String result = SeparatingDigits.displayDigits(userInput);
            System.out.printf("Wow!, the value you put in have been separated to %s%n%n", result);
        }

    }
}
