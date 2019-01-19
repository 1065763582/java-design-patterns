package com.lizq.design.structural.flyweight;

/**
 * @author lizq
 * @date 2019/01/19 21:02
 */
public class Flyweight {

    // 内部状态
    private Object intrinsicState;
    // 外部状态
    private Object extrinsicState;

    //外部状态extrinsicState在使用时由外部设置，不保存在享元对象中，即使是同一个对象，在每一次调用时也可以传入不同的外部状态
    public void operation(String extrinsicState) {
        // do it yourself...
    }
}
