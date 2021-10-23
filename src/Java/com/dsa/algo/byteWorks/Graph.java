package Java.com.dsa.algo.byteWorks;

public interface Graph<T> {
    void addEdge(int source, int destination, double probability);
    void addToLookUpTable(int source, int destination, double probability);
}
