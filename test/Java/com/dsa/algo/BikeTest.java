package Java.com.dsa.algo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BikeTest {
    Bike suzuki;
    @BeforeEach
    public void startWithThis() {
        suzuki = new Bike("suzuki",0,0);
    }

    @Test
    void canCreateBike(){
        Bike suzuki = new Bike("suzuki",0,0);
        assertEquals(suzuki.getName(),"suzuki");
        assertEquals(suzuki.getAccelerate(),0);
        assertEquals(suzuki.getDeacceletrate(),0);
        assertEquals(suzuki.getGear(),0);
    }
    @Test
    public  void getBikeName(){
        Bike suzuki = new Bike("suzuki",0,0);
        String bikeName = suzuki.getbikeName("");
        assertEquals ("suzuki",bikeName);
    }
    @Test
    public void bikeCanTurnOn(){
        Bike suzuki =new Bike("suzuki",0,0);
        suzuki.isOn();
        assertFalse(suzuki.isOn);

        suzuki.turnOn();
        assertTrue(suzuki.isOn);


    }
    @Test
    public void bikeCanTurnOff(){
        suzuki.isOff();
        assertTrue(suzuki.isOff());

        suzuki.turnOff();
        assertFalse(suzuki.isOn());
    }
    @Test
    public void bikeCanAccelerate(){
        suzuki.isOn();
        suzuki.canAccelerate();
        assertEquals(0, suzuki.canAccelerate());
    }
    @Test
    public void canIncreaseAcceleration(){
        suzuki.isOn();
        suzuki.canAccelerate();
        suzuki.IncreaseAcceleration();
        assertEquals(0,suzuki.IncreaseAcceleration());
    }
    @Test
    public void bikeGearOne(){
        suzuki.isOn();
        suzuki.canAccelerate();
        suzuki.IncreaseAcceleration();
        suzuki.gearRange(1);
        assertEquals(1, suzuki.gear);
    }
    @Test
    public void setDeacceletrate(){
        suzuki.isOn();
        suzuki.Deaccelerate();
        assertEquals(0,suzuki.getDeacceletrate());

    }
}