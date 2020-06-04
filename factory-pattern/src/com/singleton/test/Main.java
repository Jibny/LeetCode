package com.singleton.test;

import com.singleton.demo05.Singleton;

/**
 * @Auther: Jibny Zhan
 * @Date: 2019/9/12 16:57
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
//        Singleton singleton1 = Singleton.getSingletonInstance();
//        Singleton singleton2 = Singleton.getSingletonInstance();
//        System.out.println(singleton1 == singleton1);
//        System.out.println(singleton1);
//        System.out.println(singleton2);
//        true

//        线程测试,不安全
//        线程 1 运行到 （1）处的时候,线程 2 抢到的 CPU 的执行权，进入 getInstance() 方法，
//        运行了 instance = new Singleton();，但线程 2 创建了对象这件事情，线程 1 根本不知道，
//        等到线程 1 重新获得 CPU 执行权的时候，从 （1） 处继续执行，又运行了 instance = new Singleton();
//        这行代码，这样，多余的对象就被创建出来了

        Runnable task = () -> {
            String threadName = Thread.currentThread().getName();
            Singleton s1 = Singleton.getSingletonInstance();
            System.out.println("线程 " + threadName + "\t => " + s1.hashCode());
        };
        for (int i = 0; i < 100; i++) {
            new Thread(task, "" + i).start();
        }
//        Singleton 私有的构造方法被实例化 1 次。
//        Singleton 私有的构造方法被实例化 3 次。
//        Singleton 私有的构造方法被实例化 1 次。
//        Singleton 私有的构造方法被实例化 2 次。
//        线程 2	 => 1133046463
//        线程 3	 => 503674368
//        线程 0	 => 2115147268
//        线程 1	 => 151286434
//        线程 4	 => 151286434 ......
    }
}
