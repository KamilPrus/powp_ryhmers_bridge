package edu.kis.vh.nursery;

public interface Stack {
    int EMPTY_STACK = -1;

    boolean isFull();
    boolean isEmpty();
    void push(int i);
    int pop();
    int top();
}
