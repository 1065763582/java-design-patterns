package com.lizq.design.behavioral.visitor;

/**
 * @author lizq
 * @date 2019/02/08 17:58
 */
public class ConcreteVisitor implements Visitor {
    @Override
    public void visitor(BusinessA a) {
        System.out.println(a.toString());
    }

    @Override
    public void visitor(BusinessB b) {
        System.out.println(b.toString());
    }
}
