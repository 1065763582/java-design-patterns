# 享元模式(Flyweight Pattern)

对象结构型
运用共享技术有效地支持大量细粒度对象的复用。


#### 适用场景

系统存在大量相似或相同对象

#### 优点

减少系统对象数量，减少内存，提高系统效率

#### 缺点

享元模式使得系统更加复杂，需要分离出内部状态和外部状态，这使得程序的逻辑复杂化。

#### 类图

![类图](https://github.com/1065763582/java-design-patterns/blob/master/src/resources/img/flyweight.svg)

#### 内部状态(IntrinsicState)

可共享的状态，不随环境变化而变化

#### 外部状态(Extrinsic State)

不可共享状态，跟随环境变化