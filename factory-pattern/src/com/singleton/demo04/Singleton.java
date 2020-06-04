package com.singleton.demo04;

/**
 * @Auther: Jibny Zhan
 * @Date: 2019/9/12 17:03
 * @Description: 双重校验锁-线程安全
 */
public class Singleton {
    private static int count;
    private static volatile Singleton singletonInstance;

    private Singleton(){
        System.out.println("Singleton 私有的构造方法被实例化 " + (++count) + " 次。");
    }

    public static Singleton getSingletonInstance(){
        if(singletonInstance == null){
            synchronized (Singleton.class){
                if(singletonInstance == null){
                    singletonInstance = new Singleton();
                }
            }
        }
        return singletonInstance;
    }
}
