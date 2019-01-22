package com.lizq.design.structural.bridge;

/**
 * @author lizq
 * @date 2019/01/17 21:47
 */
public class Application {

    public static void main(String[] args) {
        Implementor a = new ConcreteImplementorA();
        Implementor b = new ConcreteImplementorB();
        Abstraction one = new ConcreteAbstractionOne(a);
        Abstraction two = new ConcreteAbstractionTwo(b);

        one.bridgeOperation();
        one.doOtherSomething();

        two.bridgeOperation();
        two.doOtherSomething();
    }
}
