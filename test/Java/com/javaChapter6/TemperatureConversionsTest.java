package Java.com.javaChapter6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConversionsTest {
    TemperatureConversions myConversion = new TemperatureConversions();

    @Test
    void checkIfCelsiusCanBeSet(){
        double celsius = 300;
        myConversion.setCelsius(celsius);
        assertEquals(celsius, myConversion.getCelsius());
    }

    @Test
    void checkIfFahrenheitCanBeSet(){
        double fahrenheit = 300;
        myConversion.setFahrenheit(fahrenheit);
        assertEquals(fahrenheit, myConversion.getFahrenheit());
    }


    @Test
    void testIfTemperatureCanBeConvertedCelsius(){
        double fahrenheit = 45.0;
        double expected = 7.2;
        double actual = TemperatureConversions.fahrenheitToCelsius(fahrenheit);

        assertEquals(expected, actual);
    }

    @Test
    void testIfTemperatureCanBeConvertedFahrenheit(){
        double celsius = 45.0;
        double expected = 138.6;
        double actual = TemperatureConversions.celsiusToFahrenheit(celsius);

        assertEquals(expected, actual);
    }
}