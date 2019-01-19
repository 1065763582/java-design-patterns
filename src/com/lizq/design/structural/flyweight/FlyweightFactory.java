package com.lizq.design.structural.flyweight;

import java.util.HashMap;

/**
 * @author lizq
 * @date 2019/01/19 20:59
 */
public class FlyweightFactory {
    private HashMap<String, Flyweight> flyweights = new HashMap<>();

    public Flyweight getFlyweight(String key) {
        //如果对象存在，则直接从享元池获取
        if (flyweights.containsKey(key)) {
            return (Flyweight) flyweights.get(key);
        }
        //如果对象不存在，先创建一个新的对象添加到享元池中，然后返回
        else {
            Flyweight fw = new Flyweight();
            flyweights.put(key, fw);
            return fw;
        }
    }
}
