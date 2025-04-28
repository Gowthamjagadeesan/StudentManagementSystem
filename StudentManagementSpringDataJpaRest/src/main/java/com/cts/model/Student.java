package com.cts.model;

import java.util.Date;

import org.hibernate.validator.constraints.NotBlank;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
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
	@NotBlank(message = "The Student name Should not be blank !!!")
	private String studentName;
	@NotNull
	@Size(min = 4, max = 30, message = "The length of the given data is not satisfied ")
	@Column(name = "student_dept")
	private String studentDept;
	@Column(name = "student_address")
	private String studentAddress;
	@Column(name = "student_fees")
	@Positive(message = "Enter a positive value")
	@Min(value = 10000, message = "the minimum ammount should be 10000")
	private int studentFees;
	@Column(name = "student_college")
	private String studentCollege;
	@Column(name = "student_fees_status")
	@NotBlank(message = "The fees status sould not be blank")
	private String studentFeesStatus;
	@Past(message = "Enter the correct Date Of Admission")
	private Date admissionDate;

	public Student() {

	}
	

	public Student(@NotBlank(message = "The Student name Should not be blank !!!") String studentName,
			@NotNull @Size(min = 4, max = 30, message = "The length of the given data is not satisfied ") String studentDept,
			String studentAddress,
			@Positive(message = "Enter a positive value") @Min(value = 10000, message = "the minimum ammount should be 10000") int studentFees,
			String studentCollege, @NotBlank(message = "The fees status sould not be blank") String studentFeesStatus,
			@Past Date admissionDate) {
		super();
		this.studentName = studentName;
		this.studentDept = studentDept;
		this.studentAddress = studentAddress;
		this.studentFees = studentFees;
		this.studentCollege = studentCollege;
		this.studentFeesStatus = studentFeesStatus;
		this.admissionDate = admissionDate;
	}

}
