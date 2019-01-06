package com.lizq.design.creational.factory.method;

import com.lizq.design.model.Student;

/**
 * 学生工厂
 *
 * @author lizq
 * @date 2019-01-06 22:46
 */
public interface StudentFactory {

    /**
     * 返回某个学生
     * @return
     */
    Student getStudent();
}
