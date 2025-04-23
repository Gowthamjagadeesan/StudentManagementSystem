package com.cts.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

	public abstract List<Student> findByStudentFeesStatus(String status);

	public abstract List<Student> findByStudentCollege(String college);

	public abstract List<Student> findByStudentAddress(String address);

	public abstract List<Student> findByStudentDept(String dept);

}
