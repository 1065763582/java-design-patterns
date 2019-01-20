package com.lizq.design.structural.decorate;

/**
 * @author lizq
 * @date 2019/01/20 15:01
 */
public class Application {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        component.operation();
        System.out.println("=======================");
        Component a = new DecoratorA(component);
        a.operation();
        System.out.println("=======================");
        Component b = new DecoratorB(component);
        b.operation();
        System.out.println("=======================");
        Component b1 = new DecoratorB(a);
        b1.operation();
    }
}
