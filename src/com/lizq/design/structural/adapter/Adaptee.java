package com.lizq.design.structural.adapter;

/**
 * 系统历史的类，或许已经在生产上运行了很久了，能不改就不改，能复用就复用
 * @author lizq
 * @date 2019/01/19 22:03
 */
public class Adaptee {
    public void adapteeRequest() {
        System.out.println("这是系统的历史方法接口.....");
    }

}
