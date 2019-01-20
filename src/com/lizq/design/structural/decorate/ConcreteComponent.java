package com.lizq.design.structural.decorate;

/**
 * @author lizq
 * @date 2019/01/20 15:36
 */
public class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println("这是一个普通的接口实现");
    }
}
