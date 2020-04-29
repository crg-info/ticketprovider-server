package com.crg.sms.studentprofile.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.crg.redbus.businfo.model.ApiResponse;

import com.crg.sms.studentprofile.model.SmsStudentProfile;
import com.crg.sms.studentprofile.model.SmsStudentProfileDto;
import com.crg.sms.studentprofile.service.StudentProfileService;

@RestController
@RequestMapping("/smsStudentProfiles")
public class StudentProfileController {

	@Autowired
	private StudentProfileService studentProfileService;
	
	 @PostMapping
	    public  ApiResponse<SmsStudentProfile> saveStudentProfile(@RequestBody SmsStudentProfileDto studentProfile){
	        return new ApiResponse<>(HttpStatus.OK.value(), "Student saved successfully.",studentProfileService.save(studentProfile));
	    }
}
