package com.lizq.design.model;

import java.util.Date;
import java.util.List;

/**
 * Java课程类
 * @author lizq
 * @date 2019/01/14 22:27
 */
public class JavaCourse {
    // 教师门牌号
    private String roomNumber;
    // 一个老师
    private Teacher teacher;
    // 一群学生
    private List<? extends Student> students;
    // 考试时间
    private Date examTime;

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<? extends Student> getStudents() {
        return students;
    }

    public void setStudents(List<? extends Student> students) {
        this.students = students;
    }

    public Date getExamTime() {
        return examTime;
    }

    public void setExamTime(Date examTime) {
        this.examTime = examTime;
    }

    @Override
    public String toString() {
        return "JavaCourse{" +
                "roomNumber='" + roomNumber + '\'' +
                ", teacher=" + teacher.toString() +
                ", students=" + students.size() +
                ", examTime=" + examTime +
                '}';
    }
}
