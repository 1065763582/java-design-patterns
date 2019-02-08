package com.lizq.design.behavioral.mediator;

/**
 *
 * 协同的类， 相当于系统的业务类
 * @author lizq
 * @date 2019/02/08 12:46
 */
public abstract class Colleague {
    protected Mediator mediator;
    public Colleague(Mediator mediator){
        this.mediator = mediator;
    }
}
