package com.structure.data;

import java.util.LinkedList;

/**
 * @Auther: Jibny Zhan
 * @Date: 2019/11/27 19:14
 * @Description:
 */
public class Stack3<T> implements AbstractStack<T> {

    private LinkedList<T> linkedList = new LinkedList<>();

    @Override
    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    @Override
    public T peek() {
        return linkedList.getFirst();
    }

    @Override
    public void push(T t) {
        linkedList.add(t);
    }

    @Override
    public T pop() {
        return linkedList.remove();
    }
}
