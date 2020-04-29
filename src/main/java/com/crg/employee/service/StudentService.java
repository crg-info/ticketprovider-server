package com.crg.employee.service;

import java.util.List;

import com.crg.employee.model.Student;
import com.crg.employee.model.StudentDto;


public interface StudentService {

    Student save(StudentDto student);
    List<Student> findAll();
    void delete(int id);
    
    
    Student findOne(String studentname);

    Student findById(int id);

    StudentDto update(StudentDto studentDto);
    
}