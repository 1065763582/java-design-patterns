package com.lizq.design.creational.factory.simple;

/**
 * 应用层
 *
 * @author lizq
 * @date 2019-01-06 11:34
 */
public class Application {
    public static void main(String[] args) {
        Student student = StudenFactory.getStudent("java");
        student.study();
    }
}
