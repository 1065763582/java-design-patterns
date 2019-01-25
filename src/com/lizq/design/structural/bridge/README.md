# 桥接模式(Bridge Pattern)

对象结构型  

将抽象部分与他的具体实现部分分离，是他们都可以独立的变化。通过组合的方式使两个类建立联系，而不是使用继承。本质就是通过抽象和接口，使同一层级的类相互组合，各自扩展。

#### 适用场景

1. 抽象和实现之间增加更多的灵活性
2. 一个类存在两个或多个独立变化的维度，且这些维度都需要独立的扩展
3. 不希望使用继承，或因为多重继承导致系统类的个数剧增

#### 优点

1. 分离抽象部分和实现部分，抽象和实现不在同一个继承层次中，是通过组合获得多维度的组合对象
2. 提高了系统的扩展性
3. 符合开闭原则，合成复用原则

#### 缺点

1. 增加了系统的理解和抽象难度
2. 需要正确识别出系统中独立变化的维度

#### 类图

![类图](https://github.com/1065763582/java-design-patterns/blob/master/src/resources/img/bridge.svg)

#### Q&A

1. 分离抽象部分和实现部分是什么意思？

   抽象和实现都是针对抽象类Abstraction的，在抽象类中桥接方法bridgeOperation是具体的实现，其他抽象方法是抽象，等待子类实现。将组合的对象Implementor分离到桥接方法中使用，而不影响子类的逻辑。这样通过构造器或其他方式传入实现类，就可以达到与抽象类的实现自由组合的目的了。

   举个例子：做一个画几何图形的API。已知图形有：圆，三角形，矩形，五边形，六边形；颜色有：赤橙黄绿青蓝紫。

   方案1: 直接编写API

   ①  	建立颜色形状类，如赤色圆，橙色圆……  共35个类

   ②    根据条件创建对应类，调用画图API。

   方案2: 使用桥接模式

   ①   建立图形（Shape）接口 5个 ——— Abstraction

   ②   建立颜色（Color）接口 7个     ——— Implementor

   ③   根据条件组合图形与颜色，调用图形的画图API。共12个类

   桥接模式将形状与颜色分离，这里的抽象部分就是指画什么形状的图（Abstraction），具体实现部分就是颜色（Implementor），颜色和图形不会相互耦合，可各自扩展，然后相互组合。减少了类的个数，更加容易扩展。

2. 桥接模式和组合模式的区别？

   组合模式强调部分-整体间的组合，主要处理树形结构。桥接模式强调平行级别上不同类的组合

3. 桥接模式和适配器模式？

   两者都是为了让类协同工作。适配器是改变已有的接口，使新老接口可以相互配合；桥接模式是分离抽象和具体的实现