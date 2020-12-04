package Java.com.javaChapter2;

import java.util.Scanner;

public class OddOREven {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer : ");
        int value = input.nextInt();
        if(value % 2 == 0){
            System.out.printf("%d is an even number ", value);
        }else{
            System.out.printf("%d is an odd number ", value);
        }
    }

}
