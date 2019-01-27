package com.lizq.design.structural.proxy;

import com.lizq.design.structural.proxy.dynamic.cglib.CglibProxy;
import com.lizq.design.structural.proxy.dynamic.jdk.JdkProxy;
import com.lizq.design.structural.proxy.staticp.StaticProxy;

/**
 * @author lizq
 * @date 2019/01/26 21:55
 */
public class Application {
    public static void main(String[] args) {
        Subject subject = new RealSubject();
        // 静态代理
        Subject staticProxy = StaticProxy.createProxy(subject);
        staticProxy.dosomething();
        // JDK 动态代理
        Subject jdkProxy = JdkProxy.createProxy(subject);
        jdkProxy.dosomething();
        // Cglib 动态代理
        Subject cglibProxy = CglibProxy.createProxy(subject);
        cglibProxy.dosomething();
    }
}
