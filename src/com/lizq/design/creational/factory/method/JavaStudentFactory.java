package com.lizq.design.creational.factory.method;

import com.lizq.design.model.JavaStudent;
import com.lizq.design.model.Student;

/**
 * java同学工厂
 *
 * @author lizq
 * @date 2019-01-06 22:49
 */
public class JavaStudentFactory implements StudentFactory {
    @Override
    public Student getStudent() {
        return new JavaStudent();
    }
}
