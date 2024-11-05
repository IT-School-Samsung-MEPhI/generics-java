package example4;

import java.util.Arrays;

public class Queue<T> {
    private final int QUEUE_LENGTH = 3;

    private final T[] queue = (T[]) new Object[QUEUE_LENGTH];
    private int size = 0;
    private int front = 0;
    private int rear = 0;

    public void add(T item) {
        if (size >= queue.length)
            return;

        queue[rear++] = item;
        if (rear >= queue.length)
            rear = 0;
        size++;
    }

    public T poll() {
        if (size == 0)
            return null;

        size--;
        T ret = queue[front++];
        if (front >= queue.length)
            front = 0;
        return ret;
    }

    public T peek() {
        if (size == 0)
            return null;

        return queue[front];
    }

    @Override
    public String toString() {
        return Arrays.toString(queue);
    }
}
