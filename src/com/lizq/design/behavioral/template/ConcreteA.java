package com.lizq.design.behavioral.template;

/**
 * @author lizq
 * @date 2019/01/23 21:55
 */
public class ConcreteA extends AbstractTemplate {

    @Override
    protected void stepThree() {
        System.out.println("this AAAA 3333");
    }

    @Override
    protected boolean hook() {
        return false;
    }
}
