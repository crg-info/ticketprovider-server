package com.crg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crg.model.ApiResponse;
import com.crg.model.BusList;
import com.crg.service.SearchService;

@RestController
@RequestMapping("/searchBusses")
public class SearchController {

	 @Autowired
	    private SearchService searchService;
	
	 @GetMapping
	    public ApiResponse<List<BusList>> searchBus(){
	        return new ApiResponse<>(HttpStatus.OK.value(), "bus list coming successfully.",searchService.findAll());
	    }
	
}
