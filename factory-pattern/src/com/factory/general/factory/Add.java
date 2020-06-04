package com.factory.general.factory;

/**
 * @Auther: Jibny Zhan
 * @Date: 2019/12/8 20:59
 * @Description:
 */
public class Add implements Operation {
    @Override
    public double getResult(double numberA, double numberB) throws Exception {
        return numberA + numberB;
    }
}
