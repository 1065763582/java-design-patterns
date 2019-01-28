package com.lizq.design.behavioral.responsebility;

/**
 * @author lizq
 * @date 2019/01/28 21:41
 */
public class ConcreteHandlerC extends Handler {
    @Override
    protected Level getHandlerLevel() {
        System.out.println("judge C");
        return Level.C;
    }

    @Override
    protected String echo(Request request) {
        return "CCCC";
    }
}
