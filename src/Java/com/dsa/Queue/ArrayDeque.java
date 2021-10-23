package Java.com.dsa.Queue;

public class ArrayDeque<E> implements Deque<E>{
    //Instance variables
    private final E[] data; // generic array used for storage
    private int front = 0;// index of the front element
    private int end = 0; // index of the last element
    private int size = 0; // current number of elements in queue


    //Constructors
    public ArrayDeque(){
        this(8); //Construct queue with default capacity
    }
    public ArrayDeque(int capacity){ //Construct queue with given capacity
        data = (E[]) new Object[capacity]; // Safe cast; compiler may give warning
    }
    /**
     * Return the number of element in the deque
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * Check whether the deque is empty
     */
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Returns, but  not remove the first element of the deque (null if empty)
     */
    @Override
    public E first() {
        return data[front];
    }

    /**
     * Returns, but  not remove the last element of the deque (null if empty)
     */
    @Override
    public E last() {
        return data[end];
    }

    /**
     * Insert an element ar the front of the deque
     *
     * @param e
     */
    @Override
    public void addFirst(E e) {
        if (size == data.length) throw new IllegalStateException("Deque i full");
        int available = (front + size) % data.length;
        data[available] = e;
        size++;
    }

    /**
     * Insert an element ar the front of the deque
     *
     * @param e
     */
    @Override
    public void addLast(E e) {
        if (size == data.length) throw new IllegalStateException("Deque i full");
        end = (end - 1 + data.length) % data.length;
        data[end] = e;
        size++;
    }

    /**
     * Remove and return the first element of the deque (null if empty)
     */
    @Override
    public E removeFirst() {
        if (isEmpty()) return null;
        E answer = data[front];
        data[front] = null;
        front = (front + 1) % data.length;
        size--;
        return answer;
    }

    /**
     * Remove and return the last element of the deque (null if empty)
     */
    @Override
    public E removeLast() {
        if (isEmpty()) return null;
        E answer = data[end];
        data[end] = null;
        end = (end - 1 + data.length) % data.length;
        size--;
        return answer;
    }
}
