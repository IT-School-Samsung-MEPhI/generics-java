package example4;

import java.util.Arrays;

public class ArrayList<T> {
    private final int DEFAULT_LENGTH = 5;

    private T[] list = (T[]) new Object[DEFAULT_LENGTH];
    private int size = 0;

    public void add(T element) {
        list[size++] = element;

        if (list.length - 1 <= size)
            expand();
    }

    public void add(int index, T element) {
        if (index < 0)
            return;

        while (index > list.length - 1)
            expand();

        list[index] = element;
        size = index + 1;
    }

    public T remove() {
        if (size <= 0)
            return null;

        return list[--size];
    }

    public T remove(int index) {
        if (index < 0 && size <= 0)
            return null;

        T ret = list[index];
        size--;
        for (int i = index; i < size; i++) {
            list[i] = list[i + 1];
        }
        return ret;
    }

    private void expand() {
        list = Arrays.copyOf(list, list.length * 2);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(list[i]);
            if (i < size - 1)
                sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}
