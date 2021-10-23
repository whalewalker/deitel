package Java.com.dsa.Queue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayDequeTest {
    ArrayDeque<String> arrayDeque;

    @BeforeEach
    void setUp() {
        arrayDeque = new ArrayDeque<>(3);
    }

    @AfterEach
    void tearDown() {
        arrayDeque = null;
    }

    @Test
    void DequeSizeIsZeroByDefault(){
        assertEquals(0, arrayDeque.size());
    }

    @Test
    void DequeSizeIsEmptyByDefault(){
        assertTrue(arrayDeque.isEmpty());
    }

    @Test
    void insertOneElementAtDequeFront(){
        arrayDeque.addFirst("Sam");
        assertEquals(1, arrayDeque.size());
        assertFalse(arrayDeque.isEmpty());
    }

    @Test
    void insertOneElementAtDequeEnd(){
        arrayDeque.addLast("Whale");
        assertEquals(1, arrayDeque.size());
        assertFalse(arrayDeque.isEmpty());
    }

    @Test
    void viewFrontElementInDeque(){
        arrayDeque.addFirst("Sam");
        String actual = arrayDeque.first();

        assertEquals(1, arrayDeque.size());
        assertFalse(arrayDeque.isEmpty());
        assertEquals("Sam", actual);
    }

    @Test
    void viewBackElementInDeque(){
        arrayDeque.addLast("Sam");
        String actual = arrayDeque.last();

        assertEquals(1, arrayDeque.size());
        assertFalse(arrayDeque.isEmpty());
        assertEquals("Sam", actual);
    }

    @Test
    void removeOneElementAtTheFrontOFDeque(){
        arrayDeque.addFirst("Sam");
        String actual = arrayDeque.removeFirst();
        assertEquals(0, arrayDeque.size());
        assertTrue(arrayDeque.isEmpty());
        assertEquals("Sam", actual);
    }

    @Test
    void removeOneElementAtTheEndOFDeque(){
        arrayDeque.addLast("Sam");
        String actual = arrayDeque.removeLast();
        assertEquals(0, arrayDeque.size());
        assertTrue(arrayDeque.isEmpty());
        assertEquals("Sam", actual);
    }



}