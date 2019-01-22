# 组合模式(Composite Pattern)

对象结构型  

将对象组合成树的结构表示“整体-部分”的层次结构，使客户端对单个对象和组合对象保持一致的处理方式。


#### 适用场景

1. 处理树形结构
2. 系统客户端对单个对象和组合对象一视同仁

#### 优点

1. 清楚的定义分层次的复杂对象
2. 让客户端忽略层次差异

#### 缺点

1. 只要是Component子类都能加入组合，限制类型时，比较复杂
2. 处理公共业务时，可能需要假如instanceof判断类型，若子类较多，代码就复杂了

#### 安全模式

看Application应用层，安全模式在抽象组件中只定义一些默认的行为或属性，它是把树枝节点和树叶节点彻底分开，最大的问题是破坏了依赖倒置原则，直接使用了具体的类。

![类图](https://github.com/1065763582/java-design-patterns/blob/master/src/resources/img/composite-safe.svg)

#### 透明模式

看Application应用层，透明模式是把用来组合使用的方法放到抽象类中，不管叶子对象还是树枝对象都有相同的结构，遵循了依赖倒置原则，但是运行期可能抛出UnsupportedOperationException

![类图](https://github.com/1065763582/java-design-patterns/blob/master/src/resources/img/omposite-transparent.svg)