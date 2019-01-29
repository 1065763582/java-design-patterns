package com.lizq.design.behavioral.observer;

/**
 * @author lizq
 * @date 2019/01/29 21:16
 */
public class ObserverA implements Observer {
    @Override
    public void update() {
        System.out.println("update AAA");
    }
}
