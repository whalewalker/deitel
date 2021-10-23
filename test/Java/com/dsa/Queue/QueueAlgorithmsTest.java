package Java.com.dsa.Queue;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class QueueAlgorithmsTest {

    QueueAlgorithms algorithms;
    String[] a1, a2, a3;

    @BeforeEach
    void setUp() {
        algorithms = new QueueAlgorithms();
        a1 = new String[]{"Alice", "Bob", "Cindy", "Doug", "Ed", "Fred"};
        a2 = new String[]{"Gene", "Hope", "Irene", "Jack", "Kim", "Lance"};
        a3 = new String[]{"Mike", "Roberto"};
    }

    @AfterEach
    void tearDown() {
        algorithms = null;
    }


    @Test
    @DisplayName("Return null when queue is null")
    void verifyThatHotPotatoQueueIsNull(){
        assertNull(algorithms.hotPotato(null, 3));
    }

    @Test
    @DisplayName("Return the winner at the end of the game")
    void hotPotatoTest(){
        CircularQueue<String> q1 = algorithms.buildQueue(a1);
        String expected1 = "Alice";
        assertEquals(expected1, algorithms.hotPotato(q1, 3));

        CircularQueue<String> q2 = algorithms.buildQueue(a2);
        String expected2 = "Gene";
        assertEquals(expected2, algorithms.hotPotato(q2, 3));

        CircularQueue<String> q3 = algorithms.buildQueue(a3);
        String expected3 = "Roberto";
        assertEquals(expected3, algorithms.hotPotato(q3, 3));

    }
}