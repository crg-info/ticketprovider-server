package com.crg.redbus.businfo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crg.redbus.businfo.dao.BusinfoDao;
import com.crg.redbus.businfo.model.Admin;
import com.crg.redbus.businfo.model.BusList;
import com.crg.redbus.businfo.service.BusinfoService;
import com.crg.redbus.user.model.User;



@Service(value = "businfoService")
public class BusinfoServiceImpl implements BusinfoService {

	
	@Autowired
	private BusinfoDao businfoDao;

	@Override
	public List<BusList> findAll() {
		List<BusList> list =new ArrayList<>();
		businfoDao.findAll().iterator().forEachRemaining(list::add);
		return list;
	}

	@Override
	public Admin findBussessById(int id) {
		Admin admin = businfoDao.findBussessById(id);
		return admin;
		
	}
}
