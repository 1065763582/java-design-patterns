package com.lizq.design.behavioral.visitor;

/**
 *
 * 可访问的元素，表示这个一个可以被访问者访问的元素
 * 可以用来控制哪些访问者能来访问此元素
 * @author lizq
 * @date 2019/02/08 17:49
 */
public interface Element {
    void visit(Visitor visitor);
}
