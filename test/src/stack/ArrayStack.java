package stack;

import java.util.Arrays;

public class ArrayStack extends Stack {
    private int[] data;
    private int capacity = 10;
    private int top = -1;

    public ArrayStack() {
        this.data = new int[capacity];
    }

    public ArrayStack(int capacity) {
        this.capacity = capacity;
        this.data = new int[capacity];
    }

    @Override
    public void push(int element) {
        if (top + 1 == capacity) {
            capacity *= 2;
            int temp[] = new int[capacity];
            for (int i = 0; i <= top; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
        data[++top] = element;
    }

    @Override
    public int pop() {
        return data[top--];
    }

    @Override
    public int peek() {
        return data[top];
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i <= top; i++) {
            sb.append(data[i]).append("->");
        }
        return sb.toString();
    }
}
