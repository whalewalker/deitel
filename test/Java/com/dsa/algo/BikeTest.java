package Java.com.dsa.algo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BikeTest {
    Bike bike;

    @BeforeEach
    void setUp() {
        bike = new Bike("power bike");
    }

    @AfterEach
    void tearDown() {
        bike = null;
    }

    @Test
     void checkThatBikeIsNotNullWhenCreated(){
        assertNotNull(bike);
    }

    @Test
    void checkThatBikeSetDefaultValueWhenCreated(){
        assertEquals("power bike", bike.getName());
        assertFalse(bike.isOn());
        assertEquals(0, bike.getSpeed());
    }

    @Test
    void checkThatBikeCanTurnOn(){
        bike.setOn(true);
        assertTrue(bike.isOn());
    }

    @Test
    void checkThatBikeCanTurnOff(){
        // Given that
        bike.setOn(true);

        //When
        bike.setOn(false);

        //Assert
        assertFalse(bike.isOn());
    }

    @Test
    void canChangeBikeName(){
        bike.setName("Bajaj");
        assertEquals("Bajaj", bike.getName());
    }


    @Test
    void whenBikeIsOffThenGearShouldBeZero(){
        assertEquals(0, bike.getGear());
    }

    @Test
    void whenBikeIsOnThenGearShouldBeOne(){
        bike.setOn(true);
        assertEquals(1, bike.getGear());
    }

    @Test
    void canSetBikeSpeed(){
        bike.setSpeed(10);
        assertEquals(10, bike.getSpeed());
    }

    @Test
    void bikeCannotAccelerateWhenOff(){
        //Given
        bike.setOn(false);

        //When
        bike.accelerate();

        //Assert
        assertFalse(bike.isOn());
        assertEquals(0, bike.getSpeed());
    }

    @Test
    void bikeCanAccelerateByOneWhenOn(){
        //Given
        bike.setOn(true);
        //When
        bike.accelerate();
        //Assert
        assertEquals(1, bike.getSpeed());
        assertEquals(1, bike.getGear());
    }
    @Test
    void bikeCanAccelerateByTwoWhenOn(){
        //Given
        bike.setOn(true);
        //when
        for (int i=0; i< 21; i++){
            bike.accelerate();
        }
        assertEquals(23, bike.getSpeed());
    }

    @Test
    void gearCanIncrement(){
        //Given
        bike.setOn(true);
        //when
        for(int i =0; i<21;i++){
            bike.accelerate();
        }
        assertEquals(2,bike.getGear());

    }

}