package com.lizq.design.model;

import java.io.Serializable;

/**
 * 教师抽象
 *
 * @author lizq
 * @date 2019-01-08 22:34
 */
public interface Teacher extends Serializable {
    /**
     * 传授知识....
     */
    void teach();
}
