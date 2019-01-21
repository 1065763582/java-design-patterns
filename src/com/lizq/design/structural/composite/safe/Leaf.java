package com.lizq.design.structural.composite.safe;

/**
 * @author lizq
 * @date 2019/01/21 21:29
 */
public class Leaf extends Component {
    @Override
    public void operation() {
        System.out.println(this);
    }
}
