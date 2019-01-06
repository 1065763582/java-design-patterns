package com.lizq.design.creational.factory.com.lizq.design.model;

/**
 * 学习Python的同学
 *
 * @author lizq
 * @date 2019-01-06 11:33
 */
public class PythonStudent implements Student{
    @Override
    public void study() {
        System.out.println("studying python...");
    }
}
