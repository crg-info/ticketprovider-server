package com.crg.employee.model;

public class StudentDto {

	 private int id;
	    private String firstName;
	    private String lastName;
	    private String studentname;
	    private String password;
	    private String branch;
	    private int rollno;
	    
	 public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getFirstName() {
	        return firstName;
	    }

	    public void setFirstName(String firstName) {
	        this.firstName = firstName;
	    }

	    public String getLastName() {
	        return lastName;
	    }

	    public void setLastName(String lastName) {
	        this.lastName = lastName;
	    }

	    public String getStudentname() {
	        return studentname;
	    }

	    public void setStudentname(String studentname) {
	        this.studentname = studentname;
	    }

	    public String getPassword() {
	        return password;
	    }

	    public void setPassword(String password) {
	        this.password = password;
	    }

	    public String getBranch() {
	        return branch;
	    }

	    public void setBranch(String branch) {
	        this.branch = branch;
	    }

	    public int getRollno() {
	        return rollno;
	    }

	    public void setRollno(int rollno) {
	        this.rollno = rollno;
	    }
}
