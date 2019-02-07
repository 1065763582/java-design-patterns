package com.lizq.design.behavioral.command;

/**
 * @author lizq
 * @date 2019/01/23 22:26
 */
public class Application {
    public static void main(String[] args) {
        // 1. 定义一个请求的处理者
        Receiver receiverA = new ConcreteReciverA();
        // 2. 定义一个命令，并指定该命令的处理者
        Command commandA = new ConcreteCommandA(receiverA);
        // 3. 定义一个请求的调用者, 用于存储或者收集命令
        Invoker invoker = new Invoker();
        invoker.addCommand(commandA);
        // 4. 执行命令
        invoker.executeOnce();
        System.out.println("=============================");
        Receiver receiverB = new ConcreteReciverB();
        Command commandB = new ConcreteCommandB(receiverB);
        invoker.addCommand(commandA);
        invoker.addCommand(commandB);
        invoker.executeAll();
    }
}
