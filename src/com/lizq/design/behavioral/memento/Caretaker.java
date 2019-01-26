package com.lizq.design.behavioral.memento;

/**
 * 操作备忘录，备忘录的管理员
 * 只能保存一个时刻的快照
 * @author lizq
 * @date 2019/01/26 21:15
 */
public class Caretaker {
    //备忘录对象
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
