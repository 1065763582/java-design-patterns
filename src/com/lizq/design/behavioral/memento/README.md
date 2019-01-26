# 备忘录模式(Memento Pattern)

行为型

在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态，以便在适当的时候恢复对象。有种“后悔药”的感觉

#### 适用场景

保存及恢复数据的类

#### 优点

1. 提供一种可恢复的机制
2. 封装了存档信息

#### 缺点

资源占用

#### 类图

![类图](https://github.com/1065763582/java-design-patterns/blob/master/src/resources/img/memento.svg)

#### Q&A
1.  并发怎么处理，比如一个线程在遍历，而另一个线程在添加或删除?  
    参照JDK迭代器的源码，可以在Aggregate中添加modCount属性记录修改次数，在Iterator实现中添加expectedModCount属性。获取到迭代器时，记录下当前聚合对象的修改次数，每次迭代操作时比较expectedModCount == modCount，如果false就抛出异常提示