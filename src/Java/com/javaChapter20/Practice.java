package Java.com.javaChapter20;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        System.out.printf("Maximum of %d, %d and %d is %d%n%n", 3, 4, 5, maximum(3, 4, 5));
        System.out.printf("Maximum of %.1f, %.1f and %.1f is %.1f%n%n", 6.6, 8.8, 7.7, maximum(6.6, 8.8, 7.7));
        System.out.printf("Maximum of %s, %s and %s is %s%n", "pear", "apple", "orange", maximum("pear", "apple", "orange"));

//        Number[] numbers = {1, 2, 3, 4, 0.5};
//        System.out.printf("numberList contains: %s%n", Arrays.deepToString(numbers));
//        System.out.printf("To of the elements in numberList: %.1f%n", sum(numbers) );

        Integer[] integers = {1, 2, 3, 4, 5};
        ArrayList<Integer> integerList = new ArrayList<>(Arrays.asList(integers));
        System.out.printf("integerList contains: %s%n", integerList);
        System.out.printf("Total of the elements in integerList: %.0f%n%n",
                sum(integerList) );

        Double[] Doubles = {1.1, 3.3, 5.5};
        ArrayList<Double> doubleList = new ArrayList<>(Arrays.asList(Doubles));
        System.out.printf("doubleList contains: %s%n", doubleList);
        System.out.printf("Total of the elements in doubleList: %.1f%n%n",
                sum(doubleList) );
    }

    public static <T extends Comparable<T>> T maximum(T val1, T val2, T val3){
        T max = val1;
        if (val2.compareTo(max) > 0)
            max = val2;
        if (val3.compareTo(max) > 0)
            max = val3;
        return  max;
    }

    public static double sum(ArrayList<? extends Number> numbers){
        double total = 0;
        for (Number number: numbers) {
            total += number.doubleValue();
        }
        return total;
    }
}
