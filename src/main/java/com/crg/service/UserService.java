package com.crg.service;

import java.util.List;

import com.crg.model.User;
import com.crg.model.UserDto;

public interface UserService {

    User save(UserDto user);
    List<User> findAll();
    void delete(int id);

    User findOne(String username);

    User findById(int id);
    
	User findBySalary(int salary);
	
	UserDto update(UserDto userDto);
	
	
	
	
    
   

    
}
