package com.vainglory.dao;

import com.vainglory.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author vaingloryss
 * @date 2019/11/8 0008 下午 8:36
 */
public interface UserDao {
    @Select("select * from tb_user")
    List<User> findAll();
}