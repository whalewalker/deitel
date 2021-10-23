package Java.com.dsa.Queue;

/**Implementation of the queue ADT using a fixed-length array and generic */
public class ArrayQueue<T> implements Queue<T> {

    //Instance variables
    private T[] data; // generic array used for storage
    private int front = 0; // index of the front element
    private int size = 0; // current number of elements in queue


    //Constructors
    public ArrayQueue(){
        this(8); //Construct queue with default capacity
    }
    public ArrayQueue(int capacity){ //Construct queue with given capacity
        data = (T[]) new Object[capacity]; // Safe cast; compiler may give warning
    }

    /**
     * Return the number of elements in a queue.
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * Checks whether the queue is empty.
     */
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Inserts an am element from the back of the queue.
     *
     */
    @Override
    public void enqueue(T element) {
        if (size == data.length) throw new IllegalStateException("Queue is full");
        int available = (front + size) % data.length;
        data[available] = element;
        size++;
    }

    /**
     * Return , but not remove, the first element of the queue (null if empty)
     */
    @Override
    public T first() {
        if (isEmpty()) return null;
        return data[front];
    }

    /**
     * Remove and return the element removed
     */
    @Override
    public T dequeue() {
        if (isEmpty()) return null;
        T answer = data[front];
        data[front] = null;
        front = (front + 1) % data.length;
        size--;
        return answer;
    }
}
