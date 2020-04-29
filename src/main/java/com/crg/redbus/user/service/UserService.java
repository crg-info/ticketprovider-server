package com.crg.redbus.user.service;

import java.util.List;

import com.crg.redbus.user.model.User;
import com.crg.redbus.user.model.UserDto;

public interface UserService {

    User save(UserDto user);
    List<User> findAll();
    void delete(int id);

    User findOne(String username);

    User findById(int id);
    
	User findBySalary(int salary);
	
	UserDto update(UserDto userDto);
	
	
	
	
    
   

    
}
