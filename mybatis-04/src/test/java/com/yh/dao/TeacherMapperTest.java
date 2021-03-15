package com.yh.dao;

import com.yh.entity.Student;
import com.yh.entity.Teacher;
import com.yh.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;
//import org.junit.Test;

/**
 * @Author: yh
 * @Description:
 * @Date: Created in 2021/1/25 18:25
 * @Version：
 */
public class TeacherMapperTest {
    @Test
    public void Test() {
        SqlSession sqlSession = MybatisUtils.getSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher(1);
        System.out.println(teacher);
        sqlSession.close();
    }

    @Test
    public void StudentTest() {
        SqlSession sqlSession = MybatisUtils.getSession();
        StudentMapper mapper1 = sqlSession.getMapper(StudentMapper.class);
        List<Student> student = mapper1.getStudent();
        for (Student student1 : student) {
            System.out.println(student1);
        }
        sqlSession.close();
    }

    @Test
    public void StudentTest2() {
        SqlSession sqlSession = MybatisUtils.getSession();
        StudentMapper mapper1 = sqlSession.getMapper(StudentMapper.class);
        List<Student> student = mapper1.getStudent2();
        for (Student student1 : student) {
            System.out.println(student1);
        }
        sqlSession.close();
    }

}
