package com.lizq.design.creational.factory.abs;

import com.lizq.design.model.*;

/**
 * @author lizq
 * @date 2019-01-08 22:48
 */
public class JavaCourseFactory implements CourseFactory {
    @Override
    public Student getStudent() {
        return new JavaStudent();
    }

    @Override
    public Teacher getTeacher() {
        return new JavaTeacher();
    }

    @Override
    public HomeWork getHomeWork() {
        return new JavaHomeWork();
    }
}
