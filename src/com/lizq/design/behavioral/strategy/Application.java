package com.lizq.design.behavioral.strategy;

/**
 * @author lizq
 * @date 2019/01/23 22:26
 */
public class Application {
    public static void main(String[] args) {
        Strategy strategy = new ConcreteStrategyA();
        Context context = new Context();
        context.setStrategy(strategy);
        context.doHandle();

        StrategyEnum.STRATEGY_A.handle();
    }
}
