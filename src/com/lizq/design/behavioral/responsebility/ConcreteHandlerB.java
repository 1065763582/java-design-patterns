package com.lizq.design.behavioral.responsebility;

/**
 * @author lizq
 * @date 2019/01/28 21:41
 */
public class ConcreteHandlerB extends Handler {
    @Override
    protected Level getHandlerLevel() {
        System.out.println("judge B");
        return Level.B;
    }

    @Override
    protected String echo(Request request) {
        return "BBBB";
    }
}
