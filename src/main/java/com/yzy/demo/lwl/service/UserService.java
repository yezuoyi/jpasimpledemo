package com.yzy.demo.lwl.service;

import com.yzy.demo.lwl.model.UserDomain;

/**
 * Created by Andy on 2016/10/30.
 */
 
public interface UserService {
    /**
     * 根据用户编号获取用户信息
     * @param userNo
     * @return
     */
    UserDomain findUserByUserNo(String userNo);
}