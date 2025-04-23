package com.cts.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.model.Student;
import com.cts.repository.StudentRepository;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository repository;

	@Override
	public String createStudent(Student student) {
		Student stu = repository.save(student);
		if (stu != null) {
			return "Student saved successfully";
		} else {
			return "Student not saved";
		}
	}

	@Override
	public Student updateStudent(Student student) {
		return repository.save(student);
	}

	@Override
	public String removeStudent(int studentId) {
		repository.deleteById(studentId);
		return "Student deleted successfully";
	}

	@Override
	public Student getStudent(int studentId) {
		Optional<Student> student = repository.findById(studentId);
		return student.get();
	}

	@Override
	public List<Student> getStudentByStatus(String status) {
		return repository.findByStudentFeesStatus(status);
	}

	@Override
	public List<Student> getStudentByDept(String dept) {
		return repository.findByStudentDept(dept);
	}

	@Override
	public List<Student> getStudentByAddress(String address) {
		return repository.findByStudentAddress(address);
	}

	@Override
	public List<Student> getStudentByCollege(String college) {
		return repository.findByStudentCollege(college);
	}

}
