package Java.com.dsa.foobar;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MinionWorkTest {
    MinionWork minionWork;

    @BeforeEach
    void setUp() {
        minionWork = new MinionWork();
    }

    @AfterEach
    void tearDown() {
        minionWork = null;
    }

    @Test
    void removeDuplicateInNthTerm(){
        int[] array = {5, 10, 15, 10, 7};
        int duplicate = 1;

        System.out.println(Arrays.toString(minionWork.removeDuplicate(array, duplicate)));
    }
}