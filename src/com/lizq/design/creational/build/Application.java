package com.lizq.design.creational.build;

import com.lizq.design.model.JavaCourse;

public class Application {
    public static void main(String[] args) {
        Director director = new Director();
        JavaCourseBuilder javaCourseBuilder = new JavaCourseBuilderImpl();
        JavaCourse javaCourse = director.buildJavaCourse(javaCourseBuilder);
        System.out.println(javaCourse.toString());
    }
}
