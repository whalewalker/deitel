package Java.com.dsa.stack;

public class ArrayStack<E> implements Stack<E> {
    public static final int CAPACITY = 8; // default array capacity
    private E[] data; // generic array used for storage
    private int t = -1; // index of the top element in stack

    public ArrayStack() {
        this(CAPACITY); // construct stack with default capacity
    }

    public ArrayStack(int capacity) {
        data = (E[]) new Object[capacity];
    }

    @Override
    public int size() {
        return t + 1;
    }

    @Override
    public boolean isEmpty() {
        return t == -1;
    }

    @Override
    public void push(E e) {
        if (size() == data.length) throw new IllegalStateException("Stack is full");
        data[++t] = e;
    }

    @Override
    public E top() {
        if (isEmpty()) return null;
        return data[t];
    }

    @Override
    public E pop() throws StackUnderFlowException {
        if (isEmpty()) throw new StackUnderFlowException("Stack is empty");
        return data[t--];
    }
}
