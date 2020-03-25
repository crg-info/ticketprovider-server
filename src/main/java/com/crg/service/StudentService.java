package com.crg.service;

import java.util.List;

import com.crg.model.Student;
import com.crg.model.StudentDto;


public interface StudentService {

    Student save(StudentDto student);
    List<Student> findAll();
    void delete(int id);
    
    
    Student findOne(String studentname);

    Student findById(int id);

    StudentDto update(StudentDto studentDto);
    
}