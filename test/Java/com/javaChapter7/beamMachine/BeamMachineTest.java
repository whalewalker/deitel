package Java.com.javaChapter7.beamMachine;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BeamMachineTest {
    BeamMachine beam;
    @BeforeEach
    void setUp() {
        beam = new BeamMachine(new int[5],10);
    }

    @AfterEach
    void tearDown() {
        beam = null;
    }

    @Test
    void beam_hasASlot(){
        beam.setSlot(new int[10]);
        assertEquals(10, beam.getSlot().length);
    }

    @Test
    void beam_hasABall(){
        beam.setBalls(10);
        assertEquals(10, beam.getBalls());
    }

    @Test
    void beamPosition_canBeRight(){
        beam.setPath(PathPosition.LEFT);
        beam.changePath();
        PathPosition actual = beam.getPath();
        assertNotEquals(PathPosition.RIGHT, actual);
    }

    @Test
    void beamPosition_canHaveDifferencePathPosition(){
        beam.setPath(PathPosition.LEFT);
        String paths = beam.beamPaths();
        assertNotEquals("RRLLL", paths);

    }

    @Test
    void beamSlot_canBeCalculated(){
        beam.setPath(PathPosition.LEFT);
        beam.calculateSlot();
        System.out.println(beam.displayPath());
        System.out.println(beam.displayBeamMachine());
        assertNotEquals(1, beam.getSlot()[1]);
    }


}