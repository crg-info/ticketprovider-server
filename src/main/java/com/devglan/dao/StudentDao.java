package com.devglan.dao;


import com.devglan.model.Student;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentDao extends CrudRepository<Student, Integer> {
	
	Student findByStudentname(String studentname);
}
