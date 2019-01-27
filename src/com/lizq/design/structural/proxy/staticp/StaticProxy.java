package com.lizq.design.structural.proxy.staticp;

import com.lizq.design.structural.proxy.Subject;

/**
 * @author lizq
 * @date 2019/01/27 21:28
 */
public class StaticProxy implements Subject {

    private Subject subject;

    private StaticProxy() {

    }

    private StaticProxy(Subject subject){
        this.subject = subject;
    }

    @Override
    public void dosomething() {
        this.before();
        this.subject.dosomething();
        this.after();
    }

    public static StaticProxy createProxy(Subject subject){
        return new StaticProxy(subject);
    }

    private void after() {
        System.out.println("StaticProxy after ....");
    }

    private void before() {
        System.out.println("StaticProxy before ....");
    }
}
