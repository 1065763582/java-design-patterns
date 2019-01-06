# 简单工厂  (Simple Factory)

创建型
由一个工厂对象决定创建出哪一种类的实例。又叫做静态工厂方法（Static Factory Method）模式

#### 适用场景

1. 工厂类负责创建的对象比较少
2. 应用层只知道传入工厂类的参数，对于如何创建对象（逻辑）不关心

#### 优点

只需要传入一个正确的参数，就可以获取所需对象，而无需知道其创建细节

#### 缺点

1. 由于工厂类集中了所有实例的创建逻辑，导致工厂类职责相对过重
2. 若要增加新的类，需要修改工厂类的判断逻辑，违背了开闭原则

#### 类图

![类图](https://github.com/1065763582/java-design-patterns/blob/master/src/resources/img/simpleFactory.svg)