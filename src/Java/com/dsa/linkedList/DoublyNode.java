package Java.com.dsa.linkedList;

public class DoublyNode<T> extends Node<T>{
    private Node<T> next;
    public DoublyNode(T data, Node<T> next) {
        super(data, next);
    }

    @Override
    public Node<T> getNext() {
        return next;
    }

    @Override
    public void setNext(Node<T> next) {
        this.next = next;
    }
}
