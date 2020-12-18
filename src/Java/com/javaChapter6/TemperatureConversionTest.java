package Java.com.javaChapter6;

import java.util.Scanner;

public class TemperatureConversionTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome wimp: This is an application for temperature conversion.\n=============================\nEnter 1 or 2 to perform the conversion" +
                "\n1. conversion from celsius to fahrenheit." +
                "\n2. conversion from fahrenheit to celsius.\n=============================\n");
        System.out.print("Enter your conversion : ");
        int userInput = scanner.nextInt();
        if(userInput == 1){
            celConversion();
        }else {
            if(userInput == 2){
                fehConversion();
            }else {
                System.out.println("Invalid input, read the above instruction!");
            }
        }
    }

    public static void celConversion(){
        TemperatureConversions conversions = new TemperatureConversions();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature in celsius (e.g 50.0) : ");
        conversions.setCelsius(input.nextDouble());


        double celConvert = TemperatureConversions.celsiusToFahrenheit(conversions.getCelsius());
        System.out.printf("Temperature at %f degree = %.2f fahrenheit", conversions.getCelsius(), celConvert);
    }

    public static void fehConversion(){
        TemperatureConversions conversions = new TemperatureConversions();
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter temperature in fahrenheit (e.g 20.0) : ");
        conversions.setFahrenheit(userInput.nextDouble());

        double fahConvert = TemperatureConversions.fahrenheitToCelsius(conversions.getFahrenheit());
        System.out.printf("Temperature at %f fahrenheit = %.2f degree", conversions.getFahrenheit(), fahConvert);
    }
}
