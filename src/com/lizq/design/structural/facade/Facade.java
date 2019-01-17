package com.lizq.design.structural.facade;

/**
 * @author lizq
 * @date 2019/01/17 21:49
 */
public class Facade {

    private ServiceA serviceA = new ServiceA();
    private ServiceB serviceB = new ServiceB();
    private ServiceC serviceC = new ServiceC();

    public void warpOperation(){
        serviceA.operation();
        serviceB.operation();
        serviceC.operation();
    }
}
