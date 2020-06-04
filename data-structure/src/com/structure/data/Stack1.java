package com.structure.data;

import java.util.Arrays;

/**
 * @Auther: Jibny Zhan
 * @Date: 2019/11/25 20:05
 * @Description:
 */
public class Stack1<T> implements AbstractStack<T> {
    private Object[] stack;

    private int size;

    Stack1() {
        stack = new Object[10];
    }


    public  boolean isEmpty() {
        return size == 0;
    }


    public T peek() {
        T t = null;
        if (size > 0)
            t = (T) stack[size - 1];
        return t;
    }


    public void push(T t) {
        expandCapacity(size + 1);
        stack[size] = t;
        size++;
    }


    public T pop() {
        T t = peek();
        if (size > 0) {
            stack[size - 1] = null;
            size--;
        }
        return t;
    }

    private void expandCapacity(int size) {
        int len = stack.length;
        if (size > len) {
            size = size * 3 / 2 + 1;
            stack = Arrays.copyOf(stack, size);
        }
    }

}
