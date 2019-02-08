package com.lizq.design.behavioral.mediator;

/**
 *
 * 中介者类， 用于将业务类解耦
 * @author lizq
 * @date 2019/02/08 12:44
 */
public abstract class Mediator {

    //定义同事类
    protected ConcreteColleagueA c1;
    protected ConcreteColleagueB c2;
    //通过getter/setter方法把同事类注入进来

    public ConcreteColleagueA getC1() {
        return c1;
    }

    public void setC1(ConcreteColleagueA c1) {
        this.c1 = c1;
    }

    public ConcreteColleagueB getC2() {
        return c2;
    }

    public void setC2(ConcreteColleagueB c2) {
        this.c2 = c2;
    }

    //中介者模式的业务逻辑
    public abstract void doSomething();
}
