package com.crg.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crg.dao.SearchDao;
import com.crg.model.BusList;


import com.crg.service.SearchService;



@Service(value = "searchService")
public class SearchServiceImpl implements SearchService {

	
	@Autowired
	private SearchDao searchDao;

	@Override
	public List<BusList> findAll() {
		List<BusList> list =new ArrayList<>();
		searchDao.findAll().iterator().forEachRemaining(list::add);
		return list;
	}
}
