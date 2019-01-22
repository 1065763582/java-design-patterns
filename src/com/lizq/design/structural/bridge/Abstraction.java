package com.lizq.design.structural.bridge;

/**
 * 定义抽象的接口
 * 该接口包含实现具体行为、具体特征的Implementor接口
 * @author lizq
 * @date 2019/01/22 22:46
 */
public abstract class Abstraction {
    protected Implementor implementor;

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    public void bridgeOperation(){
        this.implementor.operation();
    }

    public abstract void doOtherSomething();
}
