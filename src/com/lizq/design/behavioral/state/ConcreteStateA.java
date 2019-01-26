package com.lizq.design.behavioral.state;

/**
 * @author lizq
 * @date 2019/01/26 19:24
 */
public class ConcreteStateA extends State {
    @Override
    public void stepOne() {
        System.out.println("do AAA");
        context.setCurrentState(Context.STATEB);
    }

    @Override
    public void stepTwo() {
        throw new UnsupportedOperationException("A状态没有这个操作");
    }

    @Override
    public void stepThree() {
        throw new UnsupportedOperationException("A状态没有这个操作");
    }
}
