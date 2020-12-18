package Java.com.javaChapter6;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingChargesTest {
    ParkingCharges myCharge;

    @BeforeEach
    void setUp() {
        myCharge = new ParkingCharges(1);
    }

    @AfterEach
    void tearDown() {
        myCharge = null;
    }

    @Test
    void checkForHourParked() {
        int hour = 3;
        ParkingCharges newCharge = new ParkingCharges(hour);
        assertEquals(hour, newCharge.getHour());
    }

    @Test
    void testIfHourCanBeSet() {
        int hour = 9;
        myCharge.setHour(hour);
        assertEquals(hour, myCharge.getHour());
    }

    @Test
    void testIfHourIsGreaterThanThree(){
        int hour = 6;
        myCharge.setHour(hour);
        assertEquals(hour, myCharge.getHour());
    }

    @Test
    void testIfHourIsGreaterLesserThree(){
        int hour = 1;
        myCharge.setHour(hour);
        assertEquals(0, myCharge.getHour());
    }


    @Test
    void testIfChargeCanBeCalculated() {
        myCharge.setHour(4);
        double charge = myCharge.calculateCharge(myCharge.getHour());
        System.out.println(charge);
        assertEquals(charge, myCharge.getCharge());
    }

    @Test
    void checkIfChargesForHourGreaterThanThree() {
        int hour = 4;
        myCharge.setHour(hour);
        double price = myCharge.hourlyRate(myCharge.getHour());
        assertEquals(2.5, price);
    }
}