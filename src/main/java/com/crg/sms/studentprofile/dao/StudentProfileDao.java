package com.crg.sms.studentprofile.dao;

import org.springframework.data.repository.CrudRepository;


import com.crg.sms.studentprofile.model.SmsStudentProfile;

public interface StudentProfileDao extends CrudRepository<SmsStudentProfile, Integer> {

}
