package com.factory.simple.factory;

/**
 * @Auther: Jibny Zhan
 * @Date: 2019/12/8 21:02
 * @Description:
 */
public class Div implements Operation {
    @Override
    public double getResult(double numberA, double numberB) throws Exception {
        if (numberB == 0)
            throw new Exception("除数不能为0！");
        return numberA / numberB;
    }
}
