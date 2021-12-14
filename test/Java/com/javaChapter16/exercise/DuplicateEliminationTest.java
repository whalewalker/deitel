package Java.com.javaChapter16.exercise;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuplicateEliminationTest {

    DuplicateElimination elimination;

    @BeforeEach
    void setUp() {
        elimination = new DuplicateElimination();
    }

    @AfterEach
    void tearDown() {
        elimination = null;
    }

    @Test
    void DuplicateEliminationIsEmptyWhenConstructed(){
        assertTrue(elimination.getNames().isEmpty());
    }

    @Test
    void canAddANameToNameList(){
        elimination.setName("Frank");
        assertFalse(elimination.getNames().isEmpty());
        assertEquals(elimination.getNames().size(), 1);
        assertEquals(elimination.getNames().toArray()[0], "Frank");
    }

    @Test
    void canAddMultipleNameToNameList(){
        elimination.saveNames("Taiwo", "Kehinde", "Zainab", "Whale");
        assertFalse(elimination.getNames().isEmpty());
    }

    @Test
    void cannotAddDuplicateNameToNameList(){
        elimination.saveNames("Frank", "Josh", "Frank");
        assertFalse(elimination.getNames().isEmpty());
        assertEquals(elimination.getNames().size(), 2);
        assertEquals(elimination.getNames().toArray()[0], "Josh");
    }
}