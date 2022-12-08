package com.emp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "state_table")
public class State {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "state_Id")
	private Integer state_Id;

	@Column(name = "state_Name")
	private String state_Name;

	@Column(name = "state_Code")
	private String state_Code;

	public Integer getState_Id() {
		return state_Id;
	}

	public void setState_Id(Integer state_Id) {
		this.state_Id = state_Id;
	}

	public String getState_Name() {
		return state_Name;
	}

	public void setState_Name(String state_Name) {
		this.state_Name = state_Name;
	}

	public String getState_Code() {
		return state_Code;
	}

	public void setState_Code(String state_Code) {
		this.state_Code = state_Code;
	}

}
