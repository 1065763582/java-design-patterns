package com.lizq.design.structural.adapter.clazz;

import com.lizq.design.structural.adapter.Adaptee;
import com.lizq.design.structural.adapter.Target;

/**
 * 把老旧的接口伪装成新的接口
 * @author lizq
 * @date 2019/01/19 22:48
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        super.adapteeRequest();
    }
}
