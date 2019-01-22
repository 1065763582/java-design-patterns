package com.lizq.design.structural.bridge;

/**
 * @author lizq
 * @date 2019/01/22 22:52
 */
public class ConcreteAbstractionOne extends Abstraction {

    public ConcreteAbstractionOne(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void doOtherSomething() {
        System.out.println("do One bussiness");
    }
}
