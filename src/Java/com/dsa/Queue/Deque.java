package Java.com.dsa.Queue;

/**
 * Interface for double-ended queue: a collection of elements that can be inserted
 * and removed at both ends;
 */
public interface Deque<E> {
    /**
     * Return the number of element in the deque
     */
    int size();

    /**
     * Check whether the deque is empty
     */
    boolean isEmpty();

    /**
     * Returns, but  not remove the first element of the deque (null if empty)
     */
    E first();

    /**
     * Returns, but  not remove the last element of the deque (null if empty)
     */
    E last();

    /**
     * Insert an element ar the front of the deque
     */
    void addFirst(E e);

    /**
     * Insert an element ar the front of the deque
     */
    void addLast(E e);

    /**
     * Remove and return the first element of the deque (null if empty)
     */
    E removeFirst();

    /**
     * Remove and return the last element of the deque (null if empty)
     */
    E removeLast();
}
