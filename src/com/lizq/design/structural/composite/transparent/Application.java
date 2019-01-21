package com.lizq.design.structural.composite.transparent;

/**
 * 安全的组合模式
 * @author lizq
 * @date 2019/01/20 22:24
 */
public class Application {
    public static void main(String[] args) {
        //创建一个根节点
        Component root = new Composite();
        root.operation();
        //创建一个树枝构件
        Component branch = new Composite();
        //创建一个叶子节点
        Component leaf = new Leaf();
        //建立整体
        root.add(branch);
        branch.add(leaf);
        root.operation();
        leaf.add(root);
    }
}
