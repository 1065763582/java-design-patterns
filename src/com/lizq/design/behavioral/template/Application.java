package com.lizq.design.behavioral.template;

/**
 * @author lizq
 * @date 2019/01/23 21:30
 */
public class Application {
    public static void main(String[] args) {
        // 继承方式
        AbstractTemplate a = new ConcreteA();
        AbstractTemplate b = new ConcreteB();
        a.doIt();
        b.doIt();

        // 组合方式
        CompositeTemplate ca = new CompositeTemplate(new Process() {
            @Override
            public void stepThree() {
                System.out.println("this AAAA 3333");
            }

            @Override
            public boolean hook() {
                return false;
            }
        });
        CompositeTemplate cb = new CompositeTemplate(new Process() {
            @Override
            public void stepThree() {
                System.out.println("this AAAA 3333");
            }

            @Override
            public void stepTwo() {
                System.out.println("this AAAA 2222");
            }
        });

        ca.doIt();
        cb.doIt();

    }
}
