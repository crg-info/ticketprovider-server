package com.crg.redbus.travels.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crg.redbus.businfo.model.ApiResponse;
import com.crg.redbus.travels.service.TravelService;

@RestController
@RequestMapping("/")
public class TravelController {

	
	 @Autowired
	    private TravelService travelService;
	 
//	 @PostMapping
//	 public ApiResponse<Travel> saveTravel(@RequestBody TravelDto travel){
//		 return new ApiResponse<>(HttpStatus.OK.value(), "travel saved successfully.", travelService.save(travel));
//	 }
//	 
//	 @GetMapping
//	 public ApiResponse<List<Travel>> listTravel(){
//		 return new ApiResponse<>(HttpStatus.OK.value(),"travel list fetched successfully.",travelService.findAll());
//	 }
//	 
//	 @PutMapping("/")
//	 public ApiResponse<TravelDto> update(@RequestBody TravelDto travelDto){
//		 return new ApiResponse<>(HttpStatus.OK.value(),"travel update successfully",travelService.update(travelDto));
//	 }
//	@DeleteMapping("/")
//	public new ApiResponse<void> delete(@PathVariable int id) {
//		travelService.delete(id);
//		return new ApiResponse<>(HttpStatus.OK.value(),"travel deleted successfully", null);
//	}
}
