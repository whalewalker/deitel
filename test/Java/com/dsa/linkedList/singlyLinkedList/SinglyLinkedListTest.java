package Java.com.dsa.linkedList.singlyLinkedList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SinglyLinkedListTest {
    SinglyLinkedList<String> singlyLinkedList;

    @BeforeEach
    void setUp() {
        singlyLinkedList = new SinglyLinkedList<>();
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
    void canAddDataToTheFrontOfASinglyLinkedListTest(){
        String value = "Hello world";
        singlyLinkedList.addFirst(value);
        assertEquals(singlyLinkedList.size(), 1);
        assertNotNull(singlyLinkedList.getHead(),  "Hello world");
    }

    @Test
    void canAddMoreThanOneDataToTheFrontOfASinglyLinkedListTest(){
       singlyLinkedList.addFirst("Boy");
        singlyLinkedList.addFirst("Girl");
        assertEquals(singlyLinkedList.size(), 2);
        assertNotNull(singlyLinkedList.getHead(), "Girl");
    }

    @Test
    void canAddDataToTheEndOfASinglyLinkedListTest(){
        String value = "Hello world";
        singlyLinkedList.addLast(value);
        assertEquals(singlyLinkedList.size(), 1);
        assertNotNull(singlyLinkedList.getHead(),  "Hello world");
    }

    @Test
    void canAddMoreThanOneDataToTheEndOfASinglyLinkedListTest(){
        singlyLinkedList.addLast("Boy");
        singlyLinkedList.addLast("Girl");
        assertEquals(singlyLinkedList.size(), 2);
        assertNotNull(singlyLinkedList.getTail(), "Boy");
    }

    @Test
    void canRemoveFirstValueInSinglyLinkedLIst(){
        singlyLinkedList.addFirst("Boy");
        singlyLinkedList.addFirst("Girl");
        String removedData = singlyLinkedList.removeFirst();
        assertEquals(removedData, "Girl");
    }

}