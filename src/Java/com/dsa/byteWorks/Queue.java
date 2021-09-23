package Java.com.dsa.byteWorks;

public interface Queue<T> {
    boolean isFull();
    boolean isEmpty();
    int top();
    void enqueue(T t);
    void dequeue();
}
