package com.factory.general.factory;

/**
 * @Auther: Jibny Zhan
 * @Date: 2019/12/8 21:28
 * @Description:
 */
public class AddFactory implements Factory {
    @Override
    public Operation creatOperation() {
        return (Operation) new Add();
    }
}
