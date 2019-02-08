package com.lizq.design.behavioral.visitor;

/**
 *
 * 访问者接口
 * 此时若BusinessA或BusinessB被修改，可能就导致所有实现此接口的访问者全部都要修改
 * @author lizq
 * @date 2019/02/08 17:51
 */
public interface Visitor {
    void visitor(BusinessA a);

    void visitor(BusinessB b);
}
