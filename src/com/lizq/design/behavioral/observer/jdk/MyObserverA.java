package com.lizq.design.behavioral.observer.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * @author lizq
 * @date 2019/01/29 21:29
 */
public class MyObserverA implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("notify AAAA");
    }
}
