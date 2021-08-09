package Java.com.dsa.linkedList.circularLinkedList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircularLinkedListTest {
    CircularLinkedList<Integer> circularLinkedList;

    @BeforeEach
    void setUp() {
        circularLinkedList = new CircularLinkedList<>();
    }

    @AfterEach
    void tearDown() {
        circularLinkedList = null;
    }

    @Test
    @DisplayName("circular linked has zero data at initialization")
    void size() {
        assertEquals(circularLinkedList.size(), 0);
    }

    @Test
    @DisplayName("circular linked is empty at initialization")
    void isEmpty() {
        assertTrue(circularLinkedList.isEmpty());
    }

    @Test
    @DisplayName("Can add data to circular linked list")
    void addFirst() {
        circularLinkedList.addFirst(5);
        assertFalse(circularLinkedList.isEmpty());
        assertEquals(circularLinkedList.size(), 1);
    }

    @Test
    @DisplayName("More than one Data can be added to circular linked list")
    void addMoreDataAtFirst() {
        circularLinkedList.addFirst(5);
        circularLinkedList.addFirst(6);
        circularLinkedList.addFirst(7);
        assertFalse(circularLinkedList.isEmpty());
        assertEquals(circularLinkedList.size(), 3);
    }

    @Test
    @DisplayName("Can add element at the end of circular linked list")
    void addLast() {
        circularLinkedList.addLast(5);
        assertFalse(circularLinkedList.isEmpty());
        assertEquals(circularLinkedList.size(), 1);
    }

    @Test
    @DisplayName("More than one Data can be added at the end of circular linked list")
    void addMoreDataAtEnd() {
        circularLinkedList.addLast(5);
        circularLinkedList.addLast(6);
        circularLinkedList.addLast(7);
        assertFalse(circularLinkedList.isEmpty());
        assertEquals(circularLinkedList.size(), 3);
    }



    @Test
    @DisplayName("can get first data in when data is added at the end of circular linked list")
    void canGetFirstData_WhenDataIsAddedAtTheEndOfLinkedList() {
        circularLinkedList.addLast(5);
        circularLinkedList.addLast(6);
        circularLinkedList.addLast(7);
        assertFalse(circularLinkedList.isEmpty());
        assertEquals(circularLinkedList.size(), 3);
        assertEquals(circularLinkedList.first(), 5);
    }

    @DisplayName("can get first data in when data is added at the front of circular linked list")
    @Test
    void canGetFirstData_WhenDataIsAddedAtTheFrontOfLinkedList() {
        circularLinkedList.addFirst(5);
        circularLinkedList.addFirst(6);
        circularLinkedList.addFirst(7);
        assertFalse(circularLinkedList.isEmpty());
        assertEquals(circularLinkedList.size(), 3);
        assertEquals(circularLinkedList.first(), 7);
    }

    @Test
    @DisplayName("can get last data in when data is added at the end of circular linked list")
    void canGetLastData_WhenDataIsAddedAtTheEndOfLinkedList() {
        circularLinkedList.addLast(5);
        circularLinkedList.addLast(6);
        circularLinkedList.addLast(7);
        assertFalse(circularLinkedList.isEmpty());
        assertEquals(circularLinkedList.size(), 3);
        assertEquals(circularLinkedList.last(), 7);
    }

    @DisplayName("can get last data in when data is added at the front of circular linked list")
    @Test
    void canGetLastData_WhenDataIsAddedAtTheFrontOfLinkedList() {
        circularLinkedList.addFirst(5);
        circularLinkedList.addFirst(6);
        circularLinkedList.addFirst(7);
        assertFalse(circularLinkedList.isEmpty());
        assertEquals(circularLinkedList.size(), 3);
        assertEquals(circularLinkedList.last(), 5);
    }

    @Test
    @DisplayName("Data can be removed from the front of a circular linked list")
    void removeFirst() {
        circularLinkedList.addFirst(6);
        circularLinkedList.addLast(5);
        circularLinkedList.addLast(7);

        circularLinkedList.removeFirst();

        assertFalse(circularLinkedList.isEmpty());
        assertEquals(circularLinkedList.size(), 2);
        assertEquals(circularLinkedList.first(), 5);
        assertEquals(circularLinkedList.last(), 7);
    }

    @Test
    @DisplayName("Can change node at head to tail")
    void rotate() {
        circularLinkedList.addFirst(5);
        circularLinkedList.addFirst(6);
        circularLinkedList.addFirst(7);

        assertFalse(circularLinkedList.isEmpty());
        assertEquals(circularLinkedList.size(), 3);
        assertEquals(circularLinkedList.last(), 5);
        assertEquals(circularLinkedList.first(), 7);


        circularLinkedList.rotate();

        assertFalse(circularLinkedList.isEmpty());
        assertEquals(circularLinkedList.size(), 3);
        assertEquals(circularLinkedList.last(), 7);
    }


}