package com.lizq.design.creational.factory.simple;

import com.lizq.design.model.Student;

/**
 * 应用层
 *
 * @author lizq
 * @date 2019-01-06 11:34
 */
public class Application {
    public static void main(String[] args) {
        Student student = StudentFactory.getStudent("java");
        student.study();
    }
}
