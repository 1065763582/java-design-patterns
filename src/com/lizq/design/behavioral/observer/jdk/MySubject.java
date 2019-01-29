package com.lizq.design.behavioral.observer.jdk;

import java.util.Observable;

/**
 * @author lizq
 * @date 2019/01/29 21:30
 */
public class MySubject extends Observable {
    public void doSomething() {
        System.out.println("this jdk Observable");
        super.setChanged();
        super.notifyObservers("12345");
    }
}
