package Java.com.javaChapter7.playground;

public class InitArray {
    public static void main(String[] args) {
        int sum = 0;
        final int ARRAY_LENGTH = 10;
        int[] array = new int[ARRAY_LENGTH];


        for(int counter = 0; counter < array.length; counter++){
            array[counter] = 2 + 2 * counter;
        }

        System.out.printf("%s%10s%15s%n", "Index", "Value", "Accumulation");

        for(int counter = 0; counter < array.length; counter++){
            sum += array[counter];
            System.out.printf("%5d%8d%8d%n", counter, array[counter], sum += array[counter]);

    }
    }
}
