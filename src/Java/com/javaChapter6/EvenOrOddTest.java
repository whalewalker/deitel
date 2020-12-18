package Java.com.javaChapter6;

import java.util.Scanner;

public class EvenOrOddTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Even or odd detector!\n");
        int count = 1;
        while (true){
            System.out.print("Enter any random even or odd number : ");

            int userInput = scanner.nextInt();
            String isOddOrEven = EvenOrOdd.checkForEvenOrOdd(userInput) ? "even" : "odd";
            System.out.printf("%d is an %s number\n\n", userInput, isOddOrEven);
        }
    }
}
