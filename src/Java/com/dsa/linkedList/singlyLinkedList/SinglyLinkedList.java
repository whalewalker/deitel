package Java.com.dsa.linkedList.singlyLinkedList;

import Java.com.dsa.linkedList.LinkedList;
import Java.com.dsa.linkedList.Node;

public class SinglyLinkedList<E> implements LinkedList<E> {
    private Node<E> head = null; // head node of the list (or null if empty)
    private Node<E> tail = null; // last node of the list (or null if empty)
    private int size = 0; // number of nodes in the list

    public Node<E> getHead() {
        return head;
    }

    public Node<E> getTail() {
        return tail;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public E first() {
        if (isEmpty()) return null;
        return head.getData();
    }

    @Override
    public E last() {
        if (isEmpty()) return null;
        return tail.getData();
    }

    @Override
    public void addFirst(E e) { // adds element e to the front of the list
        head = new Node<>(e, head); // create and link a new node
        if (isEmpty()) tail = head; // new node becomes tail
        size++; // update the size of linked list
    }

    @Override
    public void addLast(E e) { // adds element e to the end of the list
        Node<E> newest = new Node<>(e, null); // node will eventually be the tail
        if (isEmpty()) head = newest; //
        tail.setNext(newest); // new node after existing tail
        tail = newest; // new node becomes the tail
        size++;
    }

    @Override
    public E removeFirst() {
        if (isEmpty()) return null;
        E answer = head.getData();
        head = head.getNext();
        size--;
        if (isEmpty())
            tail = null;
        return answer;
    }
}
