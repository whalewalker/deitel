package Java.com.javaChapter6;

import java.util.Scanner;

public class CircleAreaTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Chart generator!");

        int count = 1;
        while (count != -1){

            System.out.print("Enter radius of circle (in cm) : ");
            int radius = input.nextInt();


            double result = CircleArea.calculateArea(radius);
            System.out.printf("The area of a circle at radius %d = %.2fcm%n%n", radius, result);

        }
    }
}
