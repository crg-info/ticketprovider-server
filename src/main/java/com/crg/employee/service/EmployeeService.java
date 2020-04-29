package com.crg.employee.service;

import java.util.List;

import com.crg.employee.model.Employee;
import com.crg.employee.model.EmployeeDto;


public interface EmployeeService {

    Employee save(EmployeeDto employee);
    List<Employee> findAll();
    void delete(int id);
    
    
    Employee findOne(String employeename);

    Employee findById(int id);

    EmployeeDto update(EmployeeDto employeeDto);
    
}