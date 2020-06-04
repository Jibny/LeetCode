package com.factory.general.factory;


/**
 * @Auther: Jibny Zhan
 * @Date: 2019/12/8 21:01
 * @Description:
 */
public class Mul implements Operation {
    @Override
    public double getResult(double numberA, double numberB) throws Exception {
        return numberA * numberB;
    }
}
