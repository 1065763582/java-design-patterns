package com.lizq.design.creational.prototype;

import com.lizq.design.model.JavaTeacher;

/**
 * 应用层
 *
 * @author lizq
 * @date 2019-01-10 23:14
 */
public class Application {
    public static void main(String[] args) throws Exception{
        Room room = new Room();
        room.setTeacher(new JavaTeacher());
        System.out.println("原型hash：" + room.hashCode());
        System.out.println("原型属性hash：" + room.getTeacher().hashCode());
        System.out.println("=============================");
        for (int i = 0; i < 3; i++) {
            Room tmp = room.clone();
            System.out.println("浅拷贝hash：" + tmp.hashCode());
            System.out.println("浅拷贝属性hash：" + tmp.getTeacher().hashCode());
        }
        System.out.println("=============================");
        for (int i = 0; i < 3; i++) {
            Room tmp = room.deepClone();
            System.out.println("深拷贝hash：" + tmp.hashCode());
            System.out.println("深拷贝属性hash：" + tmp.getTeacher().hashCode());
        }
    }
}
