package Java.com.javaChapter2;

import java.util.Scanner;

public class WorldPopulationGrowthCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter current year : ");
        int userInput = input.nextInt();
        System.out.print("Enter a digit to show you the population in advance: ");
        long userInput2 = input.nextInt() ;
        long worldPopulation = 7800000000L;
        double futurePop = userInput * worldPopulation * 0.011;

        System.out.println("Current world population: " + worldPopulation);
        System.out.printf("%d years population is : %.2f", userInput2, futurePop);
    }
}
