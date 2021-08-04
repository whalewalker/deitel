package Java.com.dsa.stack;
/**
 * A collection of object that are inserted and removed according to the last-in-first-out-principle
 * @author Whalewlaker
 */
public interface Stack<E> {
    /**
     * Return the number of element in a stack
     * @return number of element in a stack
     */

    int size();

    /**
     * Tests whether the stack is empty
     * @return true if stack is empty, otherwise false
     */

    boolean isEmpty();

    /**
     * Inserts an element at the top
     * @param e the element to be inserted
     */

    void push(E e);

    /**
     * Returns, but does not remove, the element at the top of the stack
     * @return top element in the stack ( or null if empty)
     */

    E top();

    /**
     * Removes and returns the top element from the stack
     * @return element removed (or throw EmptyStackException)
     */

    E pop() throws StackUnderFlowException;



}
