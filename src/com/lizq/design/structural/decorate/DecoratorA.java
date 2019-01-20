package com.lizq.design.structural.decorate;

/**
 * @author lizq
 * @date 2019/01/20 21:47
 */
public class DecoratorA extends Decorator {


    public DecoratorA(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        System.out.println("附加功能AAAAAAAAAAA");
        super.operation();
    }
}
