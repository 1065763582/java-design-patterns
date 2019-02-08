package com.lizq.design.behavioral.mediator;

/**
 * @author lizq
 * @date 2019/01/23 22:26
 */
public class Application {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        ConcreteColleagueA a = new ConcreteColleagueA(mediator);
        ConcreteColleagueB b = new ConcreteColleagueB(mediator);
        mediator.setC1(a);
        mediator.setC2(b);

        a.selfMethod();
        mediator.doSomething();
    }
}
