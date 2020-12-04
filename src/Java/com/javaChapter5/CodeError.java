package Java.com.javaChapter5;

import java.util.Scanner;

public class CodeError {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            ++i;
            System.out.println(i);
        }

        for (double k = 0.1; k <= 1.0; k += 0.1) {
            System.out.println(k);
        }
        int n = 2;
        switch (n) {
            case 1:
                System.out.println("The number is 1");
            case 2:
                System.out.println("The number is 2");
                break;
            default:
                System.out.println("The number is not 1 or 2");
                break;
        }


        n = 1;
        while (n <= 10) {
            System.out.println(n++);
        }

        for (i = 1; i <= 20; i++) {
            System.out.println(i);

            if (i % 5 == 0) {
                System.out.println();
            } else {
                System.out.print('\t');
            }
        }

    }

    public static class BarChatPrintingProgram {


        public static void main(String[] args) {
            Scanner userInput = new Scanner(System.in);

            System.out.print("Enter user input : ");
            int input1 = userInput.nextInt();

            System.out.print("Enter user input : ");
            int input2 = userInput.nextInt();

            System.out.print("Enter user input : ");
            int input3 = userInput.nextInt();

            System.out.print("Enter user input : ");
            int input4 = userInput.nextInt();

            System.out.print("Enter user input : ");
            int input5 = userInput.nextInt();

            BarChatPrintingProgram myBar = new BarChatPrintingProgram();

            myBar.PrintAsterisk(input1);
            myBar.PrintAsterisk(input2);
            myBar.PrintAsterisk(input3);
            myBar.PrintAsterisk(input4);
            myBar.PrintAsterisk(input5);

        }

        public void PrintAsterisk(int input){
            int counter;
            if(input > 0 && input < 31){
                for (counter = 1; counter <= input; counter++){
                    System.out.print("*");
                }
                System.out.println();
            }else{
                System.out.println("Enter value between 1 to 30");
            }
        }
    }
}
