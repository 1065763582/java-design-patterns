package com.lizq.design.behavioral.template;

/**
 * @author lizq
 * @date 2019/01/23 22:01
 */
public interface Process {
    default void stepOne() {
        System.out.println("start 1....");
    }

    default void stepTwo() {
    }

    void stepThree();

    //钩子方法， 根据条件判断第二步是否执行
    default boolean hook() {
        return true;
    }
}
