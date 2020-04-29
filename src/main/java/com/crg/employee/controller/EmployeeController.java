package com.crg.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.crg.employee.model.Employee;
import com.crg.employee.model.EmployeeDto;
import com.crg.employee.service.EmployeeService;
import com.crg.redbus.businfo.model.ApiResponse;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public ApiResponse<Employee> saveEmployee(@RequestBody EmployeeDto employee){
        return new ApiResponse<>(HttpStatus.OK.value(), "Employee saved successfully.",employeeService.save(employee));
    }

    @GetMapping
    public ApiResponse<List<Employee>> listEmployee(){
        return new ApiResponse<>(HttpStatus.OK.value(), "Employee list fetched successfully.",employeeService.findAll());
    }

    @GetMapping("/{id}")
    public ApiResponse<Employee> getOne(@PathVariable int id){
        return new ApiResponse<>(HttpStatus.OK.value(), "Employee fetched successfully.",employeeService.findById(id));
    }

    @PutMapping("/{id}")
    public ApiResponse<EmployeeDto> update(@RequestBody EmployeeDto employeeDto) {
        return new ApiResponse<>(HttpStatus.OK.value(), "Employee updated successfully.",employeeService.update(employeeDto));
    }

    @DeleteMapping("/{id}")
    public ApiResponse<Void> delete(@PathVariable int id) {
       employeeService.delete(id);
        return new ApiResponse<>(HttpStatus.OK.value(), "Employee fetched successfully.", null);
    }



    
}
