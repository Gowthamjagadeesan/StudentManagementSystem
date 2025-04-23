package com.cts.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "student_info")
@Data
public class Student {
	@Id
	@GeneratedValue
	@Column(name = "student_id")
	private int studentId;
	@Column(name = "student_name")
	private String studentName;
	@Column(name = "student_dept")
	private String studentDept;
	@Column(name = "student_address")
	private String studentAddress;
	@Column(name = "student_fees")
	private int studentFees;
	@Column(name = "student_college")
	private String studentCollege;
	@Column(name = "student_fees_status")
	private String studentFeesStatus;

	public Student() {

	}

	public Student(String studentName, String studentDept, String studentAddress, int studentFees,
			String studentCollege) {
		super();

		this.studentName = studentName;
		this.studentDept = studentDept;
		this.studentAddress = studentAddress;
		this.studentFees = studentFees;
		this.studentCollege = studentCollege;
	}

}
