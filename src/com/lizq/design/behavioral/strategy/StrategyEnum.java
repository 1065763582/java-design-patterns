package com.lizq.design.behavioral.strategy;

/**
 * 策略模式的枚举实现
 * 在枚举中定义抽象方法相当于策略接口，每个枚举相当于是一个具体的策略实现
 * @author lizq
 * @date 2019/01/25 23:01
 */
public enum StrategyEnum {

    STRATEGY_A {
        @Override
        public void handle() {
            System.out.println("AAAAAA");
        }
    },
    STRATEGY_B {
        @Override
        public void handle() {
            System.out.println("BBBBBB");
        }
    };

    public abstract void handle();
}
