package Java.com.javaChapter2;

import java.util.Scanner;

public class SeparatingDigitInInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter five digit number : ");
        int inputValue = input.nextInt();

        int length = String.valueOf(inputValue).length();
        if(length == 5){
            int firstVal = inputValue % 10;
            int temp = inputValue / 10;
           int secVal = temp % 10;
           temp = inputValue /100;
            int thirdVal = temp % 10;
            temp = inputValue /1000;
            int fouthVal = temp % 10;
            temp = inputValue /10000;
            int fifthVal = temp % 10;
            System.out.println(fifthVal + "   " + fouthVal + "   " + thirdVal + "   " + secVal + "   " + firstVal);
        }else{
            System.out.println("Enter five digit number ");
        }
    }
}
