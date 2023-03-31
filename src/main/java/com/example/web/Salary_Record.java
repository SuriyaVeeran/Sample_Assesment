package com.example.web;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "salary_breakup")
public class Salary_Record {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column
	private String basic_Pay;

	@Column
	private String house_Rent_Allowance;

	@Column
	private String dearness_Allowance;

	@Column
	private String miscellaneous;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBasic_Pay() {
		return basic_Pay;
	}

	public void setBasic_Pay(String basic_Pay) {
		this.basic_Pay = basic_Pay;
	}

	public String getHouse_Rent_Allowance() {
		return house_Rent_Allowance;
	}

	public void setHouse_Rent_Allowance(String house_Rent_Allowance) {
		this.house_Rent_Allowance = house_Rent_Allowance;
	}

	public String getDearness_Allowance() {
		return dearness_Allowance;
	}

	public void setDearness_Allowance(String dearness_Allowance) {
		this.dearness_Allowance = dearness_Allowance;
	}

	public String getMiscellaneous() {
		return miscellaneous;
	}

	public void setMiscellaneous(String miscellaneous) {
		this.miscellaneous = miscellaneous;
	}

}
