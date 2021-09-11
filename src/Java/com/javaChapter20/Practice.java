package Java.com.javaChapter20;

import java.util.ArrayList;

public class Practice {
    public static void main(String[] args) {
        System.out.printf("Maximum of %d, %d and %d is %d%n%n", 3, 4, 5, maximum(3, 4, 5));
        System.out.printf("Maximum of %.1f, %.1f and %.1f is %.1f%n%n", 6.6, 8.8, 7.7, maximum(6.6, 8.8, 7.7));
        System.out.printf("Maximum of %s, %s and %s is %s%n", "pear", "apple", "orange", maximum("pear", "apple", "orange"));

        Number[] numbers = {1, 2, 3, 4, 0.5};
        ArrayList<Number> numberArrayList = new ArrayList<>();

    }

    public static <T extends Comparable<T>> T maximum(T val1, T val2, T val3){
        T max = val1;
        if (val2.compareTo(max) > 0)
            max = val2;
        if (val3.compareTo(max) > 0)
            max = val3;
        return  max;
    }

    public static double sum(ArrayList<Number> numbers){
        double total = 0;
        for (Number number: numbers) {
            total += number.doubleValue();
        }
        return total;
    }
}
