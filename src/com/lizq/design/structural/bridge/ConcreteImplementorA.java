package com.lizq.design.structural.bridge;

/**
 * @author lizq
 * @date 2019/01/22 22:51
 */
public class ConcreteImplementorA implements Implementor{

    @Override
    public void operation() {
        System.out.println("this is AAA");
    }
}
