package Java.com.dsa.Queue;

import Java.com.dsa.linkedList.SinglyLinkedList;

/** Realization of a FIFO queue as an adaptation of a SinglyLinkedList. */
public class LinkedQueue<T> implements Queue<T>{

    private final SinglyLinkedList<T> list = new SinglyLinkedList<>(); //An empty list

    /**
     * Return the number of elements in a queue.
     */
    @Override
    public int size() {
        return list.size();
    }

    /**
     * Checks whether the queue is empty.
     */
    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    /**
     * Inserts an am element from the back of the queue.
     *
     */
    @Override
    public void enqueue(T element) {
        list.addLast(element);
    }

    /**
     * Return , but not remove, the first element of the queue (null if empty)
     */
    @Override
    public T first() {
        return list.first();
    }

    /**
     * Remove and return the element removed
     */
    @Override
    public T dequeue() {
        return list.removeFirst();
    }
}
