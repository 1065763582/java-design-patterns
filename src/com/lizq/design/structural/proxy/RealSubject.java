package com.lizq.design.structural.proxy;

/**
 * @author lizq
 * @date 2019/01/27 21:25
 */
public class RealSubject implements Subject {
    @Override
    public void dosomething() {
        System.out.println("do my something, this is important");
    }
}
