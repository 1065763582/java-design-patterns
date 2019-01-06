package com.lizq.design.creational.factory.simple;

/**
 * 学生工厂类
 *
 * @author lizq
 * @date 2019-01-06 11:36
 */
public class StudenFactory {
    public static final String JAVA = "java";
    public static final String PYTHON = "python";

    /**
     * 返回某个学生
     * @param condition 条件
     * @return
     */
    public static Student getStudent(String condition){
        if(JAVA.equals(condition)){
            // do your something....
            return new JavaStudent();
        }else if (PYTHON.equals(condition)){
            // do your something....
            return new PythonStudent();
        }
        return null;
    }
}
