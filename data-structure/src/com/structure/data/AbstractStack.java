package com.structure.data;

/**
 * @Auther: Jibny Zhan
 * @Date: 2019/11/27 01:43
 * @Description:
 */
public interface AbstractStack<T> {


    boolean isEmpty();  //判断栈空

    T peek();   //返回栈顶元素

    void push(T t);    //压栈

    T pop();    //出栈


}
