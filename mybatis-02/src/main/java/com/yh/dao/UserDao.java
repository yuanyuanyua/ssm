package com.yh.dao;

import com.yh.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author: yh
 * @Description:
 * @Date: Created in 2021/1/25 13:36
 * @Version：
 */
public interface UserDao {
    List<User> getUserList();

    @Select("select * from user where id=#{id}")
    User getUserById(@Param("id") int id);
}
