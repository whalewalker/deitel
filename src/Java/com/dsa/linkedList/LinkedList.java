package Java.com.dsa.linkedList;

public interface LinkedList<E> {
    int size(); //Returns the number of elements in the list.
    boolean isEmpty(); //Returns true if the list is empty, and false otherwise.
    E first(); //Returns (but does not remove) the first element in the list.
    E last(); // Returns (but does not remove) the last element in the list.
    void addFirst(E e); //Adds a new node to the front of the list.
    void addLast(E e); //Adds a new node to the end of the list.
    E removeFirst(); //Removes and returns the first element of the list.
}
