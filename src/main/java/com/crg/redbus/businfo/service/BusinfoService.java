package com.crg.redbus.businfo.service;

import java.util.List;

import com.crg.redbus.businfo.model.Admin;
import com.crg.redbus.businfo.model.BusList;

public interface BusinfoService {

	 List<BusList> findAll();

	Admin findBussessById(int id);

}
