package Java.com.dsa.Queue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayQueueTest {
    ArrayQueue<String> stringArrayQueue;

    @BeforeEach
    void setUp() {
        stringArrayQueue = new ArrayQueue<>();
    }

    @AfterEach
    void tearDown() {
        stringArrayQueue = null;
    }

    @Test
    @DisplayName("By default size of queue should be 0")
    void size() {
        int expected = 0;
        assertEquals(expected, stringArrayQueue.size());
    }

    @Test
    @DisplayName("By default queue must be empty")
    void isEmpty() {
        assertTrue(stringArrayQueue.isEmpty());
    }

    @Test
    @DisplayName("One element can be added to queue")
    void enqueue() {
        String element = "Rice";
        int expected = 1;

        stringArrayQueue.enqueue(element);

        assertFalse(stringArrayQueue.isEmpty());
        assertEquals(expected, stringArrayQueue.size());
    }

    @Test
    @DisplayName("More element can be added to queue")
    void enqueueMoreElement() {
        stringArrayQueue.enqueue("Rice");
        stringArrayQueue.enqueue("Pepper");
        stringArrayQueue.enqueue("Onion");
        stringArrayQueue.enqueue("Maggi");

        int expected = 4;

        assertFalse(stringArrayQueue.isEmpty());
        assertEquals(expected, stringArrayQueue.size());
    }

    @Test
    @DisplayName("Exception is thrown when element is added to a full queue")
    void queueThrowIllegalStateExceptionWhenQueueIsFullAndAnotherElementIsAdded() {
        ArrayQueue<String> arrayQueue = new ArrayQueue<>(2);

        arrayQueue.enqueue("Rice");
        arrayQueue.enqueue("Pepper");

        int expected = 2;
        assertFalse(arrayQueue.isEmpty());
        assertEquals(expected, arrayQueue.size());

        assertThrows(IllegalStateException.class, ()-> arrayQueue.enqueue("Pepper"));
    }


    @Test
    @DisplayName("Can return the first element in a queue")
    void first() {
        stringArrayQueue.enqueue("Rice");
        stringArrayQueue.enqueue("Pepper");
        stringArrayQueue.enqueue("Onion");
        stringArrayQueue.enqueue("Maggi");

        String expected = "Rice";
        assertEquals(expected, stringArrayQueue.first());
    }

    @Test
    @DisplayName("Return null if queue is empty")
    void whenQueueIsEmptyReturnNull() {
        assertNull(stringArrayQueue.first());
    }

    @Test
    @DisplayName("first element can be removed and return")
    void dequeue() {
        String element = "Rice";

        stringArrayQueue.enqueue(element);
        String actual = stringArrayQueue.dequeue();

        String expected = "Rice";

        assertEquals(expected, actual);
        assertTrue(stringArrayQueue.isEmpty());
        assertEquals(0, stringArrayQueue.size());
    }

    @Test
    @DisplayName("Return null when queue is empty")
    void whenDequeueIsCalledAndQueueIsEmptyReturnNull() {
        assertNull(stringArrayQueue.dequeue());
    }

}