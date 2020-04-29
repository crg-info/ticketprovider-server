package com.crg.employee.dao;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crg.employee.model.Student;


@Repository
public interface StudentDao extends CrudRepository<Student, Integer> {
	
	Student findByStudentname(String studentname);
}
