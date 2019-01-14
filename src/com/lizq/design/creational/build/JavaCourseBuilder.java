package com.lizq.design.creational.build;

import com.lizq.design.model.JavaCourse;
import com.lizq.design.model.Student;
import com.lizq.design.model.Teacher;

import java.util.Date;
import java.util.List;

public interface JavaCourseBuilder {

    void buildRoomNumber(String roomNumber);

    void buildTeacher(Teacher teacher);

    void buildStudents(List<? extends Student> students);

    void buildExamTime(Date examTime);

    JavaCourse getJavaCourse();

}
