package com.crg.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.crg.dao.EmployeeDao;
import com.crg.model.Employee;
import com.crg.model.EmployeeDto;
import com.crg.service.EmployeeService;


@Service(value = "employeeService")
public class EmployeeServiceImpl implements EmployeeService {

	
	@Autowired
	private EmployeeDao employeeDao;

	@Autowired
	private BCryptPasswordEncoder bcryptEncoder;
	
	@SuppressWarnings("unused")
	private List<SimpleGrantedAuthority> getAuthority() {
		return Arrays.asList(new SimpleGrantedAuthority("ROLE_ADMIN"));
	}

	public List<Employee> findAll() {
		List<Employee> list = new ArrayList<>();
		employeeDao.findAll().iterator().forEachRemaining(list::add);
		return list;
	}

	@Override
	public void delete(int id) {
		employeeDao.deleteById(id);
	}
	
	@Override
	public Employee findOne(String employeename) {
		return employeeDao.findByEmployeename(employeename);
	}

	@Override
	public Employee findById(int id) {
		Optional<Employee> optionalEmployee = employeeDao.findById(id);
		return optionalEmployee.isPresent() ? optionalEmployee.get() : null;
	}

    @Override
    public EmployeeDto update(EmployeeDto employeeDto) {
       Employee employee = findById(employeeDto.getId());
        if(employee != null) {
            BeanUtils.copyProperties(employeeDto, employee, "password");
            employeeDao.save(employee);
        }
        return employeeDto;
    }

	
	@Override
	public Employee save(EmployeeDto employee) {
		Employee newEmployee = new Employee();
	    newEmployee.setEmployeename(employee.getEmployeename());
	    newEmployee.setFirstName(employee.getFirstName());
	    newEmployee.setLastName(employee.getLastName());
	    newEmployee.setPassword(bcryptEncoder.encode(employee.getPassword()));
		newEmployee.setAge(employee.getAge());
		newEmployee.setSalary(employee.getSalary());
        return employeeDao.save(newEmployee);
    }
		
	}


