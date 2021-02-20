package Java.com.crap;

import java.util.Arrays;
import java.util.Random;

public class Example {
    boolean x;
    public static void main(String[] args) {
        Example example = new Example();
        System.out.println(example.x);
        int value1 = 9;
        int value2 = value1;
        value1++;

        System.out.println("Value 1: =" + value1);
        System.out.println("Value 2: =" + value2);

        int[] valueA = new int[20];
        int[] valueB = valueA;

        valueA = new int[10];
        System.out.println("Value A: = " + Arrays.toString(valueA));
        System.out.println("Value B: = " + Arrays.toString(valueB));

        Random random1 = new Random(3);
        System.out.print("From random1: ");
        for (int i = 0; i < 10; i++)
            System.out.print(random1.nextInt(1000) + " ");
        Random random2 = new Random(3);
        System.out.print("\nFrom random2: ");
        for (int i = 0; i < 10; i++)
            System.out.print(random2.nextInt(1000) + " ");
    }

}
