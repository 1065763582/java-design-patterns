package com.lizq.design.structural.decorate;

/**
 *
 * 装饰者类，继承被装饰的普通接口(或者抽象类)
 * @author lizq
 * @date 2019/01/20 15:36
 */
public abstract class Decorator implements Component {

    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        this.component.operation();
    }
}
