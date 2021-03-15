package com.yh.dao;

import com.yh.entity.User;
import com.yh.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @Author: yh
 * @Description:
 * @Date: Created in 2021/1/25 13:44
 * @Version：
 */
public class UserDaoTest {
    @Test
    public void Test() {
        //第一步：获取sqlsession对象
        SqlSession sqlSession = MybatisUtils.getSession();
        //执行sql
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        List<User> userList = mapper.getUserList();
        for (User user : userList) {
            System.out.println(user);
        }
        User userById = mapper.getUserById(1);
        System.out.println(userById);
        sqlSession.close();
    }
}
