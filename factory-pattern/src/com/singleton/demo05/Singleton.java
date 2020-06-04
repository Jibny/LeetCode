package com.singleton.demo05;

/**
 * @Auther: Jibny Zhan
 * @Date: 2019/9/12 17:10
 * @Description:静态内部类实现(推荐)
 */
public class Singleton {
    private static int count;

    private Singleton() {
        System.out.println("Singleton 私有的构造方法被实例化 " + (++count) + " 次。");
    }

    private static class SingletonHolder {
        private static final Singleton singletonInstance = new Singleton();
    }

    public static Singleton getSingletonInstance() {
        return SingletonHolder.singletonInstance;
    }
}
