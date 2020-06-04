package com.factory.general.factory;

/**
 * @Auther: Jibny Zhan
 * @Date: 2019/12/8 21:28
 * @Description:
 */
public class SubFactory implements Factory {
    @Override
    public Operation creatOperation() {
        return (Operation) new Sub();
    }
}
