package com.lizq.design.behavioral.visitor;

/**
 * @author lizq
 * @date 2019/01/23 22:26
 */
public class Application {
    public static void main(String[] args) {
        Visitor visitor = new ConcreteVisitor();
        Element a = new BusinessA();
        Element b = new BusinessB();
        // do your something
        a.visit(visitor);
        b.visit(visitor);
    }
}
