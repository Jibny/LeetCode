package com.singleton.demo03;

/**
 * @Auther: Jibny Zhan
 * @Date: 2019/9/12 16:53
 * @Description: 懒汉式-线程安全-同步锁阻塞
 */
public class Singleton {
    private static int count;
    private static Singleton singletonInstance;

    private Singleton() {
        System.out.println("Singleton 私有的构造方法被实例化 " + (++count) + " 次。");
    }

    public static synchronized Singleton getSingletonInstance() {
        if (singletonInstance == null) {
            singletonInstance = new Singleton();
        }
        return singletonInstance;
    }
}
