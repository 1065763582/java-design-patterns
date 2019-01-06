package com.lizq.design.creational.factory.method;

import com.lizq.design.model.Student;

/**
 * 应用层
 *
 * @author lizq
 * @date 2019-01-06 22:52
 */
public class Application {
    public static void main(String[] args) {
        StudentFactory studentFactory = new JavaStudentFactory();
        Student student = studentFactory.getStudent();
        student.study();
    }
}
