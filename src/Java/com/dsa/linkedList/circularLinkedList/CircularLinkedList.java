package Java.com.dsa.linkedList.circularLinkedList;

import Java.com.dsa.linkedList.LinkedList;
import Java.com.dsa.linkedList.Node;

public class CircularLinkedList<T> implements LinkedList<T> {
    private Node<T> tail;
    private int size = 0;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public T first() {
        return tail.getNext().getData();
    }

    @Override
    public T last() {
        return tail.getData();
    }

    @Override
    public void addFirst(T t) {
        if (isEmpty()){
            tail = new Node<T>(t, null);
            tail.setNext(tail);
        }else {
            Node<T> newest = new Node<>(t, tail.getNext());
            tail.setNext(newest);
        }
        size++;
    }

    public void rotate(){
        if (tail != null) tail = tail.getNext();
    }

    @Override
    public void addLast(T t) {
        addFirst(t);
        tail = tail.getNext();
    }

    @Override
    public T removeFirst() {
        if (isEmpty()) return null;
        Node<T> head = tail.getNext();
        if (head == tail) tail = null;
        else tail.setNext(head.getNext());
        size--;
        return head.getData();
    }
}
