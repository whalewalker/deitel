package Java.com.dsa.algo;

import Java.com.dsa.linkedList.SinglyLinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryNumberLinkedListToIntegerTest {

    SinglyLinkedList<Integer> linkedList = new SinglyLinkedList<>();
    BinaryNumberLinkedListToInteger linkedListConverter = new BinaryNumberLinkedListToInteger();


    @Test
    void canConvertBinaryLinkedListToIntegerTest(){
        linkedList.addFirst(1);
        linkedList.addLast(0);
        linkedList.addLast(0);

        int integer = linkedListConverter.convertToInteger(linkedList);
        assertEquals(integer, 4);
    }

}