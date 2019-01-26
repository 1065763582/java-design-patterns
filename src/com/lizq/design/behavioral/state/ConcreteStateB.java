package com.lizq.design.behavioral.state;

/**
 * @author lizq
 * @date 2019/01/26 19:24
 */
public class ConcreteStateB extends State {
    @Override
    public void stepOne() {
        throw new UnsupportedOperationException("B状态没有这个操作");
    }

    @Override
    public void stepTwo() {
        System.out.println("do BBB");
        context.setCurrentState(Context.STATEC);
    }

    @Override
    public void stepThree() {
        throw new UnsupportedOperationException("B状态没有这个操作");
    }
}
