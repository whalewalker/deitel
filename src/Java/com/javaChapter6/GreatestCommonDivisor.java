package Java.com.javaChapter6;

public class GreatestCommonDivisor {
    public static int calculateGreatestCommonDivisor(int value_1, int value_2) {
        int divisor = 0;
        int newDivisor;
        if(value_1 == 0){
            return value_2;
        }else if(value_2 == 0){
            return value_1;
        }else {
            int min = calculateMinimum(value_1, value_2);
            int max = calculateMaximum(value_1, value_2);

            newDivisor = max % min;
            int value = max / min;
            if(newDivisor == 0){
                divisor = min;
                System.out.println(divisor);
                return divisor;
            }else {
                return calculateGreatestCommonDivisor(min, newDivisor);
            }
        }

    }

    public static int calculateMinimum(int value_1, int value_2) {
        return Math.min(value_1, value_2);
    }

    public static int calculateMaximum(int value_1, int value_2) {
        return Math.max(value_1, value_2);
    }
}
