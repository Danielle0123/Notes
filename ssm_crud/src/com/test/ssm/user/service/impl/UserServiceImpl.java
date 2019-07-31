package com.test.ssm.user.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.test.ssm.user.mapper.UserMapper;
import com.test.ssm.user.model.User;
import com.test.ssm.user.service.UserService;

@Service
public class UserServiceImpl implements UserService{
 
    @Autowired
    UserMapper userMapper;
    public List<User> list() {
        return userMapper.list();
    }
    public void addUser(User user) {
        userMapper.add(user);
    }
    public void delUser(int id) {
        userMapper.del(id);
    }
    public void updateUser(User user) {
        userMapper.update(user);
    }
    public User get(int id) {
        return userMapper.get(id);
    }
 
}