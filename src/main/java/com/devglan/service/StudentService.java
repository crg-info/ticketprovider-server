package com.devglan.service;

import java.util.List;


import com.devglan.model.Student;
import com.devglan.model.StudentDto;


public interface StudentService {

    Student save(StudentDto student);
    List<Student> findAll();
    void delete(int id);
    
    
    Student findOne(String studentname);

    Student findById(int id);

    StudentDto update(StudentDto studentDto);
    
}