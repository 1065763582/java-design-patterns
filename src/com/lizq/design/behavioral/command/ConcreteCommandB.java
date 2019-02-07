package com.lizq.design.behavioral.command;

/**
 * @author lizq
 * @date 2019/02/07 15:17
 */
public class ConcreteCommandB implements Command {

    private Receiver receiver;

    // 带参构造器是为了构造出此命令的一个接收者
    public ConcreteCommandB(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        System.out.println("command BBB ready go!");
        receiver.doSomething();
    }
}
