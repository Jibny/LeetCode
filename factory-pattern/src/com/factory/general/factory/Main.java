package com.factory.general.factory;

/**
 * @Auther: Jibny Zhan
 * @Date: 2019/12/8 21:37
 * @Description: 构建生成实例的工厂，父类决定实例生成的方式，但并不决定生成的具体类
 * 优点：符合开闭原则，对扩展支持良好。缺点：增加了类，增加了类的管理。
 */
public class Main {
    public static void main(String[] args) throws Exception {
        // 反射获取工厂
        Factory addFactory = (Factory) Class.forName("com.factory.general.factory.AddFactory").newInstance();
        Factory subFactory = (Factory) Class.forName("com.factory.general.factory.SubFactory").newInstance();
        Factory mulFactory = new MulFactory();

        // 通过工厂对象创建相应的实例
        Operation addOperation = addFactory.creatOperation();
        Operation subOperation = subFactory.creatOperation();
        Operation mulOperation = mulFactory.creatOperation();

        System.out.println(addOperation.getResult(2,4));
        System.out.println(subOperation.getResult(2,4));
        System.out.println(mulOperation.getResult(2,4));
    }
}
