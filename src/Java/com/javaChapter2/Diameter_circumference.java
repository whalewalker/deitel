package Java.com.javaChapter2;

import java.util.Scanner;

public class Diameter_circumference {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Hello, dear\nEasy way to calculate area, diameter, circumference. just enter your radius value");

        System.out.print("Enter radius value : ");
        int radius = input.nextInt();
        final double PIE = 3.14159;

        double diameter = 2 * radius;
        System.out.printf("%.2fcm, is the diameter of radius %dcm%n", diameter, radius);

        double circumference = 2 * PIE * radius;
        System.out.printf("%.2fcm, is the circumference of radius %dcm%n", circumference, radius);

        double area = 2 * radius;
        System.out.printf("%.2fcm, is the area of radius %dcm", area, radius);

    }
}
