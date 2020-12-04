package Java.com.javaChapter2;

import java.util.Scanner;

public class IntegerValueOfCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a character : ");
          char character = input.next().charAt(0);

        System.out.printf("The character %c has the value %d%n", character, ((int) character));

    }
}
