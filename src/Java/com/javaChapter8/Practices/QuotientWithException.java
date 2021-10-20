package Java.com.javaChapter8.Practices;

import java.util.Scanner;

public class QuotientWithException {
    public static int quotient(int value1, int value2) throws ArithmeticException{
        if(value2 == 0){
            throw new ArithmeticException("Divisor cannot be zero!");
        }
        return value1 / value2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two integers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        try {
            int result = quotient(number1, number2);
            System.out.println(number1 + " / " + number2 + " is" + result);
        }catch (ArithmeticException exception){
            System.err.println(exception.getMessage());
        }
        System.out.println("Execution continue");
//
//                for (int i = 0; i < 2; i++) {
//                    System.out.print(i + " ");
//                    try {
//                        System.out.println(1 / 0);
//                    }
//                    catch (Exception ex) {
//                    }
//                }

//        try {
//            for (int i = 0; i < 2; i++) {
//                System.out.print(i + " ");
//                System.out.println(1 / 0);
//            }
//        }
//        catch (Exception ex) {
//        }

    }
}
