package com.lizq.design.creational.build;

import com.lizq.design.model.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 指挥类
 * @author lizq
 * @date 2019/01/13 21:37
 */
public class Director {

    public JavaCourse buildJavaCourse(JavaCourseBuilder builder) {
        builder.buildExamTime(new Date());
        builder.buildRoomNumber("1234567");
        builder.buildTeacher(new JavaTeacher());
        List<JavaStudent> students = new ArrayList<>();
        builder.buildStudents(students);
        return builder.getJavaCourse();
    }

}
