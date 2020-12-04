package Java.com.javaChapter2;

import java.util.Scanner;

public class CarPoolSavingCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print ("Enter Total Miles Driven Per Day: ");
        int totalMileDrivenPerDay = input.nextInt();
        System.out.print ("Enter Cost Per Gallon Of Gasoline: ");
        int costPerGallonOfGasoline = input.nextInt();
        System.out.print ("Enter Average Miles Per Gallon: ");
        int averageMilesPerDay = input.nextInt();
        System.out.print ("Enter Parking Fees Per Day: ");
        int parkingFeesPerDay = input.nextInt();
        System.out.print ("Enter Tolls Per Day: ");
        int tollsPerDay = input.nextInt();

        int dailyDriving = ((totalMileDrivenPerDay/averageMilesPerDay) * costPerGallonOfGasoline + parkingFeesPerDay + tollsPerDay);

        System.out.println();
        System.out.printf ("Your Daily Driving Cost Is: %d\n", dailyDriving);

    }
}
