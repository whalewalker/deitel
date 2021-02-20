package Java.com.chapterJava14.tokenization;

import java.util.Scanner;

public class Tokenizer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence a press enter: ");
        String sentence = scanner.nextLine();

        String[] tokens = sentence.split(" ");
        System.out.printf("Number of elements: %d%nThe token are:%n", tokens.length);

        for(String token : tokens){
            System.out.println(token);
        }
    }
}
