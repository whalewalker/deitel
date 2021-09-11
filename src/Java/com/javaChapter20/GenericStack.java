package Java.com.javaChapter20;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class GenericStack<T> {
    public final ArrayList<T> elements;

    public GenericStack() {
        this(10);
    }

    public GenericStack(int capacity) {
        int initialCapacity = capacity > 0 ? capacity : 10;
        this.elements = new ArrayList<>(initialCapacity);
    }

    public void push(T pushValue){
        elements.add(pushValue);
    }

    public T pop(){
        if(elements.isEmpty()) throw new EmptyStackException();
        return elements.remove(elements.size() - 1);
    }
}
