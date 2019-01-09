package com.lizq.design.creational.factory.abs;

import com.lizq.design.model.*;

/**
 * @author lizq
 * @date 2019-01-08 22:48
 */
public class PythonCourseFactory implements CourseFactory {
    @Override
    public Student getStudent() {
        return new PythonStudent();
    }

    @Override
    public Teacher getTeacher() {
        return new PythonTeacher();
    }

    @Override
    public HomeWork getHomeWork() {
        return new PyhonHomeWork();
    }
}
