package Java.com.dsa.algo.LinkedList;

import Java.com.dsa.linkedList.singlyLinkedList.SinglyLinkedList;
import Java.com.javaChapter4.BinaryNumberToDecimal;

public class BinaryNumberLinkedListToInteger {
    public int convertToInteger(SinglyLinkedList<Integer> linkedList) {
        StringBuilder builder = new StringBuilder();
        int temp = 0;
        while (linkedList.size() > 0){
            builder.append(linkedList.removeFirst());
        }
        String binaryString= builder.reverse().toString();

        BinaryNumberToDecimal binaryNumberToDecimal = new BinaryNumberToDecimal();

        return binaryNumberToDecimal.convertAnyBinaryToBaseTen(Integer.parseInt(binaryString));
    }
}
