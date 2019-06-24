package com.yzy.demo.lwl.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.yzy.demo.lwl.model.UserDomain;
 
/**
 * Created by Andy on 2016/10/30.
 */
public interface UserDao extends JpaRepository<UserDomain, Long> {
    /**
     * 根据用户名称查询用户
     * @param userNo
     * @return
     */
    UserDomain findByUserNo(String userNo);
}