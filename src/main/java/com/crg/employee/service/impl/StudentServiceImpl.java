package com.crg.employee.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.crg.employee.dao.StudentDao;
import com.crg.employee.model.Student;
import com.crg.employee.model.StudentDto;
import com.crg.employee.service.StudentService;


@Service(value = "studentService")
public class StudentServiceImpl implements StudentService {

	
	@Autowired
	private StudentDao studentDao;

	@Autowired
	private BCryptPasswordEncoder bcryptEncoder;
	
	@SuppressWarnings("unused")
	private List<SimpleGrantedAuthority> getAuthority() {
		return Arrays.asList(new SimpleGrantedAuthority("ROLE_ADMIN"));
	}

	public List<Student> findAll() {
		List<Student> list = new ArrayList<>();
		studentDao.findAll().iterator().forEachRemaining(list::add);
		return list;
	}

	@Override
	public void delete(int id) {
		studentDao.deleteById(id);
	}
	
	@Override
	public Student findOne(String studentname) {
		return studentDao.findByStudentname(studentname);
	}

	@Override
	public Student findById(int id) {
		Optional<Student> optionalStudent = studentDao.findById(id);
		return optionalStudent.isPresent() ? optionalStudent.get() : null;
	}

    @Override
    public StudentDto update(StudentDto studentDto) {
       Student student = findById(studentDto.getId());
        if(student != null) {
            BeanUtils.copyProperties(studentDto, student, "password");
            studentDao.save(student);
        }
        return studentDto;
    }

	
	@Override
	public Student save(StudentDto student) {
		Student newStudent = new Student();
	    newStudent.setStudentname(student.getStudentname());
	    newStudent.setFirstName(student.getFirstName());
	    newStudent.setLastName(student.getLastName());
	    newStudent.setPassword(bcryptEncoder.encode(student.getPassword()));
	    newStudent.setRollno(student.getRollno());
	    newStudent.setBranch(student.getBranch());
        return studentDao.save(newStudent);
    }
}
	