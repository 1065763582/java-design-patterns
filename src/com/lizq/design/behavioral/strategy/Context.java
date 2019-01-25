package com.lizq.design.behavioral.strategy;

/**
 * @author lizq
 * @date 2019/01/25 21:38
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void doHandle(){
        strategy.handle();
    }
}
