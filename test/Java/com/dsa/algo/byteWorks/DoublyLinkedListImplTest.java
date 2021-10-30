//package Java.com.dsa.algo.byteWorks;
//
//import Java.com.dsa.linkedList.DoublyLinkedList;
//import Java.com.dsa.linkedList.DoublyLinkedListImpl;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class DoublyLinkedListImplTest {
//    private DoublyLinkedList<Integer> doublyLinkedList;
//
//    @BeforeEach
//    void setUp() {
//        doublyLinkedList = new DoublyLinkedListImpl<>();
//    }
//
//    @AfterEach
//    void tearDown() {
//        doublyLinkedList = null;
//    }
//
//    @Test
//    void isEmpty(){
//        assertTrue(doublyLinkedList.isEmpty());
//    }
//
//    @Test
//    void getHeadNodeWhenLinkedListNotEmpty(){
//        doublyLinkedList.insertAtHead(10);
//        assertNotNull(doublyLinkedList.getHeadNode());
//        assertEquals(doublyLinkedList.getSize(), 1);
//        assertEquals(doublyLinkedList.getHeadNode().getData(), 10);
//    }
//
//    @Test
//    void canInsertTwoDataAtHead(){
//        doublyLinkedList.insertAtHead(10);
//        doublyLinkedList.insertAtHead(5);
//        assertEquals( doublyLinkedList.getHeadNode().getData(), 5);
//        assertEquals(doublyLinkedList.getHeadNode().getNext().getData(), 10);
//        assertEquals(doublyLinkedList.getSize(), 2);
//    }
//
//    @Test
//    void getTailNodeWhenLinkedListNotEmpty(){
//        doublyLinkedList.insertAtTail(10);
//        assertNotNull(doublyLinkedList.getTailNode());
//        assertEquals(doublyLinkedList.getSize(), 1);
//        assertEquals(doublyLinkedList.getTailNode().getData(), 10);
//    }
//
//    @Test
//    void canInsertTwoDataAtTail(){
//        doublyLinkedList.insertAtHead(10);
//        doublyLinkedList.insertAtHead(5);
////        assertEquals( doublyLinkedList.getTailNode().getPrev().getData(), 5);
//        assertEquals(doublyLinkedList.getTailNode().getData(), 10);
//        assertEquals(doublyLinkedList.getSize(), 2);
//    }
//
//    @Test
//    public void add_find_and_removeFromALinkedList() throws LinkedListUnderFlowException {
//        DoublyLinkedList<String > doublyLinkedList = new DoublyLinkedListImpl<>();
//        doublyLinkedList.add("I love byte works company");
//        doublyLinkedList.add("i am a software engineer");
//        doublyLinkedList.add("I love code");
//
//        doublyLinkedList.remove(2);
//        assertNotNull(doublyLinkedList);
//    }
//
//
//}