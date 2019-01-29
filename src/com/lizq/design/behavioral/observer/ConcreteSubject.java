package com.lizq.design.behavioral.observer;

/**
 * @author lizq
 * @date 2019/01/29 21:21
 */
public class ConcreteSubject extends Subject {
    public void dosomething(){
        System.out.println("I will do something..");
        super.update();
    }
}
