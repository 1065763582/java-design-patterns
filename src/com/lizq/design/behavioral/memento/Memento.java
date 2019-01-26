package com.lizq.design.behavioral.memento;

/**
 *
 * 用于保存状态，内部属性一般和需要保存的对象一致
 * @author lizq
 * @date 2019/01/26 21:14
 */
public class Memento {
    //发起人的内部状态
    private String state;

    //构造函数传递参数
    public Memento(Originator originator) {
        this.state = originator.getState();
    }

    public String getState() {
        return state;
    }
}
