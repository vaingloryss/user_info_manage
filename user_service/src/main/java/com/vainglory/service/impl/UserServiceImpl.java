package com.vainglory.service.impl;

import com.vainglory.dao.UserDao;
import com.vainglory.pojo.User;
import com.vainglory.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author vaingloryss
 * @date 2019/11/8 0008 下午 8:52
 */
@Slf4j
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public List<User> userList() throws Exception {
        log.info("Service层日志：UserService.userList");
        return userDao.findAll();
    }
}
