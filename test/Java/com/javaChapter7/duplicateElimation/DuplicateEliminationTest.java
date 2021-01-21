package Java.com.javaChapter7.duplicateElimation;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class DuplicateEliminationTest {

    @Test
    void checkIfElementExitInArr(){
        DuplicateElimination exitElimination = new DuplicateElimination();
        int [] arr = {2, 3, 4, 5,2, 3};
        boolean exit = exitElimination.isExit(arr, 4);
       assertTrue(exit);
    }


}