package Java.com.dsa.Queue;

public interface CircularQueue<T> extends Queue<T>{
    /**
     * Rotates the front element of the queue to the back
     * of the queue.
     * This does nothing if queue is empty
     */
    void rotate();
}
