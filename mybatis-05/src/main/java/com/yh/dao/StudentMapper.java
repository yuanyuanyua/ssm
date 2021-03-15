package com.yh.dao;

import com.yh.entity.Student;

import java.util.List;

/**
 * @Author: yh
 * @Description:
 * @Date: Created in 2021/1/25 18:07
 * @Version：
 */
public interface StudentMapper {
    public List<Student> getStudent();

    public List<Student> getStudent2();
}
