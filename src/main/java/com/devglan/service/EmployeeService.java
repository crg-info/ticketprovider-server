package com.devglan.service;

import java.util.List;

import com.devglan.model.Employee;
import com.devglan.model.EmployeeDto;


public interface EmployeeService {

    Employee save(EmployeeDto employee);
    List<Employee> findAll();
    void delete(int id);
    
    
    Employee findOne(String employeename);

    Employee findById(int id);

    EmployeeDto update(EmployeeDto employeeDto);
    
}