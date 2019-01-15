package com.lizq.design.creational.singleton;

/**
 * 饿汉模式
 * @author lizq
 * @date 2019/01/15 22:11
 */
public class HungrySingleton {
    private final static HungrySingleton hungrySingleton;

    static {
        hungrySingleton = new HungrySingleton();
    }

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }
}
