package Java.com.Mathematics;

import java.util.Scanner;

public class CollatzConjecture {
    public void calculateCollatz(int value) {
        if (value == 0 || value == -(value)) {
            System.out.println("Enter valid number!");
        }
        getOddNumber(value, 0);
    }

    public int getOddNumber(int value, int count) {
        int reminder = 0;
        int output = 0;
        while (value % 2 == 1) {
            reminder = value * 3 + 1;
            if (reminder == 1) {
                output = reminder;
                break;
            }
            count++;
            value = reminder;
        }
        if(value != 1){
            getEvenNumber(value, count);
        }

        return output;
    }

    public int getEvenNumber(int value, int count){
        int reminder = 0;
        int output = 0;

        while (value % 2 == 0) {
            reminder = value / 2;
            if (reminder == 1) {
                output = reminder;
                value = reminder;
                break;
            }
            count++;
            value = reminder;
        }
        if(value != 1){
            getOddNumber(value, count);
        }

//        System.out.println(count);
        System.out.println(output);
        return output;
    }

//
//    public static void main(String[] args) {
////        CollatzConjecture myNumber = new CollatzConjecture();
////        myNumber.calculateCollatz(6);
//    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        String s = scan.next().toString();
        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
