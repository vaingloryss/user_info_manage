package com.vainglory.service;

import com.vainglory.pojo.User;

import java.util.List;

/**
 * @author vaingloryss
 * @date 2019/11/8 0008 下午 7:36
 */
public interface UserService {
    List<User> userList() throws Exception;
}
