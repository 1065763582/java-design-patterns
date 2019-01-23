package com.lizq.design.behavioral.template;

/**
 * @author lizq
 * @date 2019/01/23 21:49
 */
public abstract class AbstractTemplate {
    protected void stepOne() {
        System.out.println("start 1....");
    }

    protected void stepTwo() {
    }

    protected abstract void stepThree();

    //钩子方法， 根据条件判断第二步是否执行
    protected boolean hook() {
        return true;
    }

    // 声明为final 是不希望子类重写这个算法的结构
    // 采用继承的方式
    public final void doIt() {
        this.stepOne();
        if (this.hook()) {
            this.stepTwo();
        }
        this.stepThree();
    }
}
