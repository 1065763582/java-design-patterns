package com.lizq.design.structural.composite.transparent;

import java.util.ArrayList;

/**
 * @author lizq
 * @date 2019/01/21 21:22
 */
public abstract class Component {

    public abstract void operation();
    public abstract void add(Component component);
    public abstract void remove(Component component);
    public abstract ArrayList<Component> getChildren();
}
