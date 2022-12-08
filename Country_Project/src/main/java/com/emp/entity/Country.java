package com.emp.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "country_table")
public class Country {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "country_Id")
	private Integer country_Id;

	@Column(name = "country_Name")
	private String counry_Name;

	@Column(name = "country_Capital")
	private String country_Capital;

	@Column(name = "country_code")
	private String country_Code;

	@OneToOne(targetEntity = State.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "country_Id_FK", referencedColumnName = "country_Id")
	private List<State> states;

	public Integer getCountry_Id() {
		return country_Id;
	}

	public void setCountry_Id(Integer country_Id) {
		this.country_Id = country_Id;
	}

	public String getCounry_Name() {
		return counry_Name;
	}

	public void setCounry_Name(String counry_Name) {
		this.counry_Name = counry_Name;
	}

	public String getCountry_Capital() {
		return country_Capital;
	}

	public void setCountry_Capital(String country_Capital) {
		this.country_Capital = country_Capital;
	}

	public String getCountry_Code() {
		return country_Code;
	}

	public void setCountry_Code(String country_Code) {
		this.country_Code = country_Code;
	}

	public List<State> getStates() {
		return states;
	}

	public void setStates(List<State> states) {
		this.states = states;
	}

}
