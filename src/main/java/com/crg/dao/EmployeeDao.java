package com.crg.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crg.model.Employee;


@Repository
public interface EmployeeDao extends CrudRepository<Employee, Integer> {
	
	 Employee findByEmployeename(String employeename);
}
