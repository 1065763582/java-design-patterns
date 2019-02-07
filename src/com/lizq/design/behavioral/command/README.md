# 命令模式(Command Pattern)

行为型

将请求封装成对象，以便使用不同的请求。解决了应用程序中对象的职责以及他们之间的通信方式，解耦了请求的发送者和消费者。

#### 适用场景

请求调用者和消费者不直接交互

#### 优点

1. 降低耦合
2. 容易扩展新的命令

#### 缺点

命令的扩展增加了类的数量

#### 类图

![类图](https://github.com/1065763582/java-design-patterns/blob/master/src/resources/img/command.svg)

