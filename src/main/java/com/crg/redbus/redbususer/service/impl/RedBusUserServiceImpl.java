package com.crg.redbus.redbususer.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crg.redbus.redbususer.dao.RedBusUserDao;
import com.crg.redbus.redbususer.model.RedbusUser;
import com.crg.redbus.redbususer.model.RedbusUserDto;
import com.crg.redbus.redbususer.service.RedBusUserService;



@Service(value = "redBusUserService")
public class RedBusUserServiceImpl implements RedBusUserService {
	
	@Autowired
	private RedBusUserDao redBusUserDao;

	@Override
	public RedbusUser save(RedbusUserDto userDetails) {
		
		RedbusUser newUser = new RedbusUser();
		    newUser.setUserName(userDetails.getUserName());
		    newUser.setDob(userDetails.getDob());
		    newUser.setGender(userDetails.getGender());
		    newUser.setEmail(userDetails.getEmail());
		    newUser.setPhoneNumber(userDetails.getPhoneNumber());
		    newUser.setUserStatus(userDetails.getUserStatus());
	        return redBusUserDao.save(newUser);
		
	}

}
