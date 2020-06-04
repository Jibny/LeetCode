package com.factory.simple.factory;

/**
 * @Auther: Jibny Zhan
 * @Date: 2019/12/8 21:17
 * @Description:
 */
public class Main {

    public static void main(String[] args) throws Exception {
        Operation operation = SimpleFactory.Mul();
        double result = operation.getResult(2.5,4.5);
        System.out.println(result);
    }


}
