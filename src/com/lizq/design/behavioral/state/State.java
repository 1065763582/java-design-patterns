package com.lizq.design.behavioral.state;

/**
 * @author lizq
 * @date 2019/01/26 19:21
 */
public abstract class State implements StateOperation {
    //定义一个环境角色，提供子类访问
    protected Context context;

    //设置环境角色
    public void setContext(Context context) {
        this.context = context;
    }
}
