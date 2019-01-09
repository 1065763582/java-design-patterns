package com.lizq.design.creational.factory.abs;

import com.lizq.design.model.HomeWork;
import com.lizq.design.model.Student;
import com.lizq.design.model.Teacher;

/**
 * 课堂抽象
 *
 * @author lizq
 * @date 2019-01-08 22:38
 */
public interface CourseFactory {
    /**
     * 获取上课的学生
     * @return
     */
    Student getStudent();

    /**
     * 获取上课的老师
     * @return
     */
    Teacher getTeacher();

    /**
     * 获取家庭作业
     * @return
     */
    HomeWork getHomeWork();
}
