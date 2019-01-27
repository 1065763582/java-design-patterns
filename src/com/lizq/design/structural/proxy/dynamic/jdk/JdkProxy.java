package com.lizq.design.structural.proxy.dynamic.jdk;

import com.lizq.design.structural.proxy.Subject;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author lizq
 * @date 2019/01/27 21:56
 */
public class JdkProxy implements InvocationHandler {

    private Subject subject;

    private JdkProxy() {
    }

    private JdkProxy(Subject subject) {
        this.subject = subject;
    }

    private void after() {
        System.out.println("JdkProxy after ....");
    }

    private void before() {
        System.out.println("JdkProxy before ....");
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        this.before();
        method.invoke(subject, args);
        this.after();
        return null;
    }

    public static Subject createProxy(Subject subject) {
        return (Subject) Proxy.newProxyInstance(Subject.class.getClassLoader(),
                new Class[]{Subject.class},
                new JdkProxy(subject));
    }
}
