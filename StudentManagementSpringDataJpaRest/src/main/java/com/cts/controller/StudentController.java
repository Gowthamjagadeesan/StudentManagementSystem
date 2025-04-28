package com.cts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.exception.StudentNotFoundExcepttion;
import com.cts.model.Student;
import com.cts.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	StudentService service;

	@PostMapping("/create") // http://localhost:6666/student/create
	public String createStudent(@Validated @RequestBody Student student) {
		return service.createStudent(student);
	}

	@PutMapping("/update") // http://localhost:6666/student/update
	public Student updateStudent(@RequestBody Student student) {
		return service.updateStudent(student);
	}

	@DeleteMapping("/delete/{sid}") // http://localhost:6666/student/delete
	public String removeStudent(@PathVariable("sid") int studentId) {
		return service.removeStudent(studentId);
	}

	@GetMapping("/getById/{sid}") // http://localhost:6666/student/getById
	public Student retrieveStudent(@PathVariable("sid") int studentId) throws StudentNotFoundExcepttion {
		return service.getStudent(studentId);
	}

	@GetMapping("/getByStatus/{status}") // http://localhost:6666/student/getByStatus
	public List<Student> retrieveStudentByStatus(@PathVariable("status") String status) {
		return service.getStudentByStatus(status);
	}

	@GetMapping("/getByDept/{dept}") // http://localhost:6666/student/getByDept
	public List<Student> retrieveStudentByDept( @PathVariable("dept") String dept) {
		return service.getStudentByDept(dept);
	}

	@GetMapping("/getByAddress/{add}") // http://localhost:6666/student/getByAddress
	public List<Student> retrieveStudentByAddress(@PathVariable("add") String Address) {
		return service.getStudentByAddress(Address);
	}

	@GetMapping("/getByCollege/{college}") // http://localhost:6666/student/getByCollege
	public List<Student> retrieveStudentByCollege(@PathVariable("college") String college) {
		return service.getStudentByCollege(college);
	}

}
