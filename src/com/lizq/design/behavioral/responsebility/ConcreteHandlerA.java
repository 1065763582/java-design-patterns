package com.lizq.design.behavioral.responsebility;

/**
 * @author lizq
 * @date 2019/01/28 21:41
 */
public class ConcreteHandlerA extends Handler {
    @Override
    protected Level getHandlerLevel() {
        System.out.println("judge A");
        return Level.A;
    }

    @Override
    protected String echo(Request request) {
        return "AAAA";
    }
}
