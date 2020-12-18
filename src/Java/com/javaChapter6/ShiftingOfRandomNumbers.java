package Java.com.javaChapter6;

import java.security.SecureRandom;

public class ShiftingOfRandomNumbers {
    public static void main(String[] args) {
        SecureRandom randomNumbers = new SecureRandom();

        int numberA = 1 + randomNumbers.nextInt(2);
        System.out.printf("Value between %d and this %d = %d\n",1, 2, numberA);

        int numberB = 1 + randomNumbers.nextInt(100);
        System.out.printf("Value between %d and this %d = %d\n", 1, 100, numberB);

        int numberC = randomNumbers.nextInt(9);
        System.out.printf("Value between %d and this %d = %d\n", 0, 9, numberC);

        int numberD = 1000 + randomNumbers.nextInt(1112);
        System.out.printf("Value between %d and this %d = %d\n", 1000, 1112, numberD);

        int numberE = -1 + randomNumbers.nextInt(1);
        System.out.printf("Value between %d and this %d = %d\n", -1, 1, numberE);

        int numberF = -3 + randomNumbers.nextInt(11);
        System.out.printf("Value between %d and this %d = %d\n", -3, 11, numberF);


        int number1 = 2 + 2 * randomNumbers.nextInt( 5 );
        System.out.printf("Value between %d and this %d with a difference of %d = %d\n", 2, 10, 2, number1);

        int number2 = 3 + 2 * randomNumbers.nextInt( 5);
        System.out.printf("Value between %d and this %d with a difference of %d = %d\n", 3, 11, 2, number2);

        int number3 = 6 + 4 * randomNumbers.nextInt( 5 );
        System.out.printf("Value between %d and this %d with a difference of %d = %d", 6, 10, 4, number3);


    }
}
