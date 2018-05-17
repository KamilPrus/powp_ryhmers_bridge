package edu.kis.vh.nursery;

public class IntArrayStack implements Stack{

    public static final int ARRAY_SIZE = 12;
    private int[] numbers = new int[ARRAY_SIZE];

    private int total = EMPTY_STACK;

    @Override
    public void push(int in) {
        if (!isFull()) {
            numbers[++total] = in;
        }
    }

    @Override
    public boolean isEmpty() {
        return total == EMPTY_STACK;
    }

    @Override
    public boolean isFull() {
        return total == ARRAY_SIZE - 1;
    }

    @Override
    public int top() {
        if (isEmpty()) {
            return EMPTY_STACK;
        }
        return numbers[total];
    }

    @Override
    public int pop() {
        if (isEmpty()) {
            return EMPTY_STACK;
        }
        return numbers[total--];
    }

    public int getTotal() {
        return total;
    }
}
