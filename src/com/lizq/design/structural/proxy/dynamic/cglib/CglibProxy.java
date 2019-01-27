package com.lizq.design.structural.proxy.dynamic.cglib;

import com.lizq.design.structural.proxy.Subject;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author lizq
 * @date 2019/01/27 23:12
 */
public class CglibProxy implements MethodInterceptor {

    private Subject subject;

    private CglibProxy() {
    }

    private CglibProxy(Subject subject) {
        this.subject = subject;
    }

    public static Subject createProxy(Subject subject) {
        CglibProxy cglibProxy = new CglibProxy(subject);
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(subject.getClass());
        enhancer.setCallback(cglibProxy);
        return (Subject) enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        this.before();
        methodProxy.invokeSuper(o, objects);
        this.after();
        return null;
    }

    private void after() {
        System.out.println("CglibProxy after ....");
    }

    private void before() {
        System.out.println("CglibProxy before ....");
    }
}
