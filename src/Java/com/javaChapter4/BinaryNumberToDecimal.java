package Java.com.javaChapter4;

import java.util.Scanner;

public class BinaryNumberToDecimal {
    Scanner userInput = new Scanner(System.in);
    long anyNumber;
    int base;
    public static void main(String[] args) {
        BinaryNumberToDecimal newBinary = new BinaryNumberToDecimal();

    }

    public boolean checkAnyNumber(){
        System.out.print("Enter base you current want to convert : ");
        base = userInput.nextInt();
        System.out.print("Enter a values of base : ");
        anyNumber = userInput.nextLong();

        long number = anyNumber;
        while (number > 0){
            if(number % 10 > base - 1){
                return false;
            }
            number = number / 10;
        }
        return true;
    }

    public  int convertAnyBinaryToBaseTen(int anyNumber) {
        if (checkAnyNumber() && base <= 10) {
            int reminder;
            int power = 0;
            int decimalValue = 0;
            int rev;
            long original = anyNumber;
            while (anyNumber != 0) {
                reminder = (int) (anyNumber % 10);
                rev = (int) (Math.pow(base, power++)) * reminder + decimalValue;
                decimalValue = rev;
                anyNumber = anyNumber / 10;
            }
            return decimalValue;
        }
        return 0;
    }

}

