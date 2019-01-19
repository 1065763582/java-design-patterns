package com.lizq.design.structural.flyweight;

/**
 * @author lizq
 * @date 2019/01/19 21:08
 */
public class Application {
    public static void main(String[] args) {
        FlyweightFactory flyweightFactory = new FlyweightFactory();
        Flyweight f1 = flyweightFactory.getFlyweight("one");
        Flyweight f2 = flyweightFactory.getFlyweight("tow");
        assert f1 != f2;
        Flyweight f3 = flyweightFactory.getFlyweight("one");
        assert f1 == f3;
    }
}
