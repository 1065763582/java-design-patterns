package com.lizq.design.structural.composite.transparent;

import java.util.ArrayList;

/**
 * @author lizq
 * @date 2019/01/21 21:29
 */
public class Leaf extends Component {
    @Override
    public void operation() {
        System.out.println(this);
    }

    @Override
    public void add(Component component) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void remove(Component component) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ArrayList<Component> getChildren() {
        throw new UnsupportedOperationException();
    }
}
