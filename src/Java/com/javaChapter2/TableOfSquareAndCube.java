package Java.com.javaChapter2;

import java.util.Scanner;

public class TableOfSquareAndCube {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number from 0 to 10 : ");
        int inputValue = input.nextInt();

        if(inputValue >= 0 && inputValue <= 10){
            int square = inputValue * inputValue;
            int cube = inputValue * inputValue * inputValue;

            System.out.println("Number      Square      Cube");
            System.out.println(inputValue + "           " + cube + "          " + cube);
        }else{
            System.out.println("Enter number from 0 to 10 ");
        }


    }
}
