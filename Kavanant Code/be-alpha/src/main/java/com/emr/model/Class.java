package com.emr.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import java.util.List;
import lombok.Data;

@Data
@Entity
@Table(name = "class_table")
public class Class {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "class_Id")
	private Integer class_Id;

	@Column(name = "class_Name")
	private String class_Name;

	@Column(name = "class_Section")
	private String class_Section;

	@Column(name = "class_Stength")
	private Long class_stength;

	@OneToMany(targetEntity = Student.class, cascade = CascadeType.ALL)
	private List<Student> students;

}
