package Java.com.chapterJava14.limericks;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LimericksTest {
Limericks poem;

    @BeforeEach
    void setUp() {
        poem = new Limericks();
    }

    @AfterEach
    void tearDown() {
        poem = null;
    }

    @Test
    void checkIfRandomNumberCanBeGenerated(){

    }
}