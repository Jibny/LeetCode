package com.singleton.demo01;

/**
 * @Auther: Jibny Zhan
 * @Date: 2019/9/12 15:59
 * @Description:懒汉式-线程不安全
 */
public class Singleton {

    private static int count;
    private static Singleton singletonInstance;

    private Singleton() {
        System.out.println("Singleton 私有的构造方法被实例化 " + (++count) + " 次。");
    }

    public static Singleton getSingletonInstance() {
        if (singletonInstance == null) {
            singletonInstance = new Singleton();
        }
        return singletonInstance;
    }
}



