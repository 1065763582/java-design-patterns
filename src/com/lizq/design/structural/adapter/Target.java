package com.lizq.design.structural.adapter;

/**
 * 需要适配的目标类，也许这时有一个新的需求场景，扩展了业务，要求新的数据用新的业务，旧的数据依然不变。
 * 这就要求Target接口和系统里的Adaptee同时在生产运行
 *
 * @author lizq
 * @date 2019/01/19 22:03
 */
public interface Target {
    void request();
}