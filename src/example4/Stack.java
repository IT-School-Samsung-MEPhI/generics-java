package example4;

import java.util.Arrays;

public class Stack<T> {
    private final int STACK_LENGTH = 3;

    private final T[] stack = (T[]) new Object[STACK_LENGTH];
    private int top = -1;

    public void push(T element) {
        if (top < stack.length - 1) {
            stack[++top] = element;
        }
    }

    public T pop() {
        if (top >= 0) {
            return stack[top--];
        }
        return null;
    }

    public T peek() {
        if (top >= 0) {
            return stack[top];
        }
        return null;
    }

    @Override
    public String toString() {
        return Arrays.toString(stack);
    }
}
