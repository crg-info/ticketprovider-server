package com.crg.redbus.businfo.dao;

import org.springframework.data.repository.CrudRepository;

import com.crg.redbus.businfo.model.Admin;
import com.crg.redbus.businfo.model.BusList;

public interface BusinfoDao extends CrudRepository<BusList, Integer> {

	Admin findBussessById(int id);
	
	

	
}





