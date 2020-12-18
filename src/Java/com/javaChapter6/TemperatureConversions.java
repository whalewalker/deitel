package Java.com.javaChapter6;

public class TemperatureConversions {
    private double fahrenheit;
    private double celsius;

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return RoundingNumbers.roundToSpecificDecimal(((5.0 / 9.0) * (fahrenheit - 32)), 1);
    }

    public static double celsiusToFahrenheit(double celsius) {
        return RoundingNumbers.roundToSpecificDecimal(((9.0 / 5.0) * (celsius + 32)), 1);
    }
}
