package com.test.ssm.user.service;

import java.util.List;

import com.test.ssm.user.model.User;


public interface UserService {
 
    List<User> list();
    void delUser(int id);
    void updateUser(User user);
    void addUser(User user);
    User get(int id);	

}
