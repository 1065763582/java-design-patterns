package com.lizq.design.behavioral.command;

/**
 * @author lizq
 * @date 2019/02/07 15:17
 */
public class ConcreteCommandA implements Command {

    private Receiver receiver;

    // 带参构造器是为了构造出此命令的一个接收者
    public ConcreteCommandA(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        System.out.println("command AAA ready go!");
        receiver.doSomething();
    }
}
