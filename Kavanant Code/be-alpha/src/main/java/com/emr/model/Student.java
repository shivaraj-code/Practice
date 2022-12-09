package com.emr.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity

@Table(name = "student_table")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "stu_Id")
	private int stu_Id;

	@Column(name = "stu_RollNo")
	private int stu_RollNo;

	@Column(name = "stu_Name")
	private String stu_Name;

	@Column(name = "stu_Mail")
	private String stu_Mail;

	@Column(name = "stu_Add")
	private String stu_Add;

	@Column(name = "stu_Phone")
	private Long stu_Phone;
	
	@ManyToOne
	@JoinColumn(name="class_Id_FK")
	private Class classvariable;

}
