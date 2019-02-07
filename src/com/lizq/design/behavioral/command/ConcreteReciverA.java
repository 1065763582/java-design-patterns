package com.lizq.design.behavioral.command;

/**
 *
 * 命令接收者的处理
 * @author lizq
 * @date 2019/02/07 15:18
 */
public class ConcreteReciverA implements Receiver {
    @Override
    public void doSomething() {
        System.out.println("AAA was recived command");
    }
}
