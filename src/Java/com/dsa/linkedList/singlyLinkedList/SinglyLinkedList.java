package Java.com.dsa.linkedList.singlyLinkedList;

import Java.com.dsa.linkedList.LinkedList;
import Java.com.dsa.linkedList.Node;

public class SinglyLinkedList<E> implements LinkedList<E> {
    private Node<E> head; // head node of the list (or null if empty)
    private Node<E> tail; // last node of the list (or null if empty)
    private int size; // number of nodes in the list

    public Node<E> getHead() {
        return null;
    }

    public Node<E> getTail() {
        return null;
    }

    @Override
    public int size() {
        return size + 1;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public E first() {
        return null;
    }

    @Override
    public E last() {
        return null;
    }

    @Override
    public void addFirst(E e) {

    }

    @Override
    public void addLast(E e) {

    }

    @Override
    public void removeFirst() {

    }
}
