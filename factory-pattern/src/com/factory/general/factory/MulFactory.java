package com.factory.general.factory;

/**
 * @Auther: Jibny Zhan
 * @Date: 2019/12/8 21:29
 * @Description:
 */
public class MulFactory implements Factory {
    @Override
    public Operation creatOperation() {
        return (Operation) new Mul();
    }
}
