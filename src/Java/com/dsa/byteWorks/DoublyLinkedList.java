package Java.com.dsa.byteWorks;

public interface DoublyLinkedList<T> {
    boolean isEmpty();
    Node<T> getHeadNode();
    Node<T> getTailNode();
    int getSize();
    void insertAtHead(T t);
    void insertAtTail(T t);
    void add(T t);
    Node<T> remove(int index) throws LinkedListUnderFlowException;
}
