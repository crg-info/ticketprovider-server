package com.crg.redbus.redbususer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crg.redbus.businfo.model.ApiResponse;
import com.crg.redbus.redbususer.model.RedbusUser;
import com.crg.redbus.redbususer.model.RedbusUserDto;
import com.crg.redbus.redbususer.service.RedBusUserService;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/redBusUsers")
public class RedBusUserController {

	
	 @Autowired
	    private RedBusUserService redBusUserService;
	 
	 @PostMapping
	    public ApiResponse<RedbusUser> saveRedbusUser(@RequestBody RedbusUserDto userDetails){
	        return new ApiResponse<>(HttpStatus.OK.value(), "RedBusUser saved successfully.",redBusUserService.save(userDetails));
	    }
}
