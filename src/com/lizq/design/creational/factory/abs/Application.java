package com.lizq.design.creational.factory.abs;

import com.lizq.design.model.HomeWork;
import com.lizq.design.model.Student;
import com.lizq.design.model.Teacher;

/**
 * 应用层
 *
 * @author lizq
 * @date 2019-01-08 22:50
 */
public class Application {
    public static void main(String[] args) {
        CourseFactory courseFactory = new JavaCourseFactory();
        Teacher teacher = courseFactory.getTeacher();
        teacher.teach();
        Student student = courseFactory.getStudent();
        student.study();
        HomeWork homeWork = courseFactory.getHomeWork();
        homeWork.desc();
    }
}
