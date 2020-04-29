package com.crg.employee.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crg.employee.model.Employee;


@Repository
public interface EmployeeDao extends CrudRepository<Employee, Integer> {
	
	 Employee findByEmployeename(String employeename);
}
