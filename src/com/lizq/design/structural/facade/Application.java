package com.lizq.design.structural.facade;

/**
 * @author lizq
 * @date 2019/01/17 21:47
 */
public class Application {

    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.warpOperation();
    }
}
