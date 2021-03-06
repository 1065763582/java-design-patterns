# 模板方法模式(Template Method Pattern)

行为型

定义一个操作中的算法框架，将一些步骤延迟到子类，使得子类可以在不改变算法结构的情况下重新定义该算法的某些特性

#### 适用场景

提取各个子类公共的行为到父类中

#### 优点

1. 提高复用性
2. 提高扩展性
3. 符合开闭原则

#### 缺点

1. 类数目增加
2. 继承关系本身的缺陷，若父类添加新的抽象方法，所有子类都要改一遍.

#### 类图

![类图](https://github.com/1065763582/java-design-patterns/blob/master/src/resources/img/template.svg)

#### 钩子方法

提供一种缺省的行为，是模版对子类进一步的开放和扩展，通过外界条件改变，影响到模板方法的执行

[^实现方式]: 实现方式除了继承，还可以使用组合的方式实现，组合就带有策略模式的感觉了

