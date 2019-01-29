# 代理模式(Proxy Pattern)

对象结构型

为其他对象提供一种代理，以控制对这个对象的访问。代理对象在客户端和目标类之间起到中介的作用

#### 适用场景

1. 保护目标对象
2. 增强目标对象

#### 优点

1. 职责清晰，真实的角色就是实现实际的业务逻辑，不用关心其他非本职责的事务，通过后期的代理完成一件事务，附带的结果就是编程简洁清晰

2. 高扩展性

#### 缺点

在客户端和目标类中增加了代理对象，增加系统复杂度

#### 代理的分类

静态代理：在代码中显式的指定代理类，class文件一直存在

动态代理：代理类在运行时生成的，class动态生成并执行。使用JDK代理只能对接口进行代理；使用CGLIB可以对类也可以对接口进行代理，但是不能对final修饰的类进行代理

#### 类图

![类图](https://github.com/1065763582/java-design-patterns/blob/master/src/resources/img/proxy.svg)

#### Q&A

1. 代理模式和装饰器模式的区别？

   代理，偏重因自己无法完成或自己无需关心，需要他人干涉事件流程，更多的是对对象的控制。强调控制访问
   装饰，偏重对原对象功能的扩展，扩展后的对象仍是是对象本身。强调对象增强

2. 代理模式和其他模式的联系
   状态模式（Context）、策略模式（Context）、访问者模式本质上是在更特殊的场合采用了代理模式