package com.crg.redbus.businfo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crg.redbus.businfo.model.Admin;
import com.crg.redbus.businfo.model.ApiResponse;
import com.crg.redbus.businfo.model.BusList;
import com.crg.redbus.businfo.service.BusinfoService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/businfo")
public class BusinfoController {

	 @Autowired
	    private BusinfoService businfoService;
	
	 @GetMapping
	    public ApiResponse<List<BusList>> ListBusList(){
	        return new ApiResponse<>(HttpStatus.OK.value(), "bus list coming successfully.",businfoService.findAll());
	    }
	 @GetMapping
	    public ApiResponse<Admin> findBussessById(@PathVariable int id){
	        return new ApiResponse<>(HttpStatus.OK.value(), "Admin Busses coming successfully.",businfoService.findBussessById(id));
	    }
	
}
