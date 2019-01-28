package com.lizq.design.behavioral.responsebility;

/**
 * @author lizq
 * @date 2019/01/28 21:38
 */
public class Request {

    private Level level;

    private Object params;

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public Object getParams() {
        return params;
    }

    public void setParams(Object params) {
        this.params = params;
    }
}
