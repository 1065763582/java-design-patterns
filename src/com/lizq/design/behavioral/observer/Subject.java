package com.lizq.design.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lizq
 * @date 2019/01/29 21:09
 */
public abstract class Subject {
    private List<Observer> list = new ArrayList<>();

    public boolean add(Observer observer) {
        return list.add(observer);
    }

    public void update() {
        for (Observer o : list) {
            o.update();
        }
    }
}
