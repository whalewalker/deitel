package Java.com.dsa.Queue;

/** A Queue interface defining the queue ADT, with a standard
        FIFO protocol for insertions and removals. */

public interface Queue<T>{
    /** Return the number of elements in a queue. */
    int size();

    /**Checks whether the queue is empty. */
    boolean isEmpty();

    /**Inserts an am element from the back of the queue.*/
    void enqueue(T t);

    /**Return , but not remove, the first element of the queue (null if empty)*/
    T first();

    /**Remove and return the element removed*/
    T dequeue();
}
