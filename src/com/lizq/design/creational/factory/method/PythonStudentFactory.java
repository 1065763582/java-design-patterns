package com.lizq.design.creational.factory.method;

import com.lizq.design.model.PythonStudent;
import com.lizq.design.model.Student;

/**
 * python同学工厂
 *
 * @author lizq
 * @date 2019-01-06 22:49
 */
public class PythonStudentFactory implements StudentFactory {
    @Override
    public Student getStudent() {
        return new PythonStudent();
    }
}
