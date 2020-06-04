package com.structure.data;

import com.sun.org.apache.regexp.internal.RE;

/**
 * @Auther: Jibny Zhan
 * @Date: 2019/11/27 00:57
 * @Description:
 */
public class Stack2<T> implements AbstractStack<T> {

    private class Node<T> {
        private T t;
        private Node next;

        public Node(T t, Node next) {
            this.t = t;
            this.next = next;
        }

        public Node(T t) {
            this(t, null);
        }

    }

    private Node head;
    private int size;

    Stack2() {
        head = new Node(null, null);
    }

    public int getStackSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return head.next == null;
    }

    @Override
    public T peek() {
        T t = (T) head.next.t;
        return t;
    }

    @Override
    public void push(T t) {
        if (t == null) {
            throw new NullPointerException("参数不能为空");
        }
        Node<T> node = new Node<>(t, head.next);
        head.next = node;
        size++;
    }

    @Override
    public T pop() {
        if (isEmpty())
            return null;
        T t = (T) head.next.t;
        head.next = head.next.next;
        size--;
        return t;
    }

}
