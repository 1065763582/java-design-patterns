package com.lizq.design.behavioral.state;

/**
 * @author lizq
 * @date 2019/01/26 19:24
 */
public class ConcreteStateC extends State {
    @Override
    public void stepOne() {
        throw new UnsupportedOperationException("C状态没有这个操作");
    }

    @Override
    public void stepTwo() {
        throw new UnsupportedOperationException("C状态没有这个操作");
    }

    @Override
    public void stepThree() {
        System.out.println("do CCC END");
    }
}
