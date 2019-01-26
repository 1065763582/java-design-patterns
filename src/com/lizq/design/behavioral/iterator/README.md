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

#### Q&A
1.  并发怎么处理，比如一个线程在遍历，而另一个线程在添加或删除?  
    参照JDK迭代器的源码，可以在Aggregate中添加modCount属性记录修改次数，在Iterator实现中添加expectedModCount属性。获取到迭代器时，记录下当前聚合对象的修改次数，每次迭代操作时比较expectedModCount == modCount，如果false就抛出异常提示