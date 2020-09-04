package com.edward.gmall.user.service.impl;

import com.edward.gmall.user.bean.UmsMember;
import com.edward.gmall.user.mapper.UserMapper;
import com.edward.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ChenGuiHong
 * @create 2020-09-04  11:54
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserMapper userMapper;


    @Override
    public List<UmsMember> getAllUser() {

        List<UmsMember> umsMembers = userMapper.selectAll();
        return umsMembers;
    }
}
