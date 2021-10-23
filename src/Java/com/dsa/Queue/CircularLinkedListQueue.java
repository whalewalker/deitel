package Java.com.dsa.Queue;

import Java.com.dsa.linkedList.circularLinkedList.CircularLinkedList;

public class CircularLinkedListQueue<T> implements CircularQueue<T>{
    private final CircularLinkedList<T> list = new CircularLinkedList<>();
    /**
     * Rotates the front element of the queue to the back
     * of the queue.
     * This does nothing if queue is empty
     */
    @Override
    public void rotate() {
        list.rotate();
    }

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
    public void enqueue(T t) {
        list.addLast(t);
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
