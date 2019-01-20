package com.lizq.design.structural.decorate;

/**
 * @author lizq
 * @date 2019/01/20 21:47
 */
public class DecoratorB extends Decorator {


    public DecoratorB(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        System.out.println("附加功能BBBBBBBBB");
        super.operation();
    }
}
