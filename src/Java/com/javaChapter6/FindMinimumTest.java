package Java.com.javaChapter6;

import java.util.Scanner;

public class FindMinimumTest {
    public static void main(String[] args) {
        System.out.println("Find the Minimum of Three Value Game!");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first value : ");
        float value1, value2, value3;
        value1 = input.nextFloat();

        System.out.print("Enter your second value : ");
        value2 = input.nextFloat();

        System.out.print("Enter your third value : ");
        value3 = input.nextFloat();

        float output = FindTheMinimum.getMinimum(value1, value2, value3);
        System.out.printf("The minimum number between %.1f, %.1f, %.1f = %.1f", value1, value2, value3, output);
    }
}
