package Java.com.javaChapter5;
import java.util.Scanner;
public class BarChatPrintingProgram {
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

        BarChatPrintingProgram.PrintAsterisk(input1);
        BarChatPrintingProgram.PrintAsterisk(input2);
        BarChatPrintingProgram.PrintAsterisk(input3);
        BarChatPrintingProgram.PrintAsterisk(input4);
        BarChatPrintingProgram.PrintAsterisk(input5);

    }

    public static void PrintAsterisk(int input){
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
