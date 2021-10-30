package Java.com.dsa.linkedList;

import Java.com.dsa.algo.byteWorks.LinkedListUnderFlowException;
import Java.com.dsa.algo.byteWorks.Node;

public interface DoublyLinkedList<T> {
    boolean isEmpty();
    DoublyNode<T> getHeadNode();
    DoublyNode<T> getTailNode();
    int getSize();
    void insertAtHead(T t);
    void insertAtTail(T t);
    void add(T t);
    DoublyNode<T> remove(int index) throws LinkedListUnderFlowException;
}
