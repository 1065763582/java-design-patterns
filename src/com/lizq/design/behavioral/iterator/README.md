# 迭代器模式(Iterator Pattern)

行为型

提供一种方法访问一个聚合对象内部的各个元素，而又无需暴露该对象的内部表示

#### 适用场景

需要封装遍历规则的类

#### 优点

1. 分离了聚合对象的遍历行为
2. 提高扩展性，可动态扩展不同的遍历行为

#### 缺点

类数目成对增加

#### 类图

![类图](https://github.com/1065763582/java-design-patterns/blob/master/src/resources/img/iterator.svg)