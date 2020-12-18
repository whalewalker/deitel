package Java.com.javaChapter6;

import java.util.Scanner;

public class MultipleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        while (count != -1){

            System.out.print("Enter integer : ");
            int value = scanner.nextInt();

            System.out.print("Enter multiple of the above value : ");
            int multiple = scanner.nextInt();

            String  output = Multiples.isItMultiple(value, multiple) ? "is a" : "is not";

            System.out.printf("%d %s multiple of %d\n\n", multiple, output, value);
        }



    }
}
