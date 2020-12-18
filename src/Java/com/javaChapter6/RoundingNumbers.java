package Java.com.javaChapter6;

public class RoundingNumbers {

    public double roundValue(double value) {
        double roundedValue = Math.floor(value + 0.5);

        System.out.printf("Initial value %.2f\n", value);
        System.out.printf("Rounded value %.2f", roundedValue);

        return roundedValue;
    }

    public static double roundToSpecificDecimal(double value, int decimalPlace) {
        double roundedValue = Math.floor(value * getDecimalPlace(decimalPlace) + 0.5) / getDecimalPlace(decimalPlace);
        return roundedValue;
    }

    public static long getDecimalPlace(int decimalPlace){
        int counter = 1;
        for (int count = 1; count < 5; count++){
            counter *= 10;
            if(decimalPlace == count){
                decimalPlace = counter;
                break;
            }
        }
        return decimalPlace;
    }
}
