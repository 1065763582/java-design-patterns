package com.lizq.design.creational.build;

import com.lizq.design.model.JavaCourse;
import com.lizq.design.model.Student;
import com.lizq.design.model.Teacher;

import java.util.Date;
import java.util.List;

/**
 * @author lizq
 * @date 2019/01/14 22:36
 */
public class JavaCourseBuilderImpl implements JavaCourseBuilder {

    JavaCourse javaCourse = new JavaCourse();

    @Override
    public void buildRoomNumber(String roomNumber) {
        javaCourse.setRoomNumber(roomNumber);
    }

    @Override
    public void buildTeacher(Teacher teacher) {
        javaCourse.setTeacher(teacher);
    }

    @Override
    public void buildStudents(List<? extends Student> students) {
        javaCourse.setStudents(students);
    }

    @Override
    public void buildExamTime(Date examTime) {
        javaCourse.setExamTime(examTime);
    }

    @Override
    public JavaCourse getJavaCourse() {
        return javaCourse;
    }
}
