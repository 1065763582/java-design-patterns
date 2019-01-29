package com.lizq.design.behavioral.observer;

import com.lizq.design.behavioral.observer.jdk.MyObserverA;
import com.lizq.design.behavioral.observer.jdk.MySubject;

/**
 * @author lizq
 * @date 2019/01/23 21:30
 */
public class Application {
    public static void main(String[] args) {
        Observer a = new ObserverA();
        Observer b = new ObserverB();
        ConcreteSubject subject = new ConcreteSubject();
        subject.add(a);
        subject.add(b);
        subject.dosomething();

        // JDK自带实现
        MySubject mySubject = new MySubject();
        MyObserverA observerA = new MyObserverA();
        mySubject.addObserver(observerA);
        mySubject.doSomething();
    }
}
