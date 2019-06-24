package com.yzy.demo.lwl.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yzy.demo.lwl.model.UserDomain;
import com.yzy.demo.lwl.service.UserService;
 
/**
 * Created by Andy on 2016/10/26.
 */
@RestController
@RequestMapping(value = "/")
public class Controller {
    @Autowired
    private UserService userService;
 
    /**
     * hello word
     * @return
     */
    @RequestMapping(value = "/hello")
    public String sayHello(){
        return "Hello word";
    }
 
    /**
     * 根据用户编号获取用户信息
     * @param userNo
     * @return
     */
    @RequestMapping(value = "/getUserByNo")
    public UserDomain getUserByNo(String userNo){
        UserDomain user=null;
        try {
            user=userService.findUserByUserNo(userNo);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }
}