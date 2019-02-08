package com.lizq.design.behavioral.mediator;

/**
 * @author lizq
 * @date 2019/02/08 12:46
 */
public class ConcreteMediator extends Mediator {
    @Override
    public void doSomething() {
        //调用同事类的方法，只要是public方法都可以调用
        super.c1.selfMethod();
        super.c2.selfMethodA();
    }

}
