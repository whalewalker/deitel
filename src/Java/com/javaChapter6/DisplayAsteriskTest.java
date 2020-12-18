package Java.com.javaChapter6;

import java.util.Scanner;

public class DisplayAsteriskTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Chart generator!");

        int count = 1;
        while (count != -1){

                System.out.print("Enter square sides : ");
                int side = input.nextInt();

                System.out.print("Enter character you want your square to fill with: ");
                String fillChar = input.next();

                String result = DisplayingASquareOfAsterisks.generateAsterisk(fillChar, side);
                System.out.println(result + "\n");

        }
    }

}
