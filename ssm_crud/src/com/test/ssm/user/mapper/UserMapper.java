package com.test.ssm.user.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.test.ssm.user.model.User;
@Repository
public interface UserMapper {
	
	List<User> list();
 
    void del(int id);
 
    void update(User user);
 
    void add(User user);
 
    User get(int id);
    
}
