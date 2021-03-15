package com.yh.dao;

import com.yh.entity.User;

import java.util.List;

/**
 * @Author: yh
 * @Description:
 * @Date: Created in 2021/1/25 13:36
 * @Version：
 */
public interface UserDao {
    List<User> getUserList();

    User getUserById(int id);
}
