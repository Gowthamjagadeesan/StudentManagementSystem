package com.cts.service;

import java.util.List;

import com.cts.model.Student;

public interface StudentService {

	public abstract String createStudent(Student student);
	
	public abstract Student updateStudent(Student student);
	
	public abstract String removeStudent(int studentId);
	
	public abstract Student getStudent(int studentId);
	
	public abstract List<Student> getStudentByStatus(String status);
	
	public abstract List<Student> getStudentByDept(String dept);
	
	public abstract List<Student> getStudentByAddress(String address);
	
	public abstract List<Student> getStudentByCollege(String college);
}
