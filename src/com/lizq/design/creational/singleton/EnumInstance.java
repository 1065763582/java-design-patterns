package com.lizq.design.creational.singleton;

/**
 * @author lizq
 * @date 2019/01/15 22:23
 */
public enum EnumInstance {
    INSTANCE;

    public void doSomething() {
        // do it yourself
    }

    public static EnumInstance getInstance() {
        return INSTANCE;
    }
}
