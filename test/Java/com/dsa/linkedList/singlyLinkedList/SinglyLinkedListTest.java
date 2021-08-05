package Java.com.dsa.linkedList.singlyLinkedList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SinglyLinkedListTest {
    SinglyLinkedList singlyLinkedList;

    @BeforeEach
    void setUp() {
        singlyLinkedList = new SinglyLinkedList<String>();
    }

    @AfterEach
    void tearDown() {
        singlyLinkedList = null;
    }

    @Test
    void linkedList_containEmptyNode_whenCreated(){
        assertNull(singlyLinkedList.getHead());
        assertNull(singlyLinkedList.getTail());
    }

    @Test
    void canAddDataToTheFrontOfALinkedListTest(){
        String value = "Hello world";
        singlyLinkedList.addFirst(value);
        assertEquals(singlyLinkedList.size(), 1);
        assertNotNull(singlyLinkedList.getHead());
    }
}