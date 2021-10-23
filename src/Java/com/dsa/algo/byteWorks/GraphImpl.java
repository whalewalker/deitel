package Java.com.dsa.algo.byteWorks;

import java.lang.reflect.Array;

public class GraphImpl<T> implements Graph<T>{
    private int numberOfVertices;
    private final double[][] lookUpTable;
    private final T[] adjacentList;

    public GraphImpl(int numberOfVertices, Class<T> doublyLinkedListClass) {
        this.numberOfVertices = numberOfVertices;
        this.lookUpTable = new double[numberOfVertices][numberOfVertices];
        this.adjacentList = (T[]) Array.newInstance(doublyLinkedListClass, numberOfVertices);
    }

    public int getNumberOfVertices() {
        return numberOfVertices;
    }

    public void setNumberOfVertices(int numberOfVertices) {
        this.numberOfVertices = numberOfVertices;
    }

    public double[][] getLookUpTable() {
        return lookUpTable;
    }

    public T[] getAdjacentList() {
        return adjacentList;
    }

    @Override
    public void addEdge(int source, int destination, double probability) {

    }

    @Override
    public void addToLookUpTable(int source, int destination, double probability) {

    }
}
