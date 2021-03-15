package com.yh.dao;

import com.yh.entity.Teacher;
import com.yh.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @Author: yh
 * @Description:
 * @Date: Created in 2021/1/25 21:31
 * @Version：
 */
public class TeacherTest {
    @Test
    public void Test() {
        SqlSession sqlSession = MybatisUtils.getSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher(1);
        System.out.println(teacher);
        sqlSession.close();
    }
}
