package com.lizq.design.structural.adapter;

/**
 * 新的客户是使用这个接口
 * @author lizq
 * @date 2019/01/19 22:46
 */
public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("新的客户，我就用这个接口");
    }
}
