package com.singleton.demo02;

/**
 * @Auther: Jibny Zhan
 * @Date: 2019/9/12 16:44
 * @Description:饿汉式-线程安全
 */
public class Singleton {
    private static int count;
    private static Singleton singletonIntance = new Singleton();

    private Singleton() {
        System.out.println("Singleton 私有的构造方法被实例化 " + (++count) + " 次。");
    }

    public static Singleton getSingletonIntance() {
        return singletonIntance;
    }
}
