package com.lizq.design.creational.prototype;

import com.lizq.design.model.Teacher;

import java.io.*;

/**
 * 教室类
 *
 * @author lizq
 * @date 2019-01-10 23:05
 */
public class Room implements Cloneable, Serializable {
    /**
     * 课程名称
     */
    private String courseName;
    /**
     * 教室人数
     */
    private int count;

    private Teacher teacher;

    /**
     * 浅拷贝的实现
     * @return
     * @throws CloneNotSupportedException
     */

    @Override
    public Room clone() throws CloneNotSupportedException {
        return (Room)super.clone();
    }

    /**
     * 深拷贝模式
     * @return
     * @throws Exception
     */
    public Room deepClone() throws Exception {
        //将对象写入流中
        ByteArrayOutputStream bao=new ByteArrayOutputStream();
        ObjectOutputStream oos=new ObjectOutputStream(bao);
        oos.writeObject(this);
        //将对象从流中取出
        ByteArrayInputStream bis=new ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois=new ObjectInputStream(bis);
        return (Room)ois.readObject();
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
