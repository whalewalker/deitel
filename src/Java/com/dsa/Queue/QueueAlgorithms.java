package Java.com.dsa.Queue;

public class QueueAlgorithms {

    public <T> CircularQueue<T> buildQueue(T[] array) {
        CircularQueue<T> queue = new CircularQueueImpl<>();
        for (T t : array) {
            queue.enqueue(t);
        }
        return queue;
    }

    public <T> T hotPotato(CircularQueue<T> queue, int constant) {
        if (queue.isEmpty()) return null;
        while (queue.size() > 1) {
            for (int index = 0; index < constant - 1; index++)
                queue.rotate();
            queue.dequeue();
        }
        return queue.dequeue();
    }
}
