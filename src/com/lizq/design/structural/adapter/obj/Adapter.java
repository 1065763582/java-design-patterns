package com.lizq.design.structural.adapter.obj;

import com.lizq.design.structural.adapter.Adaptee;
import com.lizq.design.structural.adapter.Target;

/**
 * @author lizq
 * @date 2019/01/19 23:14
 */
public class Adapter implements Target {

    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        adaptee.adapteeRequest();
    }

}
