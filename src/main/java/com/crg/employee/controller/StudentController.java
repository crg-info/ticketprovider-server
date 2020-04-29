package com.crg.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.crg.employee.model.Student;
import com.crg.employee.model.StudentDto;
import com.crg.employee.service.StudentService;
import com.crg.redbus.businfo.model.ApiResponse;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping
    public ApiResponse<Student> saveStudent(@RequestBody StudentDto student){
        return new ApiResponse<>(HttpStatus.OK.value(), "Student saved successfully.",studentService.save(student));
    }

    @GetMapping
    public ApiResponse<List<Student>> listStudent(){
        return new ApiResponse<>(HttpStatus.OK.value(), "Student list fetched successfully.",studentService.findAll());
    }

    @GetMapping("/{id}")
    public ApiResponse<Student> getOne(@PathVariable int id){
        return new ApiResponse<>(HttpStatus.OK.value(), "Student fetched successfully.",studentService.findById(id));
    }

    @PutMapping("/{id}")
    public ApiResponse<StudentDto> update(@RequestBody StudentDto studentDto) {
        return new ApiResponse<>(HttpStatus.OK.value(), "Student updated successfully.",studentService.update(studentDto));
    }

    @DeleteMapping("/{id}")
    public ApiResponse<Void> delete(@PathVariable int id) {
       studentService.delete(id);
        return new ApiResponse<>(HttpStatus.OK.value(), "Student fetched successfully.", null);
    }



    
}
