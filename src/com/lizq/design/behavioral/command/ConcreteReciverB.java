package com.lizq.design.behavioral.command;

/**
 *
 * 命令接收者的处理
 * @author lizq
 * @date 2019/02/07 15:18
 */
public class ConcreteReciverB implements Receiver {
    @Override
    public void doSomething() {
        System.out.println("BBB was recived command");
    }
}
