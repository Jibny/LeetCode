package com.factory.simple.factory;

/**
 * @Auther: Jibny Zhan
 * @Date: 2019/12/8 21:06
 * @Description:
 */
public class SimpleFactory {
    //    public static Operation creatOperation(String condition) {
//        Operation operation = null;
//        switch (condition) {
//            case "+":
//                operation = new Add();
//                break;
//            case "-":
//                operation = new Sub();
//                break;
//            case "*":
//                operation = new Mul();
//                break;
//            case "/":
//                operation = new Div();
//                break;
//        }
//
//        return operation;
//    }
    public static Operation createOperation = null;

    public static Operation Add(){
        return new Add();
    }
    public static Operation Sub(){
        return new Sub();
    }
    public static Operation Mul(){
        return new Mul();
    }
    public static Operation Div(){
        return new Div();
    }

}
