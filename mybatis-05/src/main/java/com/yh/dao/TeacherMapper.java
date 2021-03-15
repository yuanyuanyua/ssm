package com.yh.dao;

import com.yh.entity.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @Author: yh
 * @Description:
 * @Date: Created in 2021/1/25 18:07
 * @Version：
 */
public interface TeacherMapper {
    Teacher getTeacher(@Param("id") int id);
}
