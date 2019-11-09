package com.vainglory.controller;

import com.alibaba.fastjson.JSON;
import com.vainglory.pojo.User;
import com.vainglory.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author vaingloryss
 * @date 2019/11/8 0008 下午 7:32
 */
@Slf4j
@RestController
@RequestMapping(value = {"userController"})
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = {"userList"})
    public String userList() throws Exception {
        log.info("Controller层日志：UserController.userList");
        List<User> userList = userService.userList();
        return JSON.toJSONString(userList);
    }
}
