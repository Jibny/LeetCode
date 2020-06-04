package com.structure.data;

/**
 * @Auther: Jibny Zhan
 * @Date: 2019/11/27 00:53
 * @Description:
 */
public class StackTest {
    public static void main(String[] args) {
        Stack2 stack = new Stack2();
        System.out.println(stack.isEmpty());
        stack.push("Java");
        stack.push("is");
        stack.push("beautiful");
        stack.push("language");
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
        System.out.println(stack.peek());

    }
}
