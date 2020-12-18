package Java.com.javaChapter6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VolumeOFSphereTest {

    @Test
    void testIfRadiusCanBeSet(){
        double radius = 3.5;
        VolumeOFSphere mySphere = new VolumeOFSphere();
        mySphere.setRadius(radius);

        assertEquals(3.5, mySphere.getRadius());
    }

    @Test
    void testIfVolumeSphereCanBeCalculated(){
        double radius = 3.5;
        VolumeOFSphere mySphere = new VolumeOFSphere();
        mySphere.setRadius(radius);

        double expectation = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        double actual = mySphere.calculateAreaOFASphere(radius);

        assertEquals(expectation, actual);
    }

}